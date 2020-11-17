package com.alibaba.controller;

import com.alibaba.pojo.Items;
import com.alibaba.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/17 17:41
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
@RequestMapping("/list")
    public String findAll(Model model){
        List<Items> items= itemsService.findAll ();
        model.addAttribute ("items",items);
        return "items";
    }
    @RequestMapping("save")
    public String save(Items items){
        int account = itemsService.save (items);
        return "redirect:/items/list.do";
    }
}
