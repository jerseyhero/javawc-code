package com.javawc.code.service.impl;

import com.javawc.code.service.UserService;
import com.javawc.code.web.controller.code.dao.UserDao;
import com.javawc.code.web.controller.code.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by sunny on 2016/4/24.
 */
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public boolean addUser(User user) {
        boolean result = false;
        try {
            result = userDao.addUser(user);
        }catch (Throwable e){
            return result;
        }
        return result;
    }
}
