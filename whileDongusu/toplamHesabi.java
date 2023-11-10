package whileDongusu;

import java.util.Scanner;

public class toplamHesabi {
    public static void main(String[] args) {
        
        // s=1+2+3+....+N toplamini hesaplayan bir program yazalim:
        //N degerini k girelim ve N>=1 olup kullanici tarafindan girilmelidir.

        int i=0, n, toplam=0;
         Scanner klavye= new Scanner(System.in);
         System.out.println("Klavyeden n sayisini giriniz: ");
         n= klavye.nextInt();

        if(n>=1){
            while(i<=n){
                toplam+=i;
                i++;
            }
            System.out.println(n+" e kadar olan sayilarin toplami: "+toplam);
        }
        else{
            System.out.println("Hatali tuslama yaptiniz. 1 veya 1 den buyuk bir sayi giriniz.");
        }
    }
    
}
