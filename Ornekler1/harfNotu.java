package Ornekler1;
import java.util.Scanner;



public class harfNotu {

    public static void main(String[] args) {

        //bir sinavda 100 uzerinden alinan sayisal nota karsilik gelen harf notunu hesaplayalim:

        int sayisalNot;
        String harfNotu;

        Scanner klavye = new Scanner(System.in);

        System.out.println("Sinavdan almis oldugunuz sayisal notunuzu klavyeden giriniz: ");

        sayisalNot=klavye.nextInt();

        if(sayisalNot>90){
            harfNotu="AA";
            System.out.println("Harf notunuz: "+ harfNotu);
        }
        else if(sayisalNot<=90 && sayisalNot>70){
            harfNotu="BB";
            System.out.println("Harf notunuz: "+ harfNotu);
        }
        else if(sayisalNot<50){
            harfNotu="FF";
            System.out.println("Harf notunuz: "+harfNotu);
        }
    }
    
}
