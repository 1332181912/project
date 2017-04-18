package com.webapp.service;
import com.webapp.facade.IWebapp;
import com.webapp.dao.IUserDao;
import com.webapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by yong.zhang on 2017/3/25.
 */
public class WebappImp implements IWebapp{
    @Autowired
    private IUserDao userDao;
    @Override
    public User getUser(int id)
    {
        return userDao.FindById(id);
    }
}
