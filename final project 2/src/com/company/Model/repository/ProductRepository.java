package com.company.Model.repository;

import com.company.Model.entity.ProductEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Sara on 1/2/2020.
 */
public class ProductRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    //------------CONSTRUCTOR-------------
    public ProductRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sara", "myjava123");
        connection.setAutoCommit(false);
    }

    //-------------INSERTION---------------



    public void insert(ProductEntity productEntity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into product(name,weight,value) values (?, ?,?)");
        preparedStatement.setString(1,productEntity.getName());
        preparedStatement.setLong(2,productEntity.getWeight());
        preparedStatement.setLong(3,productEntity.getValue());
        preparedStatement.executeUpdate();
    }

    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }

    //----------------COMMIT-----------------
    public void commit() throws Exception{
        connection.commit();
    }
}
