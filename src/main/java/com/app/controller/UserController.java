package com.app.controller;

import com.app.dao.UserDAO;
import com.app.dao.UserDAOImpl;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody User user)
    {
        userDAO.save(user);
        return user;
    }

    @RequestMapping(value = "/getUser" )
    public List<User> getUser()
    {
        return userDAO.getAll();
    }

    @RequestMapping(value="/deleteUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User removeUser(@RequestBody User user)
    {
        userDAO.deleteUser(user);
        return user;
    }

    @RequestMapping(value="/updateUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user)
    {
        userDAO.updateUser(user);
        return user;
    }
}

