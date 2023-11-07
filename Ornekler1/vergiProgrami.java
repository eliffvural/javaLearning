package Ornekler1;
import java.util.Scanner;

public class vergiProgrami {

    public static void main(String[] args) {

        double gelirMiktari, vergi;

        Scanner klavye= new Scanner(System.in);

        System.out.println("Klavyeden gelir miktarini giriniz: ");

        gelirMiktari= klavye.nextDouble();

        if(gelirMiktari<=150000000){
            vergi=gelirMiktari*25/100;
            System.out.println("Odemeniz gereken vergi miktari "+vergi+"TL dir.");
          
        }
        else if(gelirMiktari<=300000000){
            vergi=gelirMiktari*30/100;
            System.out.println("Odemeniz gereken vergi miktari "+ vergi+"TL dir.");

        }
            else if(gelirMiktari<=600000000){
            vergi=gelirMiktari*35/100;
            System.out.println("Odemeniz gereken vergi miktari "+ vergi+"TL dir.");
            
        }
            else if(gelirMiktari<=1200000000){
            vergi=gelirMiktari*40/100;
            System.out.println("Odemeniz gereken vergi miktari "+ vergi+"TL dir.");
            
        }
            



        
    }
    
}
