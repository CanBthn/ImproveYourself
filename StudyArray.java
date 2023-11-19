import java.util.Scanner;
public class StudyArray {
    public static double arrayOrt (int[] array){
        int sum = 0;
        int ort = 0;
        for(int i=0; i<array.length; i++){
            sum = array[i] + sum;
        }ort = sum/array.length;

        return ort;
    }




    /*
    public static void array_bastir (int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("ELEMAN " + (i+1) + ":" + array[i]);
        }
    }
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        // Array tanımlarken
        int[] a = new int[10]; // Bellekte 10 tane yer açılır.
        // 0, 1, 2, 3, 4, 5, ... olarak ilerleyecek

        a[5] = 3; // 6.elemana 3 değeri veriyor.

        // Veya şöyle de yapabiliriz

        int[] b = {10,20,30,40,50}; // 10 tane yer açılıyor java oraya bunları atıyor
        //B array uzunluğu 5 son eleman için ise 4.elemanı bastırmak gerekiyor.
        System.out.println(b[4]);
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }

        // ARRAYI DOLDURUP BASTIRMA İŞLEMİ
        int[] b = new int[5];
        for(int i = 0; i<b.length; i ++){
            System.out.println("ENTER VALUE");
            b[i] = sc.nextInt();

        }System.out.println("VALUES");
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        int[] c = {99,98,97,96};
        int[] b = {10,20,30,40,50};
        array_bastir(c);
        array_bastir(b);
        */
        int[] b = {10,20,30,40,50};
        System.out.println(arrayOrt(b));

    }
}