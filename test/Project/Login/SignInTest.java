/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xpinux
 */
public class SignInTest {
    
    public SignInTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting...");

    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Done!");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class SignIn.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        SignIn test = new SignIn();
        int expectedResult=1;
        int result=test.testingAction();
        assertEquals(expectedResult,result);
       
       
    }
    
}
