/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jessy
 */
public class MainTest {
    
    public MainTest() {
    }    

    /**
     * Test of sayHello method, of class Main.
     */
    @Test
    public void testSayHello() {
        String name = "Laura";
        Main instance = new Main();
        int expResult = ("Hello " + name + "!").length();
        int result = instance.sayHello(name);
        assertEquals(expResult, result);
    }    
}
