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
        int random_szam;
        random_szam= rand.nextInt(11);
        String datum;
        datum=sc.nextLine();
        while(random_szam>8)
        {    
            System.out.print("Sajnos erre a napra nincs szabad szoba! Válasszon másik dátumot: ");
            datum=sc.nextLine();
            random_szam= rand.nextInt(11);
        }
        System.out.println("Az ön által kiválasztott dátum: "+datum);
        System.out.print("Válasszon szobát!");
        int szobaszam=sc.nextInt();
        
        
    }
    
}