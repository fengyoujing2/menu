package com.dbsun.service.background;

import com.dbsun.entity.system.Page;
import com.dbsun.entity.system.PageData;
import com.dbsun.mapper.SysUserMapper;
import com.dbsun.mapper.background.BacMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacService{

    @Autowired
    private BacMapper bacMapper;

    public int addAssemble(PageData pd){
        return bacMapper.addAssemble(pd);
    }

    public int addAssembleMem(PageData pd){
        return bacMapper.addAssembleMem(pd);
    }
    public List<PageData> getPageAssembles(Page page){
        return bacMapper.getPageAssembles(page);
    }



    public int addMenuBrowse(PageData pd){
        return bacMapper.addMenuBrowse(pd);
    }
    public List<PageData> getMenuBrowses(Page page){
        return bacMapper.getMenuBrowses(page);
    }
    public int addMenuCollection(PageData pd){
        return bacMapper.addMenuCollection(pd);
    }
    public List<PageData> getPageMenuCollections(Page page){
        return bacMapper.getPageMenuCollections(page);
    }
    public int addMenuComment(PageData pd){
        return bacMapper.addMenuComment(pd);
    }
    public List<PageData> getPageMenuComments(Page page){
        return bacMapper.getPageMenuComments(page);
    }
    public List<PageData> getPageHomeMenus(Page page){
        return bacMapper.getPageHomeMenus(page);
    }

    public PageData getMenuById(PageData pd){

        PageData menuPd = new PageData();

        menuPd.putAll(bacMapper.getMenuStapleById(pd));
        menuPd.putAll(bacMapper.getMenuSeasoningById(pd));
        menuPd.putAll(bacMapper.getMenuStepsById(pd));
        // 多个主键都为ID，最重要的是详情ID，放在最后
        menuPd.putAll(bacMapper.getMenuById(pd));

        return menuPd;
    }



}
