/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fdepadua
 */
public class DivideTest {
    
    public DivideTest() {
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

    @Test
    public void testQuotient() {
        System.out.println("quotient");
        int numerator = 0;
        int denominator = 0;
        Divide instance = new Divide();
        int expResult = 0;
        int result = instance.quotient(numerator, denominator);
        assertEquals(expResult, result);
        numerator = 10;
        denominator = 2;
        expResult = 5;
        result = instance.quotient(numerator, denominator);
        assertEquals(expResult,result);
    }
    
}
