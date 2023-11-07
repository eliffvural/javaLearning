package Ornekler1;

import java.util.Scanner;

public class karekok {

    public static void main(String[] args) {

        //negatif bir sayi girildiginde bu sayinin karekokunu hesaplayan, fakat negatif sayi girildiginde kullaniciyi uyaran programi yazalim:

        double girilenSayi;

        Scanner klavye= new Scanner(System.in);

        System.out.println("Klavyeden bir sayi giriniz: ");

        girilenSayi=klavye.nextDouble();

        if(girilenSayi>0){
            System.out.println("Girdiginiz sayinin son hali: "+Math.sqrt(girilenSayi));
        }
        else{
            System.out.println("Hatali giris! Girdiginiz sayi negatif sayidir.");
        }
        
    }
    
}
