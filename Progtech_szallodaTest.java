package progtech_szalloda;

import org.junit.Test;
import static org.junit.Assert.*;

public class Progtech_szallodaTest {
    
    public Progtech_szallodaTest() {
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
    @Test
    public void ferohelyEllenorzes(){
        Szalloda szalloda=Szalloda.getSzalloda();
        int ferohely=100;
        int modositas=-5;
        int expected=95;
        int actual=szalloda.ferohelyModositas(ferohely,modositas);
        assertEquals(expected,actual);   
    }
    @Test
    public void bankkartyaEllenorzes() throws NotCorrectLengthException{
        String value="1234123412341234";
        if(value.length()!=16)
            throw new NotCorrectLengthException("Nem érvényes formátum.");
        
    }
}
