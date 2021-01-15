package com.itcast.eshop.client;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Client {
    public static final String LOGIN = "L";
    public static final String HISTORY = "I";
    public static final String INDEX = "I";

    public static void main(String[] args) {
        Client c = new Client();
        c.start();

    }

    public void start(){
        UserClient userClient = new UserClient();
        String result = userClient.showLogin();

        if(result.equals(INDEX)){
            //Home page
            System.out.println("Here is home page");
        }else if (result.equals(HISTORY)){
            System.out.println("Here is history page");
        }else if (result.equals(LOGIN)){
            System.out.println("This is LOGIN page");
        }else{
            System.out.println("This is error page");
        }

    }

}
