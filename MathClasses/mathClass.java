package MathClasses;

public class mathClass {

    public static void main(String[] args) {
        
        //matematiksel islem ve islevler icin Math sinifi kurulmustur.
        /*
        
        Math.abs== mutlak deger alir.
        Math.ceil== uste yuvarlar.
        Math.floor== asagi yuvarlar.
        Math.log10= 10 tabaninda log islemini gerceklestirir.
        Math.max== iki farkli degiskenden buyuk olani bulur.
        Math.min== iki farkli degiskenden kucuk olani bulur.
        Math.pow== ust alir. (taban,us) seklinde kullanilir.
        Math.PI== pi sayisinin ciktisini verir.
        Math.random== double veri tipine sahip olarak algilar ve 0-1 arasinda rastgele sayi uretir.
        Math.round== double veri  tipine sahip degerleri en yakin sayiya yuvarlar. (11.6): 12 ciktisini verecektir.
        Math.sqrt== karekok islemini yapar. sgrt(144): 12 sonucunu verir.
        
         */

         System.out.println(Math.abs(-18));
         System.out.println(Math.ceil(21.5));
         System.out.println(Math.floor(19.8));
         System.out.println(Math.log10(1000));
         System.out.println(Math.max(2, 18));
         System.out.println(Math.min(5, 20));
         System.out.println(Math.pow(2, 3));
         System.out.println(Math.random()); //her seferinde farkli random sayi uretip farkli ciktilar verecektir.
         System.out.println(Math.round(19.5));
         System.out.println(Math.sqrt(225));





    }
    
}
