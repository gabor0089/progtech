/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtech_szalloda;

/**
 *
 * @author renyh
 */
public class Szalloda {
    private static Szalloda szalloda=null;
    private final String nev;
    private final String cim;
    //private static String Hotelnév="HotelEKE";
    private Szalloda(String nev,String cim){
        this.nev=nev;
        this.cim=cim;
    }
    public static Szalloda getSzalloda()
    {
        String nev="HotelEKE";
        String cim="3300 Eger, Eke út 2020.";
        if(szalloda==null) 
            szalloda=new Szalloda(nev,cim);
        return szalloda;
    }
    public static String getSzallodanev()
    {
        return szalloda.nev;
    }
    public static String getSzallodacim()
    {
        return szalloda.cim;
    }
    
}
