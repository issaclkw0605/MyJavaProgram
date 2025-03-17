/*
 * 
 *  An Java 8 Execise using Lamda expersion 
 *  https://www.geeksforgeeks.org/lambda-expressions-java-8/
 * 
 *  Java 11 using Lamda 
 *  https://www.geeksforgeeks.org/java-11-lambda-features-with-examples/?ref=ml_lbp
 * 
 */

 interface Executable {
    int execute(int a, int b );
}

interface StringExecutable {
    String execute(String a);
}

class Runner {
    
    public void run(Executable e) {
        System.out.println("Exexcute code block");
        int value = e.execute(12,13);
        System.out.println("Return value: " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Exexcute code block");
        String value = e.execute("Hello me!");
        System.out.println("Return value: " + value);
    }


}

// () -> System.out.println("Hello there");

/*
    () -> {
            System.out.println("This is code pass in lamda expression");
            System.out.println("Hello there");
        }
*/

/*
 
    () -> {
            System.out.println("This is code pass in lamda expression");
            System.out.println("Hello there");
            return 8;
        }

 */

/*
     () -> {
            return 8;
        }
 */
// () -> 8

/*
    ( int a ) -> { 
                System.out.println("Hello there");
                return 8 + a; 
            } 
 */

/*
 Java inferred type for a
  ( a ) -> { 
            System.out.println("Hello there");
            return 8 + a; 
        } 

    or 
   a  -> { 
            System.out.println("Hello there");
            return 8 + a; 
        } 


 */

/*
    (a,b) -> { 
                System.out.println("Hello there");
                return a + b;
            } 
*/

public class App {
    public static void main(String[] args) throws Exception {

        int d = 100;

        Runner runner = new Runner();
        runner.run(  new Executable() {
           public int execute(int a, int b) {
                System.out.println("Hello there");
                int d = 1000;
                return a + b + d;
           } 
        });
        
        System.out.println("Java 8 lamda=============");

        runner.run( (a,b) -> { 
            System.out.println("Hello there");
            // cann't do this because lamda does have scope 
             //int d = 1000;
            return a + b + d;
        });

        System.out.println("Java 8 lamda version 2 =========="); 
        Executable ex1 = (a,b) -> { 
            System.out.println("Hello there");
            // cann't do this because lamda does have scope 
             //int d = 1000;
            return a + b + d;
        };

        runner.run(ex1);

        System.out.println("Java 8 lamda version 3 =========="); 
        // using as Compabiable object

        Object ex2 = (Executable)(a,b) -> { 
            System.out.println("Hello there");
            // cann't do this because lamda does have scope 
             //int d = 1000;
            return a + b + d;
        };

        runner.run((Executable)ex2);


    }
}
