package progtech_szalloda;

import java.util.Scanner;
import java.util.Random;


class FizetBank implements Fizetes {

    public void Fizetes() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bankkártyával való fizetés van kiválasztva. ");
        
        System.out.print("Adja meg a bankkártyája számát: ");
        String kartyaszam=sc.nextLine();
        hosszEllenorzes(kartyaszam);
        
    }
    public String hosszEllenorzes(String kartyaszam) throws NotCorrectLengthException{
        kartyaszam="1234123412341234";
        try{
            if(kartyaszam.length()==16)
            {
                Random rand=new Random();
                int random_szam2= rand.nextInt(11);
                if(random_szam2<2)
                    return "Nincs elég pénz a kártyáján!";
                else
                    return "A foglalását rögzítettük.";
            }
            else
                return "Hibás kártyaszám";        
        }
        catch(NotCorrectLengthException e){
            System.out.println(e.getMessage());
        }
        return "";
    }
}
