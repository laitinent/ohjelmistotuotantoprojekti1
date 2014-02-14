/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toni
 */
public class NewClassTest {
    
    public NewClassTest() {
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
     * Test of getTeksti method, of class NewClass.
     */
    @Test
    public void testGetTeksti() {
        System.out.println("getTeksti");
        NewClass instance = new NewClass();
        String expResult = "alkuarvo";
        String result = instance.getTeksti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTeksti method, of class NewClass.
     */
    @Test
    public void testSetTeksti() {
        System.out.println("setTeksti");
        String teksti = "uusi arvo";
        NewClass instance = new NewClass();
        instance.setTeksti(teksti);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLuku method, of class NewClass.
     */
    @Test
    public void testGetLuku() {
        System.out.println("getLuku");
        NewClass instance = new NewClass();
        int expResult = 0;
        int result = instance.getLuku();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLuku method, of class NewClass.
     */
    @Test
    public void testSetLuku() {
        System.out.println("setLuku");
        int luku = 1;
        NewClass instance = new NewClass();
        instance.setLuku(luku);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetGetLuku() {
        System.out.println("testSetGetLuku");
        int luku = 3;
        NewClass instance = new NewClass();
        instance.setLuku(luku);
        int expResult = 3;
        int result = instance.getLuku();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of laske method, of class NewClass.
     */
    @Test
    public void testLaske_0args() {
        System.out.println("laske");
        NewClass instance = new NewClass();
        int expResult = 0;
        int result = instance.laske();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of laske method, of class NewClass.
     */
    @Test
    public void testLaske_int() {
        System.out.println("laske");
        int toinen = 2;
        NewClass instance = new NewClass();
        int expResult = 2;
        int result = instance.laske(toinen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
