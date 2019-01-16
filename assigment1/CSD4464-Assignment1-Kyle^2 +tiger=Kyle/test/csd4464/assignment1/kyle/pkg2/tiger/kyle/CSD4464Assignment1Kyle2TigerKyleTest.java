/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.kyle.pkg2.tiger.kyle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0710986
 */
public class CSD4464Assignment1Kyle2TigerKyleTest {
    
    public CSD4464Assignment1Kyle2TigerKyleTest() {
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
     * Test of main method, of class CSD4464Assignment1Kyle2TigerKyle.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CSD4464Assignment1Kyle2TigerKyle.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPower method, of class CSD4464Assignment1Kyle2TigerKyle.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String s = "";
        int i = 0;
        String expResult = "";
        String result = CSD4464Assignment1Kyle2TigerKyle.stringPower(s, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
