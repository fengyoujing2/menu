package com.dbsun.service.background;

import com.dbsun.entity.system.Page;
import com.dbsun.entity.system.PageData;
import com.dbsun.mapper.SysUserMapper;
import com.dbsun.mapper.background.BacMapper;
import com.dbsun.util.Tools;
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
    public PageData getMenuNum(PageData pd){
        return bacMapper.getMenuNum(pd);
    }
    public List<PageData> getPageHomeMenus(Page page){
        return bacMapper.getPageHomeMenus(page);
    }

    public PageData getMenuById(PageData pd){
        return bacMapper.getMenuById(pd);
    }

    public List<PageData> getMenuStapleById(PageData pd){
        return bacMapper.getMenuStapleById(pd);
    }

    public List<PageData> getMenuSeasoningById(PageData pd){
        return bacMapper.getMenuSeasoningById(pd);
    }

    public List<PageData> getMenuStepsById(PageData pd){
        return bacMapper.getMenuStepsById(pd);
    }





}
