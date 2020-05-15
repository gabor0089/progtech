package progtech_szalloda;

import org.junit.Test;
import static org.junit.Assert.*;

public class Progtech_szallodaTest {
    
    public Progtech_szallodaTest() {
    }
    @Test
    public void testMain() {
    }

    @Test
    public void testSzobaszamhossz() {
        //Ha a szobaszám 3 karakternél több, akkor bukik.
        String szoba="05f";
        boolean expected=true;
        boolean actual=szoba.length()<=3;
        assertEquals(expected,actual);
    }
    @Test
    public void datumEllenorzes(){
        Szalloda szalloda=Szalloda.getSzalloda();
        String datum="20200515";
        String ejszakak="3";
        String expected="20200518";
        String actual=szalloda.datumEllenorzes(datum, ejszakak);
        assertEquals(expected,actual);
        
    }
}
