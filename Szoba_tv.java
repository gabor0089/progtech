/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
