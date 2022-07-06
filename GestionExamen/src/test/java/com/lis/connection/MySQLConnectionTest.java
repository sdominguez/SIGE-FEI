/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.lis.connection;

import java.sql.Connection;
import java.util.Properties;
import static org.junit.Assert.*;

/**
 *
 * @author sauld
 */
public class MySQLConnectionTest {
    
    public MySQLConnectionTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of getConnection method, of class MySQLConnection.
     */
    @org.junit.Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        MySQLConnection instance = new MySQLConnection();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPropertiesFile method, of class MySQLConnection.
     */
    @org.junit.Test
    public void testReadPropertiesFile() {
        System.out.println("readPropertiesFile");
        String fileName = "";
        Properties expResult = null;
        Properties result = MySQLConnection.readPropertiesFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
