import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static ArrayList<String[]> readQuestionsFromCSV(String filename) throws IOException {
        ArrayList<String[]> questions = new ArrayList<>();
        FileReader filereader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(filereader);
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] questionData = line.split(",");
                questions.add(questionData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
        return questions;
    }

    public static void playQuizCategory(String categoryName, String csvFilename) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's start " + categoryName + " Quiz!");
        int score = 0;
        ArrayList<String[]> questions = readQuestionsFromCSV(csvFilename);
        ArrayList<String[]> shuffledQuestions = new ArrayList<>(questions);
        Collections.shuffle(shuffledQuestions);
        for (int i = 0; i < shuffledQuestions.size(); i++) {
            String[] question = shuffledQuestions.get(i);
            System.out.print("Question " + (i + 1) + ": ");
            String questionText = question[0];
            System.out.println(questionText);
            ArrayList<String> answers = new ArrayList<>();
            for (int j = 1; j < question.length; j++) {
                answers.add(question[j]);
            }
            Collections.shuffle(answers);
            for (int j = 0; j < answers.size(); j++) {
                String answer = answers.get(j);
                System.out.println((j + 1) + ". " + answer);
            }
            System.out.print("Answer:");
            int selectedAnswerIndex = input.nextInt();
            if (selectedAnswerIndex < 5 && selectedAnswerIndex > 0) {
                String selectedAnswer = answers.get(selectedAnswerIndex - 1);
                String correctAnswer = question[1];
                if (selectedAnswer.equals(correctAnswer)) {
                    System.out.println();
                    System.out.println("Correct!");
                    System.out.println();
                    score++;
                } else {
                    System.out.println("Wrong answer. Game over!");
                    break;
                }
            } else {
                System.out.println("Invalid answer!");
            }
        }
        System.out.println("Quiz game ended. Your score is " + score + "." + "Congrats!");
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game!");
        System.out.println("1. Geography");
        System.out.println("2. Science");
        System.out.println("3. Sports");
        System.out.print("Choose a category:");
        int category = input.nextInt();
        switch (category) {
            case 1:
                playQuizCategory("Geography", "questionsGeography.csv");
                break;
            case 2:
                playQuizCategory("Science", "questionsScience.csv");
                break;
            case 3:
                playQuizCategory("Sports", "questionsSports.csv");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
