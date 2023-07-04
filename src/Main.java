import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePathName = "questions.csv";
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(filePathName))) {
            //geography
            wr.write("Which country is famous for the pyramids?,Egypt,Bulgaria,France,Russia");
            wr.newLine();
            wr.write("The capital of England is?,London,Targovishte,Berlin,Rome");
            wr.newLine();
            wr.write("On which island do lemurs live?,Madagascar,Cyprus,Greenland,Великобритания");
            wr.newLine();
            wr.write("In which country is the city of Seattle located?,USA,Canada,Mexico,UK");
            wr.newLine();
            wr.write("The highest peak in the world is?,Everest,Kangchenjunga,Lhotse,Manaslu");
            wr.newLine();
            wr.write("What is the capital of Bulgaria?,Sofia,Varna,Burgas,Targovishte");
            wr.newLine();
            wr.write("What do pandas eat?,Bamboo,Chicken,Snacks,Chocolate");
            wr.newLine();
            wr.write("What is the capital of Chile?,Santiago,Varna,Brazil,Mexico");
            wr.newLine();//science
            wr.write("Where are neurons located?,Brain,Legs,Nowhere,Arms");
            wr.newLine();
            wr.write("What color is pure sulfur?,Yellow,White,Red,Black");
            wr.newLine();
            wr.write("What color are endangered species marked?,Red,Black,Gold,Rose");
            wr.newLine();
            wr.write("What is the name of the number 3.1415...?,Pi,Pokemon,One,Three");
            wr.newLine();
            wr.write("What can circle the earth 7.5 times in one second?,Light,Plane,Human,Rocket");
            wr.newLine();
            wr.write("Which animal or bird lays the largest eggs in the world?,Ostrich,Parrot,Crow,Flamingo");
            wr.newLine();
            wr.write("How do you spell the chemical element Astat?,At,As,Ta,Ast");
            wr.newLine();
            wr.write("What is the outside of the cell called?,Membrane,Core,Cytoplasm,DNA");
            wr.newLine();//sports
            wr.write("Who is Neymar?,football player,basketball player,tennis player,programmer");
            wr.newLine();
            wr.write("What is the most popular sport in the world?,Football,Basketball,Tennis,Swimming");
            wr.newLine();
            wr.write("What sport is played with a racket?,Tennis,Football,Volleyball,Boxing");
            wr.newLine();
            wr.write("Where did Aikido come from?,Japan,Chine,Bulgaria,Turkey");
            wr.newLine();
            wr.write("The most popular sport in Brazil is?,Football,Baseball,Volleyball,Weightlifting");
            wr.newLine();
            wr.write("What is ice hockey played with?,Stick,Ball,Nothing,Ice");
            wr.newLine();
            wr.write("Which athletes should be weighed before competition?,Boxers,Football player,Swimmers,Dancers");
            wr.newLine();
            wr.write("In which country is FC Roma located?,Italy,France,UK,Germany");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}