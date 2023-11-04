package BirlesikAritmetikİslecler;
public class İslemler {

    public static void main(String[] args){


        int a=3, b=2, c;
        c=a++ + b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        int d=3, e=5, f;
        f=++d + e;
        System.out.println("d: "+ d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);

        int number1=3, number2=2, sonuc;
        sonuc=number1*(number2--);
        System.out.println(sonuc);

         int number3=3, number4=2, sonuc2;
        sonuc2=number3*(--number4);
        System.out.println(sonuc2);

        //javada degisken degerinin sabitlenmesi: final degiskenTuru degiskenAdi= sabit;



    }
    
}
