package com.shurrik.demo.service.impl;

import com.shurrik.demo.dao.IUserDAO;
import com.shurrik.demo.model.User;
import com.shurrik.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lip on 2016-04-14.
 */
@SuppressWarnings("unchecked")
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDAO iUserDAO;

    public List<User> findAll() {
        return iUserDAO.findAll();
    }
}
