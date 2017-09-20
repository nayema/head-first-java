import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuizCardBuilder {

    private JFrame frame;
    private JPanel mainPanel;
    private JTextArea question;
    private JTextArea answer;
    private JButton nextButton;
    private JLabel questionLabel;
    private JLabel answerLabel;
    private ArrayList<QuizCard> cardList;

    public QuizCardBuilder() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuizCard card = new QuizCard(question.getText(), answer.getText());
                cardList.add(card);
                CardHelper.clearCard(question, answer);
            }
        });
    }

    public void buildQuizCard() {
        cardList = new ArrayList<>();

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new NewMenuListener());
        fileMenu.add(newMenuItem);
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new SaveMenuListener());
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        frame = new JFrame("Quiz Card Builder");
        frame.setJMenuBar(menuBar);
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class NewMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardList.clear();
            CardHelper.clearCard(question, answer);
        }
    }

    private class SaveMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);

            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            FileHelper.saveFile(fileSave.getSelectedFile(), cardList);
        }
    }
}
