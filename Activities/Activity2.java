import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN.");
        } else {
            System.out.println(num + " is ODD.");
        }

        
        if (num > 0) {
            System.out.println(num + " is POSITIVE.");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE.");
        } else {
            System.out.println(num + " is ZERO.");
        }

        input.close();
    }
}