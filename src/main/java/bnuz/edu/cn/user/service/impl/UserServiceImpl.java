package bnuz.edu.cn.user.service.impl;

import bnuz.edu.cn.user.entity.User;
import bnuz.edu.cn.user.mapper.UserMapper;
import bnuz.edu.cn.user.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getUser(user);
    }
}
