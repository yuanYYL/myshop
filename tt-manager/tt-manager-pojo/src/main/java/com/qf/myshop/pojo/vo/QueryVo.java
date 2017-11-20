package com.qf.myshop.pojo.vo;

import com.qf.myshop.pojo.po.TbItem;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 15:04
 * Version:V1.0
 */
public class QueryVo {
    private TbItem item;
    private int currentIndex;
    private int startIndex;
    private int pageSize;

    public TbItem getItem() {
        return item;
    }

    public void setItem(TbItem item) {
        this.item = item;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getStartIndex() {
        return startIndex=(this.currentIndex-1)*pageSize;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
