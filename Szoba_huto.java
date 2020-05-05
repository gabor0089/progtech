/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
