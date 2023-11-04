package String;

public class string {

    public static void main(String[] args){

        String hijjjMessage= "Öjjjşalayyy öjjjüüüü";
        System.out.println(hijjjMessage);

        String message1="hijjj";
        String message2="şaaa";

        String birlestirme=message1+" "+message2;

        System.out.println(birlestirme);


        //String dizgilerinin uzunlugunu bulmak icin length() methodu kullanilir.

        int uzunluk="hiijjj dogumgunuu".length();
        System.out.println(uzunluk);

        int uzunluk2;
        String ileti="Yazilim Muhendisligi ";
        uzunluk2=ileti.length();
        System.out.println(ileti+": "+uzunluk2);

        //String sinifinin bazi methodlari:

        //toLowerCase()
        String yazi="HİİJJJJ";
        String kucukHarfli=yazi.toLowerCase();
        System.out.println(kucukHarfli);

        //toUpperCase()
        String yazi2="hijjjj";
        String buyukHarfli=yazi2.toUpperCase();
        System.out.println(buyukHarfli);

        //substring(baslangic)
        String yazi3="öjjjşalayy öjjjüü";
        String parca=yazi3.substring(3);
        System.out.println(parca);

        //substring(baslangic,son)
        String yazi4="hijjimminndogummgunuu";
        String parca2=yazi4.substring(2,5);
        System.out.println(parca2);

        //indexOf
        String text="hijjj şaa hiijjj";
        int hijjNerede=text.indexOf("hiijjj");
        System.out.println(hijjNerede);

        //indexOf
        String text2="şaaa şaaaa şaaa";
        int şaaNerede=text2.indexOf("şaaa", 8);
        System.out.println(şaaNerede);

        //lastIndexOf
        String text3="hiijjj hiijjj hiijjj";
        int hiijjjNerede=text3.lastIndexOf("hiijjj");
        System.out.println(hiijjjNerede);

        //trim: dizginin basindaki ve sonundaki bosluklari silip geri verir.
        String mesaj="       hiijjj      ";
        String boslukAtilmis=mesaj.trim();
        System.out.println(boslukAtilmis);

        

       







    }
    
}
