import java.util.Scanner;
public class kosullar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your age:...");
        int yas = sc.nextInt();
        
        /*
        if(a > 18){
        System.out.println("YOUR AGE IS ENOUGH TO ENTER");
        }else if(a == 18){
            System.out.println("YOUR AGE İS MİN ENOUGH TO ENTER");
        }else {
            System.out.println("YOUR AGE IS NOT ENOUGH");
        }
        */

        //Switch olayı

        //Break diğer durumlara girmeden devam eder.

        switch(yas){
            case 1:
                System.out.println("BİRİNCİ YAS GRUBU");
                break;
            case 2:
                System.out.println("İKİNCİ YAS GRUBU");
                break;
            default:
                System.out.println("GECERSİZ YAS GRUBU");
                break;

        }

    }
}