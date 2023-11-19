package SiniflarMethodlar;

public class veriDondur {

    public int veriYazdir() {
        int say;
        String mesaj = "hijjj";
        System.out.println(mesaj);
        say = mesaj.length();
        return say;
    }

}

public class deneVeriDondur {

    public static void main(String[] args) {
        veriDondur eleman = new veriDondur();
        int sembolSayisi = eleman.veriYazdir();
        System.out.println("sembol sayisi : " + sembolSayisi);
        int sembolSayisi2 = eleman.veriYazdir(); // Farklı bir değişken kullanılmalı
        System.out.println("sembol sayisi: " + sembolSayisi2);
    }

}
