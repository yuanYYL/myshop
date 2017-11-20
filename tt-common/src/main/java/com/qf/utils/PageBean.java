package com.qf.utils;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 14:18
 * Version:V1.0
 */
public class PageBean<T> {
    private int currentIndex;//当前页数
    private int pageSize;//一页有多少数据
    private int totalCount;//数据总数
    private int totalPage;//总页数
    private List<T> data;

    public PageBean() {
    }

    public PageBean(int currentIndex, int pageSize, int totalCount) {
        this.currentIndex = currentIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = this.totalCount%pageSize==0?this.totalCount/pageSize:this.totalCount/pageSize+1;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
