package com.zzq.controller;

import com.zzq.bean.Guest;
import com.zzq.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname GuestController
 * @Description TODO
 * @Date 2020/3/23 11:28 PM
 * @Created by 张志强
 */
@RestController
public class GuestController {
    @Autowired
    private GuestService service;

    @RequestMapping("/index")
    public String selectList(){
        System.out.println(service.count());
        return "index";
    }
}
