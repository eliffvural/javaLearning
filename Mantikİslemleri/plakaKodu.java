package Mantikİslemleri;
import java.util.Scanner;

public class plakaKodu {
    public static void main(String[] args) {
        int plakaKodu;

        Scanner klavye= new Scanner(System.in);

        System.out.println("Klavyeden bir plaka kodu giriniz: ");
        plakaKodu=klavye.nextInt();
        
        if(plakaKodu==45){
            System.out.println("Bu plaka kodu Manisa'ya aittir.");
        }
        else{
            System.out.println("Girdiginiz plaka kodu Manisa iline ait degildir.");
        }
    }
}
