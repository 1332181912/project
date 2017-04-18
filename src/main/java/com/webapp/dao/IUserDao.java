package com.webapp.dao;

/**
 * Created by yong.zhang on 2017/3/22.
 */
import com.webapp.model.User;

public interface IUserDao {
    public User FindById(int id);
}
