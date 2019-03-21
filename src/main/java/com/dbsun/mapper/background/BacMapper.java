package com.dbsun.mapper.background;

import com.dbsun.entity.system.Page;
import com.dbsun.entity.system.PageData;

import java.util.List;

public interface BacMapper {

    public int addAssemble(PageData pd);
    public int addAssembleMem(PageData pd);
    public List<PageData> getPageAssembles(Page page);

    public int addMenuBrowse(PageData pd);
    public List<PageData> getMenuBrowses(Page page);
    public int addMenuCollection(PageData pd);
    public List<PageData> getPageMenuCollections(Page page);
    public int addMenuComment(PageData pd);
    public List<PageData> getPageMenuComments(Page page);
    public List<PageData> getPageHomeMenus(Page page);

    public PageData getMenuById(PageData pd);
    public List<PageData> getMenuStapleById(PageData pd);
    public List<PageData> getMenuSeasoningById(PageData pd);
    public List<PageData> getMenuStepsById(PageData pd);
}
