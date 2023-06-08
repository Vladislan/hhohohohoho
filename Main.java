import java.util.Scanner;

public class Main {
    private static final String ADMIN_PASSWORD = "1111";
    private static final String[] QUESTIONS = {
            "What is the correct form of the verb in the Past Perfect Continuous tense?",
            "Which of the following is an example of a sentence in the Past Perfect Continuous tense?",
            "What is the structure of the Past Perfect Continuous tense?",
            "What is the function of the Past Perfect Continuous tense?",
            "Choose the correct option: I _______ for three hours before he arrived."
    };

    private static final String[][] OPTIONS = {
            {"was been", "had been", "have been", "had being"},
            {"She had been studying all night.", "He will be studying tomorrow.", "They are studying now.", "We studied yesterday."},
            {"had + been + present participle", "was + been + present participle", "have + been + present participle", "had + being + present participle"},
            {"To describe an action that started in the past and continued up until another point in the past.", "To describe an action that will happen in the future.", "To describe an action happening at the present moment.", "To describe an action that will happen in the future and continue into the past."},
            {"have been waiting", "had been waiting", "has been waiting", "was being waiting"}
    };

    private static final int[] CORRECT_ANSWERS = {1, 0, 0, 0, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Past Perfect Continuous quiz!");
        System.out.println("Please answer the following questions by selecting the correct option (a, b, c, or d).");
        System.out.println("Enter 'q' at any time to quit.");

        int totalQuestions = QUESTIONS.length;
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(QUESTIONS[i]);

            for (int j = 0; j < OPTIONS[i].length; j++) {
                System.out.println((char) (j + 'a') + ") " + OPTIONS[i][j]);
            }

            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("q")) {
                System.out.println("Quiz aborted.");
                return;
            } else if (answer.equals(ADMIN_PASSWORD)) {
                showCorrectAnswers();
                return;
            } else if (!answer.matches("[a-d]")) {
                System.out.println("Invalid option. Please try again.");
                i--;
            } else {
                int selectedOption = answer.charAt(0) - 'a';
                if (selectedOption == CORRECT_ANSWERS[i]) {
                    correctAnswers++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                }
            }
        }

        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println("\nQuiz completed.");
        System.out.println("Your score: " + score + "%");
    }

    private static void showCorrectAnswers() {
        System.out.println("\nCorrect answers:");

        for (int i = 0; i < QUESTIONS.length; i++)
            System.out.println("Question ");
    }


}