package Ornekler1;
import java.util.Scanner;

public class kokBulma {

    public static void main(String[] args) {

        double a,b,c,x1,x2, delta;
        
        Scanner klavye= new Scanner(System.in);

        System.out.println("a degeri: ");
        a=klavye.nextDouble();

        System.out.println("b degeri: ");
        b=klavye.nextDouble();

        System.out.println("c degeri: ");
        c=klavye.nextDouble();

        delta=b*b-4*a*c;

        if(delta<0){
            System.out.println("Denklemin gercek koku yoktur.");
        }
        else if(delta==0){
            x1=-b/2*a;
            System.out.println("Denklemin eşit iki koku vardir, x1=x2: "+x1);
        }
        else{
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }


        
    }
    
}
