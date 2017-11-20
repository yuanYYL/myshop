package com.qf.myshop.service;

import com.qf.myshop.pojo.po.TbItem;
import com.qf.myshop.pojo.vo.QueryVo;
import com.qf.utils.PageBean;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 14:03
 * Version:V1.0
 */
public interface ItemService {
        public PageBean<TbItem> findByPage(QueryVo vo);


}
