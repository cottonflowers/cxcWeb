package com.huawei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.dao.UserDao;
import com.huawei.domain.User;

@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    public User getUserById(Integer userId) {  
        return userDao.getUserById(userId);  
          
    }  
  
} 
