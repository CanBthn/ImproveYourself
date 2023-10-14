import java.util.Scanner;
public class ContNe {
    public static void main(String[] args){
        for(int i = 0; i <10 ; i++){
            /*if(i == 7){
                continue;      // 7.Değerini görünce sout kısmına geçmiyor.
            }*/

            if(i==7){           // 7.Değerden sonra for döngüsünden çıkıyor.
                break;
            }
            System.out.println(i + ". sayı = " + i);
        }


        
    }
}