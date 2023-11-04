package EqualsDenemesi;

public class equalsDeneme {

    public static void main(String[] args){


         //iki dizginin ayni degere sahip olup olmadigini tespit etmek icin equals() methodunu kullanir.
        //kucuk ve buyuk harf arasinda ayrim yapilmasi istenmiyorsa equalsIgnoreCase() methodu kullanilir.
        //cikan sonuc boolean turunde olacaktir.

        String text1="Hijj Tarihi";
        String text2="şaaa";
        String text3="ŞAAA";
        
        System.out.println(text1.equals(text1));
        System.out.println(text1.equals(text2));
        System.out.println(text2.equalsIgnoreCase(text3));
        System.out.println(text3.equals(text1));

    }

    
}