package com.dbsun.controller.background;

import com.dbsun.base.BaseController;
import com.dbsun.entity.system.Page;
import com.dbsun.entity.system.PageData;
import com.dbsun.service.SysUserService;
import com.dbsun.service.background.BacService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台管理
 * @author DongZai
 *
 */
@Controller
@RequestMapping("/bac_")
@SuppressWarnings("unused")
public class BacController extends BaseController {

    @Autowired
    private BacService bacService;

    @RequestMapping("/addAssemble/{menuId}")
    @ResponseBody
    public JSONObject addAssemble(@PathVariable(value = "menuId") String menuId){
        PageData pd = new PageData();
        pd.put("menu_id", menuId);
        return this.getSucJson(bacService.addAssemble(this.putUserIdPd(pd)));
    }

    @RequestMapping("/addAssembleMem/{assembleId}")
    @ResponseBody
    public JSONObject addAssembleMem(
                                  @PathVariable(value = "assembleId") String assembleId){
        PageData pd = new PageData();
        pd.put("assemble_id", assembleId);
        return this.getSucJson(bacService.addAssembleMem(this.putUserIdPd(pd)));
    }

    @RequestMapping("/getPageAssembles")
    @ResponseBody
    public JSONObject getPageAssembles(){
        PageData pd = this.getPageData();

        Page page = this.getPage();
        page.setPd(pd);

        return viewReturnPageData(page, bacService.getPageAssembles(page));
    }


    @RequestMapping("/addMenuBrowse/{menuId}")
    @ResponseBody
    public JSONObject addMenuBrowse(@PathVariable(value = "menuId") String menuId){
        PageData pd = new PageData();
        pd.put("menu_id", menuId);
        return this.getSucJson(bacService.addMenuBrowse(this.putUserIdPd(pd)));
    }

    @RequestMapping("/getMenuBrowses")
    @ResponseBody
    public JSONObject getMenuBrowses(){
        PageData pd = this.getPageData();

        Page page = this.getPage();
        page.setPd(pd);

        return this.viewReturnPageData(page, bacService.getMenuBrowses(page));
    }
    @RequestMapping("/addMenuCollection/{menuId}")
    @ResponseBody
    public JSONObject addMenuCollection(@PathVariable(value = "menuId") String menuId){
        PageData pd = new PageData();
        pd.put("menu_id", menuId);
        return this.getSucJson(bacService.addMenuCollection(this.putUserIdPd(pd)));
    }

    @RequestMapping("/getMenuNum/{menuId}")
    @ResponseBody
    public JSONObject getMenuNum(@PathVariable(value = "menuId") String menuId){
        PageData pd = new PageData();
        pd.put("menu_id", menuId);
        return this.getSucJson(bacService.getMenuNum(pd));
    }

    @RequestMapping("/getPageMenuCollections")
    @ResponseBody
    public JSONObject getPageMenuCollections(){
        PageData pd = this.getPageData();

        Page page = this.getPage();
        page.setPd(pd);

        return this.viewReturnPageData(page, bacService.getPageMenuCollections(page));
    }


    @RequestMapping("/addMenuComment/{menuId}/{content}")
    @ResponseBody
    public JSONObject addMenuComment(@PathVariable(value = "menuId") String menuId,
                                     @PathVariable(value = "content") String content){
        PageData pd = new PageData();
        pd.put("menu_id", menuId);
        pd.put("content", content);
        return this.getSucJson(bacService.addMenuComment(this.putUserIdPd(pd)));
    }

    @RequestMapping("/getPageMenuComments")
    @ResponseBody
    public JSONObject getPageMenuComments(){
        PageData pd = this.getPageData();

        Page page = this.getPage();
        page.setPd(pd);

        return this.viewReturnPageData(page, bacService.getPageMenuComments(page));
    }

    @RequestMapping("/getPageHomeMenus")
    @ResponseBody
    public JSONObject getPageHomeMenus(){
        PageData pd = this.getPageData();

        Page page = this.getPage();
        page.setPd(pd);

        return this.viewReturnPageData(page, bacService.getPageHomeMenus(page));
    }

    @RequestMapping("/getMenuById/{fId}")
    @ResponseBody
    public JSONObject getMenuById(@PathVariable(value = "fId") String fId){
        PageData pd = new PageData();
        pd.put("f_id", fId);
        return this.getSucJson(bacService.getMenuById(pd));
    }

    @RequestMapping("/getMenuStapleById/{fId}")
    @ResponseBody
    public JSONObject getMenuStapleById(@PathVariable(value = "fId") String fId){
        PageData pd = new PageData();
        pd.put("f_id", fId);
        return this.getSucJson(bacService.getMenuStapleById(pd));
    }

    @RequestMapping("/getMenuSeasoningById/{fId}")
    @ResponseBody
    public JSONObject getMenuSeasoningById(@PathVariable(value = "fId") String fId){
        PageData pd = new PageData();
        pd.put("f_id", fId);
        return this.getSucJson(bacService.getMenuSeasoningById(pd));
    }

    @RequestMapping("/getMenuStepsById/{fId}")
    @ResponseBody
    public JSONObject getMenuStepsById(@PathVariable(value = "fId") String fId){
        PageData pd = new PageData();
        pd.put("f_id", fId);
        return this.getSucJson(bacService.getMenuStepsById(pd));
    }

    @RequestMapping("/updateFoodHrefUrlById/{id}/{status}")
    @ResponseBody
    public JSONObject updateFoodHrefUrlById(@PathVariable(value = "id") String id,
                                            @PathVariable(value = "status") String status){
        PageData pd = new PageData();
        pd.put("id", id);
        pd.put("status", status);
        return this.getAddOrUpdJson(bacService.updateFoodHrefUrlById(pd));
    }


}
