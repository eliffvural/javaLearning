package switchCase;

import java.util.Scanner;

public class parcaliIslev {

    public static void main(String[] args) {
        
        //Math islevini kullanarak parcali islevlerin programini yazalim:
        //programimiz x i double olarak alip fx fonksiyonunu hesaplayacak:

        double x,f;

        Scanner klavye= new Scanner(System.in);

        System.out.println("Ondalikli bir sayi giriniz: ");
        x=klavye.nextDouble();

        if(x<0.0){
            f=2*(x-1)/3;
            Math.abs(f);
            System.out.println("Sonuc: "+f);

        }

        else if(x==0){
            f=Math.sqrt(2.0/3.0);
            System.out.println("Sonuc: "+f);
        }

        else{
            f=2*(x+1)/3;
            Math.abs(f);
            System.out.println("Sonuc: "+f);
        }


    }
    
}
