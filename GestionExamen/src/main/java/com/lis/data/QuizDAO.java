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
            
            String insertQuery = "INSERT INTO quiz (name, description, open_date, close_date, "
                    + "time_minutes, type_quiz_id, status_id, course_clave, professor) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            // enviar el commando insert
            ps.setString(1, quiz.getName());
            ps.setString(2, quiz.getDescription());
            ps.setString(3, quiz.getOpen_date().toString());
            ps.setString(4, quiz.getClose_date().toString());
            ps.setInt(5, quiz.getTime_minutes());
            ps.setInt(6, quiz.getStatus_id());
            ps.setString(7, quiz.getCourse_clave());
            ps.setString(8, quiz.getProfessor());
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
