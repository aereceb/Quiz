# Quiz
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
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game! Good luck!");
        System.out.println("1. Geography");
        System.out.println("2. Science");
        System.out.println("3. Sports");
        System.out.print("Choose a category:");
        int category = input.nextInt();
        if (category > 0 || category < 4) {
            switch (category) {
                case 1:
                    int score = 0;
                    ArrayList<String[]> questionsGeo = readQuestionsFromCSV("questionsGeography.csv");
                    ArrayList<String[]> shuffledQuestionsGeo = new ArrayList<>(questionsGeo);
                    Collections.shuffle(shuffledQuestionsGeo);
                    for (int i = 0; i < shuffledQuestionsGeo.size(); i++) {
                        String[] question = shuffledQuestionsGeo.get(i);
                        System.out.println("Question " + (i + 1) + ":");
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
                        String selectedAnswer = answers.get(selectedAnswerIndex - 1);
                        String correctAnswer = question[1];
                        if (selectedAnswer.equals(correctAnswer)) {
                            System.out.println("Correct!");
                            score++;
                        } else {
                            System.out.println("Wrong answer. Game over!");
                            break;
                        }
                    }
                    System.out.println("Quiz game over. Your score: " + score + ". Congrats!!!");
                    break;
                case 2:
                    int score1 = 0;
                    ArrayList<String[]> questionsScience = readQuestionsFromCSV("questionsScience.csv");
                    ArrayList<String[]> shuffledQuestionsScience = new ArrayList<>(questionsScience);
                    Collections.shuffle(shuffledQuestionsScience);
                    for (int i = 0; i < shuffledQuestionsScience.size(); i++) {
                        String[] question = shuffledQuestionsScience.get(i);
                        System.out.println("Question " + (i + 1) + ":");
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
                        System.out.print("Enter answer:");
                        int selectedAnswerIndex = input.nextInt();
                        String selectedAnswer = answers.get(selectedAnswerIndex - 1);
                        String correctAnswer = question[1];
                        if (selectedAnswer.equals(correctAnswer)) {
                            System.out.println("Correct!");
                            score1++;
                        } else {
                            System.out.println("Wrong answer. Game over!");
                            break;
                        }
                    }
                    System.out.println("Quiz game over. Your score: " + score1 + ". Congrats!!!");
                    break;
                case 3:
                    int score2 = 0;
                    ArrayList<String[]> questionsSports = readQuestionsFromCSV("questionsSports.csv");
                    ArrayList<String[]> shuffledQuestions = new ArrayList<>(questionsSports);
                    Collections.shuffle(shuffledQuestions);
                    for (int i = 0; i < shuffledQuestions.size(); i++) {
                        String[] question = shuffledQuestions.get(i);
                        System.out.println("Question " + (i + 1) + ":");
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
                        String selectedAnswer = answers.get(selectedAnswerIndex - 1);
                        String correctAnswer = question[1];
                        if (selectedAnswer.equals(correctAnswer)) {
                            System.out.println("Correct!");
                            score2++;
                        } else {
                            System.out.println("Wrong answer. Game over!");
                            break;
                        }
                    }
                    System.out.println("Quiz game over. Your score: " + score2 + ". Congrats!!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
