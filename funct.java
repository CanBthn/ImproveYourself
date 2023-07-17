import java.util.Scanner;
public class funct {
    public static int toplamdeneme(int a, int b){
        return a+b;
    }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("PLEASE ENTER 2 VALUE...");
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        System.out.println(toplamdeneme(value1,value2));
    }
}