package progtech_szalloda;

public class Szoba_furdo extends SzobaDecorator{
    public Szoba_furdo(ISzoba ures){
        super (ures);
    }
    @Override
    public String getBerendezes(){
        return ures.getBerendezes()+" saját fürdővel";
    }
    @Override
    public int getAr(){
        return ures.getAr()+20000;
    }
    @Override
    public String getSzobaszam(){
        return ures.getSzobaszam()+"f";
    }
}
