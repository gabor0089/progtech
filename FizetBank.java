package progtech_szalloda;

import java.util.Scanner;
import java.util.Random;


class FizetBank implements Fizetes{

    public void Fizetes(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Bankkártyával való fizetés van kiválasztva. ");
        
        System.out.print("Adja meg a bankkártyája számát: ");
        String kartyaszam=sc.nextLine();
        
        if(kartyaszam.length()==16)
        {
            System.out.println("Kártyaszám elfogadva.");
            int random_szam2= rand.nextInt(11);
            if(random_szam2<2)
                System.out.println("Nincs elég pénz a kártyáján!");
            else
                System.out.println("A foglalását rögzítettük.");
        }
        else
            System.out.println("Hibás kártyaszám");
    }
}
