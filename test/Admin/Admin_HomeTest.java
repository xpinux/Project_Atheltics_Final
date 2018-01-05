/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Admin_HomeTest {
    
    public Admin_HomeTest() {
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
     * Test of showDate method, of class Admin_Home.
     */
  

    /**
     * Test of showTime method, of class Admin_Home.
     */
    @Test
    public void testShowTime() {
        System.out.println("showTime");
        Admin_Home instance = new Admin_Home();
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-YYYY");
        String result =s.format(d);
        String expectedResult="05-01-2018";
        instance.testDate();
          assertEquals(expectedResult,result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of main method, of class Admin_Home.
     */
   
}
