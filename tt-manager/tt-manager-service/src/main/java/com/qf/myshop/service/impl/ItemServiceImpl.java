package com.qf.myshop.service.impl;

import com.qf.myshop.dao.TbItemMapper;
import com.qf.myshop.pojo.po.TbItem;
import com.qf.myshop.pojo.vo.QueryVo;
import com.qf.myshop.service.ItemService;
import com.qf.utils.MyUtils;
import com.qf.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 14:03
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public PageBean<TbItem> findByPage(QueryVo vo) {
        List<TbItem> list = itemMapper.findByPage(vo);
        int totalCount = itemMapper.findCount(vo);
        PageBean<TbItem> pageBean = new PageBean<>(vo.getCurrentIndex(),vo.getPageSize(),totalCount );
        pageBean.setData(list);
        return pageBean;
    }




}
