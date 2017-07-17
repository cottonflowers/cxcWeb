package com.huawei.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huawei.baseTest.SpringTestCase;
import com.huawei.domain.User;

public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void getUserByIdTest(){  
        User user = userService.getUserById(1);  
        logger.debug("²éÕÒ½á¹û" + user);  
    }  
      
}
