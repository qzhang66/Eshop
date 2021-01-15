package com.itcast.eshop.user.service;

import com.itcast.eshop.user.entity.User;

public interface userService {
    User login(User user) throws Exception;
}
