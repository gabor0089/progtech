package progtech_szalloda;

public class Szoba_tv implements ISzoba {

    @Override
    public String getBerendezes() {
        return "tévével";
    }

    @Override
    public String getSzobaszam() {
        return "02";
    }

    @Override
    public int getAr() {
        return 9999;
    }
}
