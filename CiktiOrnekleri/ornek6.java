package CiktiOrnekleri;

public class ornek6 {
    public static void main(String[] args) {
        int sayac;
        for (sayac = 1; sayac <= 2; sayac++) {
            switch (sayac) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                
                default:
                System.out.println("kabul edilen durum.");
                break;
            }
        }
        System.out.println("donguden sonra");
    }

}
