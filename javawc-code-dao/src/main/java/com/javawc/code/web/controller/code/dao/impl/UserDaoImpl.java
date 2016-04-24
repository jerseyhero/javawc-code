package com.javawc.code.web.controller.code.dao.impl;

import com.javawc.code.web.controller.code.dao.UserDao;
import com.javawc.code.web.controller.code.domain.user.User;
import com.javawc.code.web.controller.code.support.MysqlDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by sunny on 2016/3/3.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    MysqlDao<User> mysqlDao;

    public boolean addUser(User user) {
        boolean result =  mysqlDao.insert("administrator.insertUser",user);
        return result;
    }

    public boolean updateUser(User user) {
//        return mysqlDao.update("updateUser",user);
        return false;
    }

    public boolean deleteAdministrator(Long id) {
//        User user = new Administrator();
//        user.setId(id);
//        return mysqlDao.delete("deleteAdministrator",user);
        return false;
    }

    public User queryUser(User user) {
//        return mysqlDao.queryForObject("queryUser",user);
        return null;
    }
}
