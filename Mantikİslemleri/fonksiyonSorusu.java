package Mantikİslemleri;
import java.util.Scanner;

public class fonksiyonSorusu {

    public static void main(String[] args) {
        double x,f,g;
        Scanner klavye= new Scanner(System.in);
        System.out.println("klavyeden bir sayi giriniz: ");
        x=klavye.nextDouble();

        if(x>0.0){
            f=1/(1+Math.log(x));   //math.log(x)==lnx
            g=1/(x+Math.log(x));
        }
        else{
            f=1/(1+x*x);
            g=1/(1+x+x*x);

        }
        System.out.println("F fonksiyonu: "+f );
        System.out.println("G fonksiyonu: "+g);
    }
    
}
