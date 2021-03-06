import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuizCardPlayer {
    private JFrame frame;
    private JTextArea display;
    private JButton nextButton;
    private JPanel mainPanel;
    private ArrayList<QuizCard> cardList = new ArrayList<>();
    private boolean isShowAnswer;
    private QuizCard currentCard;
    private int currentCardIndex;

    public QuizCardPlayer() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isShowAnswer) {
                    display.setText(currentCard.getAnswer());
                    nextButton.setText("Next Card");
                    isShowAnswer = false;
                } else {
                    if (currentCardIndex < cardList.size()) {
                        showNextCard();
                    } else {
                        display.setText("That was the last card");
                        nextButton.setEnabled(false);
                    }
                }
            }

            private void showNextCard() {
                currentCard = cardList.get(currentCardIndex);
                currentCardIndex++;
                display.setText(currentCard.getQuestion());
                nextButton.setText("Show Answer");
                isShowAnswer = true;
            }
        });
    }

    public void buildQuizPlayer() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        frame = new JFrame("Quiz Card Player");
        frame.setContentPane(mainPanel);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class OpenMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            FileHelper.readFile(fileOpen.getSelectedFile(), cardList);
        }
    }
}
