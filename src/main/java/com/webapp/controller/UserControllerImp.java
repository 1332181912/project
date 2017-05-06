package com.webapp.controller;

import com.webapp.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.webapp.service.IUserService;
import com.webapp.service.UserServiceImp;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yong.zhang on 2017/3/22.
 */
@Controller
public class UserControllerImp {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerImp.class);
    @Autowired
    private IUserService service;

    @RequestMapping(value="/getUserName", method = RequestMethod.GET)
    @ResponseBody
    public String getUserName(HttpServletRequest request, int id)
    {
        System.out.println("~~~~~~~~~controller~~~~~~~~~~~");
        //id = request.getParameter("id");
        return service.getUserName(id);
    }


    @RequestMapping(value="/updateUser", method = RequestMethod.GET)
    @ResponseBody
    public int updateUser(HttpServletRequest request)
    {
        System.out.println("~~~~~~~~~controller~~~~~~~~~~~");
        User user = new User();
        user.setId(Integer.parseInt(request.getParameter("id")));
        user.setName(request.getParameter("name"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        int returnCode = service.updateUser(user);
        System.out.println("=====returncode: " + returnCode + "======");
        return returnCode;
    }
}
