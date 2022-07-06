/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAPI;

import com.lis.beans.Quiz;
import com.lis.dao.IQuizDAO;
import com.lis.data.QuizDAO;
import java.sql.SQLException;

/**
 *
 * @author sauld
 */
public class TestRegistroQuiz {
    
    public static void main(String[] args) throws SQLException {
        
        Quiz quiz = new Quiz();
        
        //'Parcial 1 DA', 'Primer examen parcial de la EE Desarrollo de Aplicaciones 2022', '2022-07-20 10:00', '2022-07-20 13:00', '70', '1', '1', 'DA4789', 'sauldominguez'
        
        quiz.setName("Parcial 2 DSR");
        quiz.setDescription("Segundo examen parcial de la EE Desarrollo de Sistemas en Ren 2022");
        quiz.setOpen_date("2022-08-16 10:00");
        quiz.setClose_date("2022-08-16 14:00");
        quiz.setTime_minutes(90);
        quiz.setStatus_id(1);
        quiz.setType_quiz_id(1);
        quiz.setCourse_clave("DSR789456");
        quiz.setProfessor("sauldominguez");
        
        QuizDAO quizdao = new QuizDAO();
        quizdao.insert(quiz);
        
    }
    
}
