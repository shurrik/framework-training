package com.shurrik.single.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
public class HomeAction{


    @RequestMapping(value="/")
    public String home(ModelMap model,HttpServletRequest request,HttpServletResponse response){
        Date date = new Date();
        model.addAttribute("now",date);
        return "index";
    }

}
