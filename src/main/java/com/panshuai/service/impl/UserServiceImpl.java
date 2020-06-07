package com.panshuai.service.impl;

import com.panshuai.entity.User;
import com.panshuai.mapper.UserMapper;
import com.panshuai.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author panan
 * @since 2020-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
