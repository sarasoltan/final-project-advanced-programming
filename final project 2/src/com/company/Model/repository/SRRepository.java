package com.company.Model.repository;
import com.company.Model.entity.AgentEntity;
import com.company.Model.entity.SREntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SRRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    //------------CONSTRUCTOR-------------
    public SRRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sara", "myjava123");
        connection.setAutoCommit(false);
    }

    //-------------INSERTION---------------



    public void insert(SREntity srEntity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into srinfo(sname,rname,radd,rdate,spcode,rpcode,sdate,stime) " +
                "values (?, ?,?,?,?,?,?,?)");
        preparedStatement.setString(1,srEntity.getSname());
        preparedStatement.setString(2, srEntity.getRname());
        preparedStatement.setString(3,srEntity.getRadd());
        preparedStatement.setLong(4,srEntity.getRdate());
        preparedStatement.setLong(5,srEntity.getSpcode());
        preparedStatement.setLong(6,srEntity.getRpcode());
        preparedStatement.setLong(7,srEntity.getSdate());
        preparedStatement.setLong(8,srEntity.getStime());
        preparedStatement.executeUpdate();
    }

    //------------UPDATE-------------------
    public void update(SREntity srEntity) throws Exception{
        preparedStatement = connection.prepareStatement("UPDATE srinfo SET sdate =?, stime=? where sname=? ");
     //   preparedStatement.setString(1,srEntity.getSname() );
      //  preparedStatement.setString(2, srEntity.getRname());
      //  preparedStatement.setString(3,srEntity.getRadd());
      //  preparedStatement.setLong(4,srEntity.getRdate());
      //  preparedStatement.setLong(5,srEntity.getRpcode());
      //  preparedStatement.setLong(6,srEntity.getSpcode());
        preparedStatement.setLong(1,srEntity.getSdate());
        preparedStatement.setLong(2,srEntity.getStime());
        preparedStatement.setString(3,srEntity.getSname() );
        preparedStatement.executeUpdate();
    }

    //--------------DELETE----------------
    public void delete(String sname) throws Exception{
        preparedStatement = connection.prepareStatement("delete from srinfo where srname = ?");
        preparedStatement.setString(1, sname);
        preparedStatement.executeUpdate();
    }

    //--------------SELECTION-----------------


    public List<SREntity> select() throws Exception{
        List<SREntity> entities = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from srinfo");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            entities.add(new SREntity().
                    setSname(resultSet.getString("sender name"))
                    .setRname(resultSet.getString("receiver name"))
                    .setRadd(resultSet.getString("receiver address"))
                    .setRdate(resultSet.getLong("received date"))
                    .setRpcode(resultSet.getLong("receiver postal code"))
                    .setSpcode(resultSet.getLong("sender postal code")));


        }
        return entities;
    }


    //---------------CLOSE---------------
    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }

    //----------------COMMIT-----------------
    public void commit() throws Exception{
        connection.commit();
    }

    //------------ROLL BACK--------------
    public void rollback() throws Exception{
        connection.rollback();
    }
}
