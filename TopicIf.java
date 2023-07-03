import java.util.Scanner;
public class TopicIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.println(3 == 3);  // In this way the true or false text is printed.
        System.out.println(4== 7);
        System.out.println("BATUHAN" == "BATUHAN"); // TRUE
        System.out.println("BATUHAN" == "batuhan"); // FALSE
        
        System.out.println( 3==3 && 4==4);  // && = AND
        System.out.println( 3==3 && 3==4);
        System.out.println( 3==3 || 3==4); // || = OR
        
        System.out.println(! false);    // ! = False will be true
        System.out.println(! true);     // ! = True will be false
        System.out.println(! ( 3 < 4 )); // Normally it is true however here it is false
        
        int x = 7;
        boolean v = (x==7);
        System.out.println(v);
        
        
        // THIS PART FOR IF
        System.out.println("PLEASE ENTER VALID VALUE");
        double a = sc.nextDouble();
        if ( a > 100 ) {
            System.out.println("YOUR VALUE IS HIGHER THAN 100");
        }
        else if (a == 100) {
            System.out.println("YOUR VALUE IS 100");
        }
        else {
            System.out.println("YOUR VALUE IS LESS THAN 100");
        }
        */

        // THIS PART FOR SWITCH CASE
        System.out.println("PLEASE VALUE FOR YOUR ACCOUNT");
        int account = sc.nextInt();
        switch (account) {
            case 1 :  // WE DON'T USE ; WE USE :
            System.out.println("WELCOME B");
            break;
            case 2 :
            System.out.println("WELCOME A");
            break;
            case 3 :
            System.out.println("WELCOME T");
            break;
            case 4 :
            System.out.println("WELCOME U");
            break;
            default :
            System.out.println("YOU DON'T HAVE ANY ACCOUNT");
            break;
        }
        System.out.println("TOPICIF IS OVER");
    }
}