package whileDongusu;

import java.util.Scanner;

public class ortSicaklik {


    //while dongusu kullanilarak ortalamak sicaklik listesinin okunmasi:
 public static void main(String[] args) {
    int derece, gun=0, toplam=0;
    double ortalama;

    Scanner klavye= new Scanner(System.in);
    System.out.println("Klavyeden gun ortalama sicakligini giriniz: ");
    derece=klavye.nextInt();

    while(derece!=-1){
        gun++;
        toplam+=derece;
        System.out.println("Gun ortalama sicakligini giriniz: ");
        derece=klavye.nextInt();
    }

    if(gun!=0){
        ortalama=toplam/gun;
        System.out.println(gun+" gun ortalamasi: "+ortalama);
    }
    else{
        System.out.println("Gecersiz gun sayisi.");
    }
 }
    


}
