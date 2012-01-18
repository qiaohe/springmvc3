package com.lombardrisk.springmvcsample.service;

import com.lombardrisk.springmvcsample.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: johnson
 * Date: 1/3/12
 * Time: 12:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Value("#{appProperties.loopercount}")
    private int looper;
    @Override
    public List<User> getUsers() {
        List<User> result = new ArrayList<User>();
        for(int i = 0 ; i <looper; i++) {
            User u = new User();
            u.setEnabled(true);
            u.setUserName("Dummy User:" + i);
            u.setPassword("Password");
            u.setBirthDate(new Date());
            result.add(u);
        }
        return result;
    }
}
