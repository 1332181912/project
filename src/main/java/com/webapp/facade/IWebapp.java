package com.webapp.facade;

import com.webapp.model.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by yong.zhang on 2017/3/25.
 */
public interface IWebapp {
    public User getUser(int id);
}
