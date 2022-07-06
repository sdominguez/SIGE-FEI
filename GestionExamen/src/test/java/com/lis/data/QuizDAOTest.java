/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.lis.data;

import com.lis.beans.Quiz;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sauld
 */
public class QuizDAOTest {
    
    public QuizDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class QuizDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Quiz quiz = null;
        QuizDAO instance = new QuizDAO();
        instance.insert(quiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class QuizDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Quiz quiz = null;
        QuizDAO instance = new QuizDAO();
        instance.update(quiz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class QuizDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        int id = 0;
        QuizDAO instance = new QuizDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class QuizDAO.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        int id = 0;
        QuizDAO instance = new QuizDAO();
        Quiz expResult = null;
        Quiz result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAllByCourse method, of class QuizDAO.
     */
    @Test
    public void testReadAllByCourse() throws Exception {
        System.out.println("readAllByCourse");
        QuizDAO instance = new QuizDAO();
        List<Quiz> expResult = null;
        List<Quiz> result = instance.readAllByCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAllByProfesor method, of class QuizDAO.
     */
    @Test
    public void testReadAllByProfesor() throws Exception {
        System.out.println("readAllByProfesor");
        String username = "";
        QuizDAO instance = new QuizDAO();
        List<Quiz> expResult = null;
        List<Quiz> result = instance.readAllByProfesor(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
