 public class VeriTuruDonusumu {

    public static void main(String[] args){


        //degisken degeri hangi tur veriye donusturulecekse parantezin icerisnde o veri turunun adi yazilir.

        double yemekUcreti=19.12;
        int  zamliYemekUcreti=(int)yemekUcreti + 20;

        System.out.println(zamliYemekUcreti);

        //Stringden int'e veri donusumunde parseInt(String s) methodu kullanilir.

        String onDokuzStringi="19";
        int number= Integer.parseInt(onDokuzStringi);

        System.out.println(onDokuzStringi);

        char ucKarakteri='3';
        String ucDizgisi="3";
        int ucSayisi=3;

        String stringeCevrilmisUcKarakteri= ucKarakteri+"";
        String stringeCevrilmisUcSayisi= ucSayisi+"";
        double ondalikUc=Double.parseDouble(ucDizgisi);

        System.out.println(ondalikUc);

        //iki degisken turunden hangisinin veri turu daha buyukse sonuc o veri turune gore duzenlenecektir.
        //ornegin double ve int arasinda islem oldugunda sonuc her zaman double olacaktir.

        int intBolumSonucu=11/2;
        double doubleBolumSonucu=11/2.0;
        double ilgincBolumSonucu=11/2;

        System.out.println(intBolumSonucu);
        System.out.println(doubleBolumSonucu);
        System.out.println(ilgincBolumSonucu);
     


    }


    
}