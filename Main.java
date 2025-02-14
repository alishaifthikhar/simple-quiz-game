import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the smallest prime number?",
            "Which element has the chemical symbol 'O'?"
        };

        String[][] options = {
            {"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
            {"A. Earth", "B. Venus", "C. Mars", "D. Jupiter"},
            {"A. Mark Twain", "B. Harper Lee", "C. J.K. Rowling", "D. Ernest Hemingway"},
            {"A. 0", "B. 1", "C. 2", "D. 3"},
            {"A. Oxygen", "B. Gold", "C. Silver", "D. Helium"}
        };

        char[] correctAnswers = {'A', 'C', 'B', 'C', 'A'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            char userAnswer;
            while (true) { // Input validation loop
                System.out.print("Enter your answer (A, B, C, or D): ");
                userAnswer = scanner.next().toUpperCase().charAt(0);

                if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input! Please enter only A, B, C, or D.");
                }
            }

            // Using switch-case for readability
            switch (userAnswer) {
                case 'A': case 'B': case 'C': case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        score++;
                    }
                    break;
            }
        }

        double percentageScore = ((double) score / questions.length) * 100;
        System.out.printf("\nYour final score is: %.2f%%\n", percentageScore);
        
        scanner.close();
    }
}
