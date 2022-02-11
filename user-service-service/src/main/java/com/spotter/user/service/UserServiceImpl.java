package com.spotter.user.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

import com.spotter.user.dao.dataobject.UserDO;
import com.spotter.user.dao.mapper.UserMapper;
import com.spotter.user.api.UserService;
import com.spotter.user.api.model.UserModel;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@DubboService(protocol = "rest")
public class UserServiceImpl implements UserService {

    public String getUserName() {
        return "user";
    }
}
