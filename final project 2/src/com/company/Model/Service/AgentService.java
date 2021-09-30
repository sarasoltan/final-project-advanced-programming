package com.company.Model.Service;

import com.company.Model.entity.AgentEntity;
import com.company.Model.repository.AgentRepository;

import java.util.ArrayList;
import java.util.List;

public class AgentService {
    private static AgentService ourInstance = new AgentService();

    public static AgentService getInstance() {
        return ourInstance;
    }

    private AgentService() {
    }

    //--------------INSERT------------------
    public void add(AgentEntity agentEntity) throws Exception{
        try (AgentRepository repository = new AgentRepository()) {
            repository.insert(agentEntity);
            repository.commit();
        }
    }

    //--------------EDIT------------
    public void edit(AgentEntity agentEntity) throws Exception{
        try (AgentRepository repository = new AgentRepository()) {
            repository.update(agentEntity);
            repository.commit();
        }
    }

    //--------------REMOVE-------------
    public void remove(String username) throws Exception{
        try (AgentRepository repository = new AgentRepository()) {
            repository.delete(username);
            repository.commit();
        }
    }

    //----------------REPORT------------
    public List<AgentEntity> report() throws Exception{
        List<AgentEntity> list = new ArrayList<>();
        try (AgentRepository repository = new AgentRepository()){
            list = repository.select();
            repository.commit();
        }
        return list;
    }
}
