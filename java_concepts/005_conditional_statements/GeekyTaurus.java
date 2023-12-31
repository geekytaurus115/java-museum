import java.util.*;

public class GeekyTaurus {

    /*
     * ******** Conditional Statements *******
     * if, else
     * else if
     * switch
     * break
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("Adult!");
        // } else {
        // System.out.println("Not Adult!");
        // }
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal!");
        } else if (a > b) {
            System.out.println("Greater!");
        } else {
            System.out.println("Lesser!");
        }

        // ********** Switch Case **********
        System.out.println("Enter button no: ");
        int buttonNo = sc.nextInt();
        switch (buttonNo) {
            case 1:
                System.out.println("Namaskar!");
                break;
            case 2:
                System.out.println("Namaste!");
                break;
            case 3:
                System.out.println("Bonjour!");
                // here don't specify break
                // so if case 3 occure then after executing this case
                // below case will excute until get break
            default:
                System.out.println("Hello!");
                break;
        }

    }

}
