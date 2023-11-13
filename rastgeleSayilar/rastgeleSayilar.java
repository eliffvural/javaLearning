package rastgeleSayilar;

import java.util.Scanner;

public class rastgeleSayilar {

    //Math sinifindaki random methoduyla yazilir.
    //bu method 0-1  arasinda rastgele gercel sayi uretir.
    //bu sayiyi istenilen aralikta bir tamsayiya donusturerek kullabiliriz.

    public static void main(String[] args) {
        int kacDefa, zar;
        Scanner klavye= new Scanner(System.in);
        System.out.println("Kac defa zar atacagiz?");
        kacDefa=klavye.nextInt();

        for(int i=0;i<kacDefa;i++){
            zar=((int)(Math.random()*6)+1); //+1 yazdigimiz zaman zardan 1 ile 6 arasinda random integer sayilar getirecektir. Eger +6 yazmis olsaydik 6 ile 12 arasinda yazmis olacakti.
            System.out.println(zar);
        }
    }
    
}
