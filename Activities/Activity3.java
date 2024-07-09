import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inp = input.nextLine();

        int stringLength = inp.length();
        System.out.println("Length: " + stringLength);

        String stringUpperCase = inp.toUpperCase();
        System.out.println("Uppercase: " + stringUpperCase);

        String stringLowerCase = inp.toLowerCase();
        System.out.println("Lowercase: " + stringLowerCase);

        if (stringLength > 0) {
            char firstChar = inp.charAt(0);
            System.out.println("First character is: " + firstChar);
        }
        else {
            System.out.println("Empty String");
        }


        if (stringLength > 0) {
            char lastChar = inp.charAt(stringLength - 1);
            System.out.println("Last character is: " + lastChar);
        }
        else{
            System.out.println("Empty String");
        }


        if (stringLength >= 5) {
            String subString = inp.substring(1,5);
            System.out.println("2nd to 5th Substring: "+ subString);
        }
        else if (stringLength > 1){
            String subString = inp.substring(1);
            System.out.println("2nd to Last Substring: "+ subString);
        }
        else {
            System.out.println("String is too short.");
        }

        input.close();

    }
}
