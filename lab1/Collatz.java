/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static void nextNumber(int n) {
       while (n != 1){
           System.out.print (n + " ");
           if (n % 2 == 0) {
               n = n/2;
           }
           else {
               n = 3 * n + 1;
           }
       }
       System.out.print(1);
    }

    public static void main(String[] args) {
        nextNumber(35);
    }
}

