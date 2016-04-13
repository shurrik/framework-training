package com.shurrik.multi.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shurrik.multi.model.User;
import com.shurrik.multi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HomeAction{


    @Autowired
    private IUserService userService;

    @RequestMapping(value="/")
    public String home(ModelMap model,HttpServletRequest request,HttpServletResponse response){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "index";
    }


}
