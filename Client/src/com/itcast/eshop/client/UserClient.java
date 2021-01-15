package com.itcast.eshop.client;

import cn.itcast.eshop.common.entity.Msg;
import cn.itcast.eshop.common.util.JSONUtil;
import com.itcast.eshop.user.action.UserAction;

import java.util.Scanner;

// User interface
public class UserClient extends Client{

   public String showLogin(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please input username");
       String username = sc.nextLine();
       System.out.println("Please input password");
       String password = sc.nextLine();

       //Send request to server
       // use setter method pass data to controller
       UserAction userAction = new UserAction();
       userAction.setUsername(username);
       userAction.setPassword(password);

       // call action login()
       String result = userAction.login();
       Msg msg = JSONUtil.JSONToEntity(result, Msg.class);
       if(msg.getType().equals(Msg.SUCCESS)){
           System.out.println("Successfully login");
           return INDEX;
       }else{
           System.out.println("fail to login");
           return LOGIN;
       }

    }
}
