package KararVermeYapisi;

import java.util.Scanner;

public class kararVermeYapisi {

    public static void main(String[] args){

        //karar verme mekanizmalarinda if-else yada switch komutlari kullanilabilir.

        String text="Öjjjjşaalayyy öjjjjüü";
        int uzunluk=text.length();
        if(uzunluk<10){
            System.out.println("This text is short text.");
            System.out.println("IT should be longer than 10");

            
        }
        else{
            System.out.println("This text is long text.");
        }

        //another example:

        int satisFiyati, zam;

        Scanner klavye= new Scanner(System.in );
       
        System.out.println("Klavyeden satis fiyatini giriniz: ");
         satisFiyati= klavye.nextInt();
        if(satisFiyati<=100){
            zam=satisFiyati+50;
            System.out.println("Urunun yeni satis fiyati: "+zam);

        }

        else{
            System.out.println("Urunun satis fiyati nedeniyle bu urunun fiyatina zaman yapilmayacaktir.");
        }

   
        int cocukSayisi, yapilacakYardim;
       

        Scanner info= new Scanner(System.in);

        System.out.println("Sahip oldugunuz cocuk sayisini klavyeden giriniz: ");
        cocukSayisi=info.nextInt();

        if(cocukSayisi>=3){
            yapilacakYardim=cocukSayisi*500;
            System.out.println("Her cocuk icin 500 TL yardim yapilacaktir. Toplam yardim: "+yapilacakYardim);
        }
        else{
            System.out.println("Yardim icin gerekli sebepler bulunamamistir.");
        }


        int alinanPuan;
        char harfPuan;

        Scanner klavye2= new Scanner(System.in);

        System.out.println("Sinavdan almis oldugunuz puani klavyeden giriniz: ");
        alinanPuan=klavye2.nextInt();

        if(alinanPuan<50){
            harfPuan='F';
            System.out.println("Aldiginiz puana denk olan harf notunuz: "+harfPuan);
        }
        else{
            harfPuan='A';
            System.out.println("Aldiginiz puana denk olan harf puaniniz: "+harfPuan);
        }


        

    }
    
}
