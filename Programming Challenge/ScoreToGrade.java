import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        String grade;

        if (score >= 90) {
            System.out.println("");
            grade = "A";
        }
        else if (score >= 80 && score <=89) {
            grade = "B";
        }
        else if (score >= 70 && score <=79) {
            grade = "C";
        }
        else if (score >= 60 && score <=69) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        
        System.out.println("\nYour score is: " + score);
        System.out.println("Your grade is: " +grade);
        

    }
}
