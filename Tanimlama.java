public class Tanimlama {
    public static void main(String[] args){
        //int first = 7;                          // first bir int değeridir ve 7 atandı.
        //Eğer direkt değeri atamak istemiyorsak öncelikle değeri tanımlamamız gerekmektedir.
        
        
        /*int first;      //First kelimesi int olarak tanımlandı ama herhangi bir değer almadı.

        //first = 4;

        first = 7;      //Değer burada 4 değerinden 7 değerine geçmiştir.

        int second = 4+7;           // Değer burada direkt toplanır ve şuan second değeri 11'dir.
        System.out.println(second);
        System.out.println(first);*/

        int a = 7;
        int b = 4;
        int c = 2;
        // int 1d = 5;         // Değer tanımlarken d başına rakamlar gelmez hata verir.TÜRKÇE KARAKTERLER KULLANILABİLİR.

        int toplam = a+2*b+c;   // a = 7 değeri b = 2.4=8 değeri c = 2 değerini alır ve 17 olur
        System.out.println("a,b ve c değerlerinin toplamı; " + toplam);
    }
}