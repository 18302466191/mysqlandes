package com.liang.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangBiyin
 * @Description:
 * @Date: Create in 16:53 2019/10/24
 */
@RestController
public class HomeController {
    @GetMapping("/index")
    public String  index(){
        return "index";
    }
}
