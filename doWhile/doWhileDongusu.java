package doWhile;

public class doWhileDongusu {

    //donguye giris kosulu yoktur.
    //dongu olusturan kosullar en az bir defa calistirilir.
    //donguden cikis kosulu ise dongunun sonunda yer almaktadir.

    /*
     
    do
    {
        ..;
        ..;
    }while(kosul);

     */

     public static void main(String[] args) {
        int i;
        i=1;
        do{
            System.out.println(i+". kez isletildi.");
            i++;
        }while(i<=5);
     }
    
}
