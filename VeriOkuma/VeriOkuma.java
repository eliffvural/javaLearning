import java.util.Scanner;

public class VeriOkuma {

    public static void main (String[] args){

    /*Scanner sinifi her türlü girdi üzerinde islem yapabilmesinin yani sira klavyeden giris yapilmasina da olanak saglar.
    Scanner sinifi java.util paketinin icinde yer alir.(import java.util; ya da import java.util.Scanner;   bu ikisinden birinin programda yer almasi gerekir.)
    Scanner sinifi nesneleri, uzerinde islem yaptiklari yaziilari parcalara ayirarak her parcayi farkli bir veri turune donusturebilir.*/

    /*Scanner tarayici= new Scanner (System.in);
    Nesneyi bu sekilde olusturulduktan sonra bu sinifin tum metodlari klavyeden veri okumak icin cagirilabilir.
    Ornek verirsek, klavyeden int turunde b
    r veri okumak icin nextInt() metodunu cagiririz.
    
    Scanner klavye= new Scanner(System.in)
    int a=klavye.nextInt();    */

    int numberDay,numberMonth;

    Scanner keyBoard= new Scanner(System.in);
    
    System.out.println("Please, sign in your birtday date and month number, but you leave a space between numbers.");
    numberDay=keyBoard.nextInt();
    numberMonth=keyBoard.nextInt();

    System.out.println("Number day is: "+numberDay);
    System.out.println("Number month is: "+numberMonth);

    String name,surname;
    
    Scanner information= new Scanner(System.in);

    System.out.println("Please, write your name and surname.");
    name=information.next();
    surname=information.next();

    System.out.println("Your name is: "+name+" and your surname is: "+surname);







    }



    
}

