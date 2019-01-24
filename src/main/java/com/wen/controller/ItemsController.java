package com.wen.controller;

import com.wen.domain.Items;
import com.wen.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.MarshalledObject;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    public String findDetail(Model model){
        Items byId = itemsService.findById(1);
        model.addAttribute("",byId);
        return "";
    }
}
