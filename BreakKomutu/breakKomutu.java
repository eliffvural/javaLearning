package BreakKomutu;

import java.util.Scanner;

public class breakKomutu {

    public static void main(String[] args) {
        
        //alabilecegimiz maksimum 10 adet malzeme var ve maksimum 100 TL harcayabiliriz.
        //eger 100 TL nin uzerinde harcama yaparsak sistem bize uyari verecektir.
        //sistem bize yaptigimiz toplam harcamayi da gostermis olsun.
        //harcama yaptiktan sonra daha sonra alabilecegimiz malzemeyi de bize söylesin.
        //malzeme fiyatini klavyeden biz girecegiz. (scanner)

        int malzemeNo;
        double toplam,deger;

        System.out.println("Toplam 10 adet malzeme alabilirsiniz fakat harcamaniz 100 TL yi gecmemeli.");

        //baslangicta hic malzeme almadigimiz icin toplam degerimizi belirtmeliyiz.
        toplam=0;
        Scanner klavye=new Scanner(System.in);

        for(malzemeNo=1;malzemeNo<=10;malzemeNo++){
            System.out.println("Malzeme No: "+malzemeNo);
            System.out.println("Malzeme tutari: ");
            deger=klavye.nextDouble();
            

            if(deger>100){
                System.out.println("100 TL den fazla harcama yapamazsiniz.");
                break;
            }


            toplam+=deger;
            System.out.println("Toplam tutar: "+ toplam);
            System.out.println((10-malzemeNo)+ "\n"+ "tane daha malzeme alabilirsiniz."); //bir alt satira gecmek istedigimiz zaman \n methodu kullanabiliriz.
            System.out.println();
            }


        





            
            
        }
    }
    
}
