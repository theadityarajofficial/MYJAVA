import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.BreakIterator;

public class wordcounter extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton countButton;
    private JLabel resultLabel;

    public wordcounter() {
        setTitle("Word Counter GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);


        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        textField = new JTextField(20);
        countButton = new JButton("Count Words");
        resultLabel = new JLabel("Word count will be displayed here");

        countButton.addActionListener(this);

        panel.add(textField);
        panel.add(countButton);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String userInput = textField.getText();
            int wordCount = countWords(userInput);

            resultLabel.setText("Word count: " + wordCount);
        }
    }

    private int countWords(String input) {
        BreakIterator wordIterator = BreakIterator.getWordInstance();
        wordIterator.setText(input);

        int wordCount = 0;
        int start = wordIterator.first();
        int end = wordIterator.next();
        while (end != BreakIterator.DONE) {
            String word = input.substring(start, end);
            if (Character.isLetterOrDigit(word.charAt(0))) {
                wordCount++;
            }
            start = end;
            end = wordIterator.next();
        }
        return wordCount;
    }

    public static void main(String[] args) {
        new wordcounter();
    }

}
