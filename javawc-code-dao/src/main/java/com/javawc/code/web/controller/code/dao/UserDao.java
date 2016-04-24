package com.javawc.code.web.controller.code.dao;

import com.javawc.code.web.controller.code.domain.user.User;

/**用户模块DAO
 * Created by sunny on 2016/3/3.
 */
public interface UserDao {
    public boolean addUser(User user);
    public boolean updateUser(User user);
    public boolean deleteAdministrator(Long id);
    public User queryUser(User user);
}
