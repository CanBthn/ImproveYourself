import java.util.Scanner;
public class DonguYapıları {
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please valid number to write until your number");
        int a = sc.nextInt();
        


        /*
        for(int i = 1; i<= a; i++){
            System.out.println(i + ".Deger " + i);
        }
        */




        //                 ARTMA AZALMA AYNI ANDA
        /*
        int i = 0;
        int j = 10;
        for(; i <10 && j > 0 ; i++,j--){
            System.out.println("İ = " + i + " J = " + j);
        }
        */



        //                      FAKTORİYEL
        /*
        int fakt = 1;
        for(int b = 1; b <= a; b++){
            fakt *= b;
        }
        System.out.println(fakt);
        */

        //                 WHİLE
        /*
        int i = 9;
        while(i<10 && i >0){
            System.out.println("SAYI = " + i);
            i -= 2; // Kaç koyarsam o kadar azalır.
        }
        */

        //                While Faktoriyel
        /*
        int carpım = 1;

        while(a > 0){
            carpım *= a ;
            a--;
        }
        System.out.println(carpım);
        */

        //                 DO WHİLE
        
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while(i < 5);
            
        
        /*int toplam = 0;
        do {
            toplam += a % 10;
            a /= 10;
            }while(a >0);
            System.out.println(toplam);
            */
        }
    }