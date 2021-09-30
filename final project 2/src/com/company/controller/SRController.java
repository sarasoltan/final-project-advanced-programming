package com.company.controller;

import com.company.Model.Service.AgentService;
import com.company.Model.Service.ProductService;
import com.company.Model.Service.SRService;
import com.company.Model.entity.AgentEntity;
import com.company.Model.entity.ProductEntity;
import com.company.Model.entity.SREntity;
import com.company.view.AgentWindow;

import javax.security.auth.login.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sara on 12/31/2019.
 */
public class SRController {
    private static SRController ourInstance = new SRController();

    public static SRController getInstance() {
        return ourInstance;
    }

    public SRController() {
    }
    public void adding(String sname,long sdate,long stime) throws Exception {
        SREntity srEntity;
        try {

            SRService.getInstance().edit(new SREntity() .setSname(sname).setSdate(sdate).setStime(stime));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println ("Failed to add!"+e.getMessage ());
        }
    }

    public void adding(String sname,String rname,String radd,long rdate,long spcode,long rcode) throws Exception {
        System.out.println(sname);
        SREntity srEntity;

            try {
            SRService.getInstance().add (new SREntity ( ).setSname(sname).setRname(rname).setRadd(radd).setRdate(rdate).setSpcode(spcode).setRpcode(spcode));

            System.out.println ("saved successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println ("Failed to add!"+e.getMessage ());
        }
        }
    }

