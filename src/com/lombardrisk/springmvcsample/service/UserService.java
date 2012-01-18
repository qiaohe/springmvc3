package com.lombardrisk.springmvcsample.service;

import com.lombardrisk.springmvcsample.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: johnson
 * Date: 1/3/12
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    public List<User> getUsers();
}
