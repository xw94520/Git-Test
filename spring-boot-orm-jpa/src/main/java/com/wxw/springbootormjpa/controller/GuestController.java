package com.wxw.springbootormjpa.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.wxw.springbootormjpa.domain.Guest;
import com.wxw.springbootormjpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService service;
    private String path="";
    @GetMapping("")
    public String grtGuests(Model model){
        List<Guest> result= service.getGuests();
        model.addAttribute("guest",result);
        return path+"list";
    }











}
