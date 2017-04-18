package com.webapp.service;

import com.webapp.model.User;

/**
 * Created by yong.zhang on 2017/3/22.
 */
public interface IUserService {
    public String getUserName(int id);
    public int updateUser(User user);
    }
