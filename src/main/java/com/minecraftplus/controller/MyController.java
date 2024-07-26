package com.minecraftplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * >>>..____   _______  ___   ___
 * >/  ____|  |____  /  \  \/  /
 * |  |  .---    /  /    \  \/
 * \  \___| | ./  /___  / \  \_.
 * >`.______||_______||__/  \__|
 *
 * @create: 2024-07-18 20:20
 * @program: MinecraftPlus
 * @description:
 **/
@Controller
public class MyController {
    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
