import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inp = input.nextLine();
        
        String reverse = "";
        for(int i = inp.length() - 1; i >= 0; i--) {
            reverse += inp.charAt(i);
        }

        boolean palindrome = true;
        for(int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        
        if (palindrome) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not Palindrome!");
        }
    }
}
