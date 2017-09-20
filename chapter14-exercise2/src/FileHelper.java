import java.io.*;
import java.util.ArrayList;

public class FileHelper {

    public static void saveFile(File file, ArrayList<QuizCard> cardList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card : cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("couldn't write the cardlist out.");
            ex.printStackTrace();
        }
    }

    public static void readFile(File file, ArrayList<QuizCard> cardList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    makeCard(line, cardList);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void makeCard(String lineToParse, ArrayList<QuizCard> cardList) {
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
    }
}
