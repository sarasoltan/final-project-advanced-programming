package com.company.controller;
import com.company.Model.Service.AgentService;
import com.company.Model.entity.AgentEntity;
import com.company.view.AgentWindow;
import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    private static LoginController ourInstance = new LoginController();

    public static LoginController getInstance() {
        return ourInstance;
    }

    public LoginController() {
    }

    public void navigator(String username,String password) throws Exception {
        List<AgentEntity> agentEntities;

        agentEntities = new ArrayList<>();
        agentEntities = AgentService.getInstance().report();


        for (int i = 0; i < agentEntities.size(); i++) {
            System.out.println(agentEntities.get(i).getPassword());
            System.out.println(agentEntities.get(i).getUsername());
            if (username.equals( agentEntities.get(i).getUsername())&& password.equals(agentEntities.get(i).getPassword())) {


            //    AgentWindow agentWindow = new AgentWindow(agentEntities.get(i));
                AgentWindow agentWindow = new AgentWindow();

            } else {

                throw new LoginException("INVALID...");
            }
        }
    }
}
