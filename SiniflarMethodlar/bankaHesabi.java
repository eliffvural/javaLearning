package SiniflarMethodlar;

public class bankaHesabi {

    public double miktar;
    public double faiz;

    public void yeniToplamGoster(){
        double yeniMiktar=miktar+(faiz/100.0)*miktar;
        System.out.println("Faizli yeni toplam miktar: "+yeniMiktar+"TL dir.");
    }
    
}
