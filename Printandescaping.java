public class Printandescaping {
    public static void main(String[] args) {
        // x++ print alırsam x değerini printler sonra 1 ekler
        // ++x print alırsam önce 1 ekler sonra x+1 şeklinde printlenir
        int a = 10;
        System.out.println(a); // a değeri printlenir
        System.out.println(a++); // a değeri printlenir ama a değeri 11 oldu
        System.out.println(a); // 11 değeri burada printlenir
        System.out.println(++a); // değer 12 olmuştur ve 12 printlenir
        
        int b = 3; // Tam sayı değeridir
        double c = 3.14; // Noktalı olanlar için kullanılır
        float d = 4.0f;  // Eğer 4.0 olarak kalırsa hata alırız f (float) yazılmalı
        float e = (float)4.0;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println((int)d); // Float değeri int değerine dönüştü


        System.out.println("HELLO\nBATUHAN"); // \n yeni bir satıra geçirir
        System.out.println("HELLO\tBATUHAN"); // \t bir tab kadar boşluk bırakır.
        System.out.println("HELLO \"hello\'"); // \ sonrasında olan ' veya " ön tanımlı işlemden farklı bir amaç için kullanıldığını gösterir
    }
}