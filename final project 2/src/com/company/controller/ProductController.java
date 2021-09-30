package com.company.controller;

import com.company.Model.Service.ProductService;
import com.company.Model.Service.SRService;
import com.company.Model.entity.ProductEntity;
import com.company.Model.entity.SREntity;

/**
 * Created by Sara on 1/2/2020.
 */
public class ProductController {
    private static ProductController ourInstance = new ProductController();

    public static ProductController getInstance() {
        return ourInstance;
    }

    public ProductController() {
    }


    public void adding(String name,long weight,long value) throws Exception {

        ProductEntity productEntity;

        try {
            ProductService.getInstance().add (new ProductEntity ( ).setName(name).setWeight(weight).setValue(value));
            System.out.println ("saved successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println ("Failed to add!"+e.getMessage ());
        }
    }
}
