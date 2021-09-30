package com.company.Model.repository;
import com.company.Model.entity.AgentEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgentRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    //------------CONSTRUCTOR-------------
    public AgentRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sara", "myjava123");
        connection.setAutoCommit(false);
    }


    //-------------INSERTION---------------
    public void insert(AgentEntity agentEntity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into agent(username, password) " +
                "values (?, ?)");
        preparedStatement.setString(1, agentEntity.getUsername());
        preparedStatement.setString(2, agentEntity.getPassword());

        preparedStatement.executeUpdate();
    }

    //------------UPDATE-------------------
    public void update(AgentEntity agentEntity) throws Exception{
        preparedStatement = connection.prepareStatement("update from agent set username = ?" + "password=?");
        preparedStatement.setString(1, agentEntity.getUsername());
        preparedStatement.setString(2, agentEntity.getPassword());
        preparedStatement.executeUpdate();
    }

    //--------------DELETE----------------
    public void delete(String username) throws Exception{
        preparedStatement = connection.prepareStatement("delete from agent where username = ?");
        preparedStatement.setString(1, username);
        preparedStatement.executeUpdate();
    }

    //--------------SELECTION-----------------


    public List<AgentEntity> select() throws Exception{
        List<AgentEntity> entities = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from agent");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            entities.add(new AgentEntity().
                    setUsername(resultSet.getString("username")).
                    setPassword(resultSet.getString("password")));

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
