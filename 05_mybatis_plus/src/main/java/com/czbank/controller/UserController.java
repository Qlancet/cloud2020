package com.czbank.controller;


import com.czbank.entity.User;
import com.czbank.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author scofield
 * @since 2021-06-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public boolean save(@RequestBody User user) {
        return service.save(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(@RequestBody User user) {
        return service.update(user);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public int updateAge(@PathVariable("id") Long id, @Param("age") String age) {
        return service.updateAge(id, age);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id) {
        return service.getUserById(id);
    }
}

