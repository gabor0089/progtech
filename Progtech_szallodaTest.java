/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtech_szalloda;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renyh
 */
public class Progtech_szallodaTest {
    
    public Progtech_szallodaTest() {
    }

    /**
     * Test of main method, of class Progtech_szalloda.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of szobaszamhossz method, of class Progtech_szalloda.
     */
    @Test
    public void testSzobaszamhossz() {
        //Ha a szobaszám 3 karakternél több, akkor bukik.
        String szoba="05f";
        boolean expected=true;
        boolean actual=szoba.length()<=3;
        assertEquals(expected,actual);
    }
    
}
