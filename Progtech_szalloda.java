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
        String datum;
        datum=sc.nextLine();
        Random rand=new Random();
        int random_szam = rand.nextInt(11);
        if(random_szam>8)
            System.out.println("Sajnos erre a napra nincs szabad szoba! Válasszon másik dátumot!");
        else
           System.out.print("Az ön által kiválasztott dátum: "+datum);
         
        
    }
    
}
