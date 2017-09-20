import javax.swing.*;

public class CardHelper {

    public static void clearCard(JTextArea question, JTextArea answer) {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
}
