package ExitMethodu;

import java.util.Scanner;

public class exitMethodu {

    public static void main(String[] args) {

        // system.exit(0) methodu programin belli bir noktada sona erdirilmesini saglar.
        // bu genelde herhangi bir problemle karsilasildiginda meydana gelir.

        double elemanSayisi, toplamSaat;
        double isBolumu;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen eleman sayisini giriniz: ");
        elemanSayisi = klavye.nextInt();

        if (elemanSayisi == 0) {
            System.out.println("Hatali!");
            System.exit(0); //direkt sistemden cikis yapiyor.
        } 
        else {
            System.out.println("Lutfen toplam calisma saatini giriniz:");
            toplamSaat = klavye.nextDouble();
            isBolumu = toplamSaat / elemanSayisi;
            System.out.println("Is bolumu: " + isBolumu);
        }

    }

}
