package SiniflarMethodlar;


public class personelDene {

    public static void main(String[] args) {
        personel yazilimMuhOgr;

        //nesneyi olusturalim:
        yazilimMuhOgr= new personel();
        yazilimMuhOgr.maasHesabi();
        yazilimMuhOgr.epostaYollama();
        yazilimMuhOgr.isim="emre";
        System.out.println(yazilimMuhOgr.isim);
    }
    
}
