package switchCase;

import java.util.Scanner;

public class listeOrnegi {

    public static void main(String[] args) {
        

        int secim;

        Scanner klavye=new Scanner(System.in);

        System.out.println("1-2-3 arasindan secim yapiniz.");
        secim=klavye.nextInt();

        switch(secim){
            case 1:
            System.out.println("1 numarali secim: Pizzahijjj");
            break;

            case 2:
            System.out.println("2 numarali secim: Makarnahijjj");
            break;

            case 3:
            System.out.println("3 numarali secim: Milföyhijjj");
            break;

            default:
            System.out.println("Hatali secim yaptiniz.");
            break;
        }


    }
    
}
