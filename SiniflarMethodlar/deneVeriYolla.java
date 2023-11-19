package SiniflarMethodlar;

import java.util.Scanner;





public class deneVeriYolla {
    public static void main(String[] args) {

        veriYolla veri= new veriYolla();
        String mesaj;
        
        int sembolSayisi;
        Scanner klavye= new Scanner(System.in);
        System.out.print("Lutfen bir cümle yazıniz : ");
        mesaj =klavye.nextLine();
        sembolSayisi=veri.veriYazdir(mesaj);
        System.out.println("sembol sayisi: "+sembolSayisi);
    }
    
}
