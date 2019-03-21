package com.dbsun.controller;

import com.dbsun.base.BaseController;
import com.dbsun.config.AllConfig;
import com.dbsun.entity.Loginlog;
import com.dbsun.entity.system.PageData;
import com.dbsun.service.SysUserService;
import com.dbsun.util.CookieUtils;
import com.dbsun.util.RedisSessionUtil;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController extends BaseController {
    @Autowired
    private SysUserService sysuserService;
    @Autowired
    private RedisSessionUtil redisSessionUtil;

//    @RequestMapping("/login")
//    public String login() {
//        return "idx_login";
//    }

    /*@RequestMapping("/index")
    public String index(ModelMap model) {
        //验证session是否有效
        HttpSession session = request.getSession();
        PageData user = (PageData) session.getAttribute(AllConfig.SESSION_KEY);
        if (user != null) {
            //先读取session里面是否包含菜单，如果包含则直接使用，不包含则重新获取并设置进入session
            model.addAttribute("name", user.getString("NAME"));//用户名称
            return "index";
        } else {
            //返回到首页
            return "login";
        }

    }*/

    @RequestMapping("/loginPost/{account}/{password}")
    public @ResponseBody
    Map<String, Object> loginPost(@RequestParam("account") String account,
                                  @RequestParam("password") String password,
                                  HttpSession session, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        PageData pd = new PageData();//前端传入数据
        pd.put("USERNAME", account);
        pd.put("PASSWORD", password);
        //获取浏览器信息  2018/06/07 修改
        Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
        //获取浏览器版本号
        Version version = browser.getVersion(request.getHeader("User-Agent"));
        String versionInfo = null;
        try {
            versionInfo = browser.getName() + "/" + version.getVersion();
        } catch (NullPointerException e) {
        }

        //获取用户信息
        PageData user = sysuserService.getLoginValidation(pd);
        if (user == null) {
            map.put("msg", "500");
            map.put("result", "密码错误");
            return map;
        } else {
                //判定当前用户是否已经登录过，如果登录不让重新登录
                PageData userPd = (PageData) session.getAttribute(AllConfig.SESSION_KEY);
                user.put("version", versionInfo);//浏览器版本号
                if (userPd != null) {//表示登录过则不需要多次登录直接提醒!
                    map.put("msg", "200");
                    map.put("result", "你已经登录过无需再次登录!");
                } else {
                    System.out.println(session.getAttribute(AllConfig.SESSION_KEY));
                    //谦容夸浏览器保证只有1个用户 2018/06/07
                    redisSessionUtil.checkUserIsLoggin(user.getString("USERNAME"));
                    session.setAttribute(AllConfig.SESSION_KEY, user);
                    session.setMaxInactiveInterval(2 * 3600);  // Session保存两小时

                    CookieUtils.setCookie(response, "identify_key2019319154652", account);
                    // 客户端的JSESSIONID也保存两小时
                    CookieUtils.setCookie(response, "JSESSIONID", session.getId(), 2 * 3600);

                    Loginlog log = new Loginlog();
                    map.put("msg", "200");
                    map.put("result", "登录成功!");

                }
        }

        return map;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session账户信息
        session.removeAttribute(AllConfig.SESSION_KEY);
        //清除redisSession
        redisSessionUtil.delUserSession(session.getId());
        //清除redis 会话
        session.invalidate();

        return "login";
    }

    @RequestMapping("/registerUser/{userName}/{password}")
    @ResponseBody
    public JSONObject registerUser(@RequestParam("userName") String userName,
                                   @RequestParam("password") String password){
        PageData pd = new PageData();
        pd.put("USERNAME", userName);
        pd.put("PASSWORD", password);
        return this.getAddOrUpdJson(sysuserService.registerUser(pd));
    }

    @RequestMapping("/getSessionBac")
    @ResponseBody
    public JSONObject getSessionBac(){
        return this.getSucJson(session.getAttribute(AllConfig.SESSION_KEY));
    }

}
