package com.company.Model.Service;

import com.company.Model.entity.ProductEntity;
import com.company.Model.entity.SREntity;
import com.company.Model.repository.ProductRepository;
import com.company.Model.repository.SRRepository;

/**
 * Created by Sara on 1/2/2020.
 */
public class ProductService {
    private static ProductService ourInstance = new ProductService();

    public static ProductService getInstance() {
        return ourInstance;
    }

    private ProductService() {
    }

    //--------------INSERT------------------

    public void add(ProductEntity productEntity) throws Exception{
        try (ProductRepository repository = new ProductRepository()) {
            repository.insert(productEntity);
            repository.commit();
        }
    }
}
