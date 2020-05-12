/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtech_szalloda;
import  java.util.Scanner;
import java.util.Random;
/**
 *
 * @author renyh
 */
public class Progtech_szalloda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Szalloda.getSzalloda();
        String sznev=Szalloda.getSzallodanev();
        String szcim=Szalloda.getSzallodacim();
        System.out.println("Üdvözlöm az "+sznev+" oldalán\n"+szcim);
        System.out.print("Mikorra szeretne szobát kivenni? (Formátum: 20200425): ");
        Scanner sc;
        sc=new Scanner(System.in);
        Random rand=new Random();
        int random_szam= rand.nextInt(11);
        String datum;
        datum=sc.nextLine();
        while(random_szam>8)
        {    
            System.out.print("Sajnos erre a napra nincs szabad szoba! Válasszon másik dátumot: ");
            datum=sc.nextLine();
            random_szam= rand.nextInt(11);
        }
        System.out.println("Az ön által kiválasztott dátum: "+datum);
        System.out.println("Elérhető szobák:");
        ISzoba sz_1 = new Szoba_huto();
        ISzoba sz_2 = new Szoba_tv();
        ISzoba sz_3 = new Szoba_furdo(new Szoba_tv());
        ISzoba sz_4 = new Szoba_furdo(new Szoba_huto());


        System.out.println(sz_1.getSzobaszam()+"\t"+sz_1.getBerendezes()+"\t"+sz_1.getAr()+"Ft");
        System.out.println(sz_2.getSzobaszam()+"\t"+sz_2.getBerendezes()+"\t"+sz_2.getAr()+"Ft");
        System.out.println(sz_3.getSzobaszam()+"\t"+sz_3.getBerendezes()+"\t"+sz_3.getAr()+"Ft");
        System.out.println(sz_4.getSzobaszam()+"\t"+sz_4.getBerendezes()+"\t"+sz_4.getAr()+"Ft");
        
        System.out.print("Melyik szobát választja: ");
        String szobaszam=sc.nextLine();
    }
    public boolean szobaszamhossz(String szobaszam){
            return true;
    }
}
