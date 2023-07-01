public class Printandescaping {
    public static void main(String[] args) {
        // If I get x+++ print, it prints the value of x and then adds 1
        // If I print ++x, it first adds 1 and then prints as x+1
        int a = 10;
        System.out.println(a); // a value is printed
        System.out.println(a++); // The value of a is printed but the value of a became 11
        System.out.println(a); // The value 11 is printed here
        System.out.println(++a); // Value becomes 12 and 12 is printed
        
        int b = 3; // Integer value
        double c = 3.14; // Used for dotted ones
        float d = 4.0f;  // If it remains 4.0 we get an error f (float) should be written
        float e = (float)4.0;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println((int)d); // Float value converted to int

        System.out.println("HELLO\nBATUHAN"); // \n moves to a new line
        System.out.println("HELLO\tBATUHAN"); // \t spaces until a tab.
        System.out.println("HELLO \"hello\'"); // \ followed by ' or " indicates that it is used for a purpose other than the predefined operation.
    }
}