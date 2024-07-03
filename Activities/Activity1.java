import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
       
        int num1,num2,num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter number only!");
            input.next();
        }
        num1= input.nextInt();

        System.out.print("Enter 2nd number: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter numbers only!");
            input.next();
        }
        num2 = input.nextInt();

        System.out.print("Enter 3rd number: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter numbers only!");
            input.next();
        }
        num3 = input.nextInt();

        if (num1 == num2 && num1 == num3)
            System.out.println("All is equal.");
        else {
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The highest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The highest number is: " + num2);
            } else {
                System.out.println("The highest number is: " + num3);
            }
        }


    }
}