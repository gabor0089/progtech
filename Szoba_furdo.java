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
