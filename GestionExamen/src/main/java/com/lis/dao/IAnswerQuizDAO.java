/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lis.dao;

import com.lis.beans.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sauld
 */
public interface IAnswerQuizDAO {
    
    public void insert(Question question) throws SQLException;

    public void update(Question question) throws SQLException;

    public void delete(int id) throws SQLException;

    public Question read(int id) throws SQLException;

    public List<Question> readAllByQuiz(int idQuiz) throws SQLException;

    public List<Question> readAllByCategory(int idCategory) throws SQLException;
    
    public List<Question> readAllByCourse(String claveCourse) throws SQLException;
    
}
