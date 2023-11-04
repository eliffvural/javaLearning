public class BasamaklarToplami {
    public static void main(String[] args) {

        int sayi=192;
        int toplam;
        int birler,onlar, yuzler;

        yuzler=sayi/100;
        sayi=sayi-yuzler*100;
        onlar=sayi/10;
        birler=sayi%10;

        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);
        System.out.println(sayi);

        toplam=yuzler+onlar+birler;
        System.out.println(toplam);



    }
}