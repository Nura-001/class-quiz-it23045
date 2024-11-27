import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        
        
        System.out.println("Answer the following questions :");

        // Question 1
        System.out.println("1. What is the capital of Bangladesh?");
        System.out.println("a) Dhaka\nb) Chittagong\nc) Khulna\nd) Sylhet");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("a")) {
            score += 5;
        } else {
            score -= 1;
        }

        // Question 2
        System.out.println("2. What is the national flower of Bangladesh?");
        System.out.println("a) Rose\nb) Water Lily\nc) Sunflower\nd) Jasmine");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            score += 5;
        } else {
            score -= 1;
        }

        // Question 3
        System.out.println("3. In which year did Bangladesh gain independence?");
        System.out.println("a) 1971\nb) 1947\nc) 1952\nd) 1965");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("a")) {
            score += 5;
        } else {
            score -= 1;
        }

        // Question 4
        System.out.println("4. What is the longest river in Bangladesh?");
        System.out.println("a) Jamuna\nb) Padma\nc) Meghna\nd) Brahmaputra");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("a")) {
            score += 5;
        } else {
            score -= 1;
        }

        // Question 5
        System.out.println("5. What is the name of the largest mangrove forest located in Bangladesh?");
        System.out.println("a) Sundarbans\nb) Chittagong Hill Tracts\nc) Madhupur Forest\nd) Ratargul Swamp Forest");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("a")) {
            score += 5;
        } else {
            score -= 1;
        }

        // Result
        System.out.println("You scored " + score + " points!");
        if (score == 25) {
            System.out.println("Excellent! ");
        } else if (score >= 15) {
            System.out.println("Good job! But you can improve.");
        } else {
            System.out.println("Sorry");
        }

        
    }
}
