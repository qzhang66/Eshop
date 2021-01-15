package com.itcast.eshop.user.action;

import cn.itcast.eshop.common.action.BaseAction;
import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import com.itcast.eshop.user.entity.User;

// UserController handler all user actions and return JSON string

public class UserAction extends BaseAction {

    private String username;
    private String password;

    // user login
    public String login(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        Msg msg = new Msg();
        msg.setType(Msg.FAIL);
        msg.setMsg("This is return message");
        return JSONUtil.entityToJSON(msg);
    }

    public String getUsername() {
        return username;
    }

    public UserAction setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAction setPassword(String password) {
        this.password = password;
        return this;
    }
}
