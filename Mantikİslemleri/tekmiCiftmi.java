
package Mantikİslemleri;

import java.util.Scanner;


public class tekmiCiftmi {
    
   public static void main(String[] args) {
    
    int sayi;

    Scanner klavye= new Scanner(System.in);
    System.out.println("Klavyeden bir sayi giriniz: ");
    sayi= klavye.nextInt();

    if(sayi%2==0){
        System.out.println("Girdiginiz sayi cift sayidir."+ sayi);

    }
    else{
        System.out.println("Girdiginiz sayi tek sayidir. "+ sayi);
    }



   }

    
    
}
