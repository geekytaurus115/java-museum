import java.util.Scanner;

public class GeekyTaurus {

    /*
     * ********** LOOPs **********
     * --> for loop
     * --> while loop
     * --> do-while loop
     */

    public static void main(String[] args) {
        /*
         * for (initialisation; condition; updation){
         * // do something
         * }
         */

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Hello World!");
        }

        /*
         * while (condition){
         * // do something
         * }
         */

        int i = 0;
        while (i < 5) {
            System.out.println(i + 1);
            i++;
        }

        /*
         * do {
         * // do something
         * } while (condition);
         */

        int j = 0;
        do {
            System.out.println(j + 1);
            j++;
        } while (j < 1);

        // Problem-1: Print the Sum of First n Natural Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;

        for (int k = 1; k <= n; k++) {
            sum += k;
        }
        System.out.println("Sum of first " + n + " Natural Numbers is " + sum);

        // Problem-2: Print the table of a number input by the user.
        System.out.println("Enter the number to print the table for:");
        int num = sc.nextInt();

        for (int p = 1; p <= 10; p++) {
            System.out.println(num + " * " + p + " = " + (num * p));
        }
    }

}
