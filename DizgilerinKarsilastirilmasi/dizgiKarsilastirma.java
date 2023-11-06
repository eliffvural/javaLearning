package DizgilerinKarsilastirilmasi;

public class dizgiKarsilastirma {

    public static void main(String[] args){

        //iki temel veri turu karsiliastirilirken == isleci kullanilir.
        //dizgi karsilastirmasinda ise bu equals metodu ile yapilir.
        //== yalnizda temel veri metodlari icin kullanilir.



        String string1="hijjj", string2="hijjj";

        if(string1.equals(string2)){
            System.out.println("string1 ve string2 birbirine esittir.");
        }
        else{
            System.out.println("Bu iki dizgi birbirinden farklidir.");
        }


        String a1="HİJJJ", a2="hijjj";

        if(a1.equals(a2)){
            System.out.println("a1 ve a2 dizgileri esittir.");
        }
        else{
            System.out.println("İki dizgi birbirinden farklidir.");
        }

        String a3="HİJJJ", a4="hijjj";

        if(a3.equalsIgnoreCase(a4)){
            System.out.println("a3 ve a4 dizgileri esittir.");
        }
        else{
            System.out.println("İki dizgi birbirinden farklidir.");
        }

        //iki dizgiyi karsilastirmak icin compareTo metodu kullanilir.

       /*string1.compareTo(string2)<0 === string1 string2 den kucuktur seklinde aciklayabiliriz. */

        




    }
    
}
