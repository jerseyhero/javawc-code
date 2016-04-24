package com.javawc.code.web.controller;

import com.javawc.code.service.UserService;
import com.javawc.code.web.controller.code.domain.user.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by sunny on 2016/4/23.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    public UserService userService;
    @RequestMapping("/index")
    public ModelAndView doIndex(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }

    @RequestMapping("/addUserPage")
    public ModelAndView addUserPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/addUserPage");
        return mv;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute Administrator user){
        ModelAndView mv = new ModelAndView();
        user.setUserId(99L);
        user.setName("围城");
        user.setSignature("哈哈");
        user.setBirthday(new Date());
        boolean result = userService.addUser(user);
        mv.setViewName("/ok");
        return mv;
    }
}
