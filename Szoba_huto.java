package progtech_szalloda;

public class Szoba_huto implements ISzoba {

    @Override
    public String getBerendezes() {
        return "Hűtővel";
    }

    @Override
    public String getSzobaszam() {
        return "01";
    }

    @Override
    public int getAr() {
        return 7999;
    }
}
