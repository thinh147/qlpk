package com.example.quanlyyta.controller;

import com.example.quanlyyta.service.YtaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class YtaController {
    @Autowired
    private YtaService yTaService;
}
