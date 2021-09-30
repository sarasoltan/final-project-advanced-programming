package com.company;

import com.company.view.LoginWindow;

public class Main implements AutoCloseable {


    public static void main(String[] args) throws Exception{

        LoginWindow loginWindow=new LoginWindow();

    }

    @Override
    public void close() throws Exception {

    }
}
