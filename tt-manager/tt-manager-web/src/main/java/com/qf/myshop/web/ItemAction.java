package com.qf.myshop.web;

import com.qf.myshop.pojo.po.TbItem;
import com.qf.myshop.pojo.vo.QueryVo;
import com.qf.myshop.service.ItemService;
import com.qf.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 14:04
 * Version:V1.0
 */
@Controller
public class ItemAction {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public String getByPage(QueryVo vo, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        vo.setPageSize(5);
        vo.setCurrentIndex(1);
        PageBean<TbItem> pageBean = itemService.findByPage(vo);
        request.getSession().setAttribute("pageBean",pageBean);
        return "/jsp/list.jsp";
    }

}
