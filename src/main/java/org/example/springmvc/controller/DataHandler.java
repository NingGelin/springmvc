package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * <p>数据绑定测试</p>
 *
 * @author : ninggelin
 * @date : 2022-04-13 17:25
 **/
@Controller
@RequestMapping("/data")
public class DataHandler {
    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id) {
        return id + "";
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "num", required = false) Integer id) {
        return id + "";
    }

    @RequestMapping("/array")
    @ResponseBody
    // 调用时 多个元素逗号分隔就可以
    public String array(String[] name) {
        System.out.println(name);
        String str = Arrays.toString(name);
        return "啊山法律伺机待发";
    }
}
