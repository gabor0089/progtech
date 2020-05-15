package progtech_szalloda;

public class Szalloda {
    private static Szalloda szalloda=null;
    private final String nev;
    private final String cim;
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
    public String datumEllenorzes(String datum,String ejszakak){
        int datumint=Integer.parseInt(datum);
        int ejszakaint=Integer.parseInt(ejszakak);
        int utolsonap=datumint+ejszakaint;
        return String.valueOf(utolsonap);
    }
}
