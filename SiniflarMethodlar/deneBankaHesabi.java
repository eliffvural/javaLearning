package SiniflarMethodlar;

public class deneBankaHesabi {
    public static void main(String[] args) {
        
        bankaHesabi benimHesabim= new bankaHesabi();
        benimHesabim.miktar=200;

        benimHesabim.faiz=5;
        double yeniMiktar=700;
        benimHesabim.yeniToplamGoster();
        System.out.println("Hesabinizda "+yeniMiktar+"TL olmali.");
    }
    
}
