package com.liang.es;

import com.liang.es.entity.User;
import com.liang.es.repositiory.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositioryTest extends EsApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void findOne(){
        User user = userRepository.findByName("waliwali");
        Assert.assertEquals("waliwali",user.getName());
    }
}
