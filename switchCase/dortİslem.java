package switchCase;

import java.util.Scanner;

public class dortİslem {

    public static void main(String[] args) {
        
        int a,b,toplam,fark,carpim,bolum,secim;

        Scanner klavye= new Scanner(System.in);
        System.out.println("Toplama yapmak isterseniz 1'e, cikarma icin 2'ye, carpma icin 3'e, bolme icin 4'e basiniz.");

        secim=klavye.nextInt();

        switch(secim){
            case 1:
            System.out.println("Toplama islemi icin a ve b degerlerini klavyeden giriniz: ");
            a=klavye.nextInt();
            b=klavye.nextInt();
            toplam=a+b;

            System.out.println("İslem sonucu:"+toplam);

            case 2:
            System.out.println("Cikarma islemi icin klavyeden a ve b degerlerini giriniz: ");
            a=klavye.nextInt();
            b=klavye.nextInt();
            fark=a-b;
            System.out.println("İslem sonucu: "+fark);

            case 3:
            System.out.println("Carpma islemi icin klavyeden a ve b degerlerini giriniz: ");
            a=klavye.nextInt();
            b=klavye.nextInt();
            carpim=a*b;
            System.out.println("İslem sonucu: "+carpim);

            case 4:
            System.out.println("Bolme islemi icin klavyeden a ve b degerlerini giriniz: ");
            a=klavye.nextInt();
            b=klavye.nextInt();
            bolum=a/b;
            System.out.println("İslem sonucu: "+ bolum);

            default:
            System.out.println("İslem yapmak icin uygun olmayan bir sayi secimi yaptiniz.");
        }
    }
    
}
