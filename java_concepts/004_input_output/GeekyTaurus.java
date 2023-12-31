import java.util.*;

public class GeekyTaurus {

    /*
     * Java static typed language
     * --> Need to define variable type
     * 
     * Data Types - Primitive and Non-Primitive
     * 
     * Primitive (As per 64-bit System)
     * --> byte --> 1 byte (memory size) --> 8 bits
     * --> short --> 2 bytes
     * --> char --> 2 bytes
     * --> boolean --> 1 Bit
     * --> int --> 4 bytes
     * --> long --> 8 bytes
     * --> float --> 4 bytes
     * --> doublt --> 8 bytes
     * 
     * ### NOTE: one 0 or 1 means 1 bit,
     * 
     * Non-Primitive
     * --> String
     * --> Array
     * --> Class
     * --> Object
     * --> Interface
     * 
     */

    public static void main(String[] args) {
        // variables
        int a = 10;
        int b = 25;
        int sum = a + b;

        System.out.println(sum);

        /*
         * In the given program, when you write int sum = a + b;,
         * - the result of the addition a + b is immediately stored in the variable sum.
         * - If you instead directly print the result without storing it in a variable,
         * like this:
         */

        // public static void main(String[] args) {
        // // variables
        // int a = 10;
        // int b = 25;

        // System.out.println(a + b);
        // }

        /*
         * In this case, the result of a + b is not explicitly stored in a variable.
         * - However, it's important to understand that Java is an imperative
         * programming language, and in the process of executing this code,
         * - the result of a + b is temporarily calculated in the memory, but it's not
         * stored in a named variable.
         * - Instead, it's directly used as an argument for the println method.
         * 
         * - So, in a nutshell, the result of a + b is not stored in a specific
         * variable, but
         * - it exists in the memory temporarily for the purpose of printing it.
         * - Once the line is executed, the memory used for that temporary result is
         * released.
         * 
         * - This is different from the case where you explicitly store the result in a
         * variable (int sum = a + b;),
         * - where the result is stored in a named variable and can be used later in the
         * program.
         */

        /*
         * ******* Calculations on Java *******
         * --> In Java, no BODMAS rule works,
         * --> Operators working order
         * --> Parentheses, Exponents, Multiplication, Division (left to right),
         * Addition and Substraction (l to r)
         * 
         * a = 10, b = 5,
         * So, ab/a-b => 10*5/10-5 => 50/5 => 10
         * 
         * (A) int ans = a * b / a - b;
         * => 10 * 5 / 10 - 5
         * => 50 / 10 - 5
         * => 5 - 5
         * => 0
         * (B) int ans = (a * b) / (a - b);
         * => (10 * 5) / (10 - 5)
         * => 5
         * So (B) correct!
         */

        // *************** INPUT *************
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // for full name use sc.nextLine()

        // nextInt()
        // nextFloat()

        System.out.println(name);

    }
}
