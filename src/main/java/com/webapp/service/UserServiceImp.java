package com.webapp.service;

import com.webapp.dao.IUserDao;
import com.webapp.dao.UserMapper;
import com.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yong.zhang on 2017/3/22.
 */
@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private UserMapper userDao;
    //private User user;
    public String getUserName(int id){
        System.out.println("~~~~~~~~~service~~~~~~~~~~~");
        User user = userDao.selectByPrimaryKey(new Integer(id));
        return user.getName();
    }

    public int updateUser(User user){
        return userDao.updateByPrimaryKey(user);
    }

}
