/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ration_distribution_system;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VINAYAK
 */
public class view_p_allocated_hisTest {
    
    public view_p_allocated_hisTest() {
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
     * Test of updateTable method, of class view_p_allocated_his.
     */
    @Test
    public void testUpdateTable() {
        System.out.println("updateTable");
        ResultSet resultSet = null;
        view_p_allocated_his instance = new view_p_allocated_his();
        instance.updateTable(resultSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class view_p_allocated_his.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        view_p_allocated_his.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
