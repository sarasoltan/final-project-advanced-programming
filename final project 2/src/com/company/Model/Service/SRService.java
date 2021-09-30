package com.company.Model.Service;
import com.company.Model.entity.SREntity;
import com.company.Model.repository.SRRepository;

import java.util.ArrayList;
import java.util.List;

public class SRService {
    private static SRService ourInstance = new SRService();

    public static SRService getInstance() {
        return ourInstance;
    }

    private SRService() {
    }

    //--------------INSERT------------------

    public void add(SREntity srEntity) throws Exception{
        try (SRRepository repository = new SRRepository()) {
            repository.insert(srEntity);
            repository.commit();
        }
    }


    //--------------EDIT------------
    public void edit(SREntity srEntity) throws Exception{
        try (SRRepository repository = new SRRepository()) {
            repository.update(srEntity);
            repository.commit();
        }
    }

    //--------------REMOVE-------------
    public void remove(String sname) throws Exception{
        try (SRRepository repository = new SRRepository()) {
            repository.delete(sname);
            repository.commit();
        }
    }

    //----------------REPORT------------
    public List<SREntity> report() throws Exception{
        List<SREntity> list = new ArrayList<>();
        try (SRRepository repository = new SRRepository()){
            list = repository.select();
            repository.commit();
        }
        return list;
    }
}
