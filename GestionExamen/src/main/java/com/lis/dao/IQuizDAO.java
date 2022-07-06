package com.lis.dao;

import com.lis.beans.Quiz;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sdominguez
 */
public interface IQuizDAO {
    
    public void insert(Quiz quiz) throws SQLException;

    public void update(Quiz quiz) throws SQLException;

    public void delete(int id) throws SQLException;

    public Quiz read(int id) throws SQLException;

    public List<Quiz> readAllByCourse() throws SQLException;

    public List<Quiz> readAllByProfesor(String username) throws SQLException;
    
}
