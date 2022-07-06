/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lis.data;

import com.lis.beans.Quiz;
import com.lis.connection.MySQLConnection;
import com.lis.dao.IQuizDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sauld
 */
public class QuizDAO implements IQuizDAO{
    
    private Connection conn;
    private MySQLConnection mysqlConn;
    private final String TABLE_NAME = "quiz";

    public QuizDAO() {
        mysqlConn = new MySQLConnection();
    }
    
    

    @Override
    public void insert(Quiz quiz) throws SQLException {
        try {
            // abrir la conexion
            conn = mysqlConn.getConnection();
            String insertQuery = "INSERT INTO "+TABLE_NAME+" (name)"
                    + "VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            // enviar el commando insert
            ps.setString(1, actor.getName());
            ps.executeUpdate();
            conn.close();
        } catch (ClassNotFoundException ex) {
        }
    }

    @Override
    public void update(Quiz quiz) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Quiz read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Quiz> readAllByCourse() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Quiz> readAllByProfesor(String username) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
