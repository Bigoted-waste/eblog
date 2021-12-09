package com.cola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController extends BaseController {

    @GetMapping("/category/{id:\\d*}")   // ':\\d*'指定参数类型为数字
    public String category(@PathVariable(name = "id") Long id){

        req.setAttribute("currentCategoryId",id);
        return "post/category";
    }

    @GetMapping("/post/{id:\\d*}")   // ':\\d*'指定参数类型为数字
    public String detail(@PathVariable(name = "id") Long id){
        return "post/detail";
    }
}
