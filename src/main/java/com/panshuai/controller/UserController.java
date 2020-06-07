package com.panshuai.controller;


import com.panshuai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author panan
 * @since 2020-06-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;


    @GetMapping("/{id}")
    public Object getUserId(@PathVariable("id") Long id){
        System.err.println("=========");
        return userService.getById(id);

    }
}
