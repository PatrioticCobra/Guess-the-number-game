// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private static JTextField userText = new JTextField();
    private static JLabel screen;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // Inserting Magician Hat
        Images magician = new Images();
        magician.Magician(100, 150, 300, 300, panel);

        // Creating text next for the back button
        JLabel TitleLabel = new JLabel("What is the Number???");
        TitleLabel.setBounds(300, 40, 500, 80);
        Font WackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18);
        TitleLabel.setFont(WackyFont);
        panel.add(TitleLabel);

        // Creating Instruction Label.
        JLabel instructionLabel = new JLabel("<html>The number is in between 1 and 10. Do you know what the number " +
                "is???</html>");
        instructionLabel.setBounds(450, 180, 400, 80);
        instructionLabel.setFont(WackyFont);
        panel.add(instructionLabel);
        frame.setVisible(true);

        userText.setBounds(450, 275, 100, 25);
        panel.add(userText);

        //For printing text to the screen
        screen = new JLabel("");
        screen.setBounds(450, 300, 300, 25);
        panel.add(screen);

        JButton answer = new JButton("Answer");
        answer.setBounds(545, 275, 100, 25);
        answer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lives = 3;
                Random random = new Random();
                int randomNum = random.nextInt(10) + 1;
                int guess;
                for (int i = 0; i < lives; i++) {
                    System.out.println("Please guess the number from 1 to 10:");
                    guess = Integer.parseInt(userText.getText());

                    if (guess == randomNum) {
                        screen.setText("Congratulations, you have guessed the right number!");
                        break;
                    } else if (guess > randomNum) {
                        screen.setText("The number you have guessed is too high, please try going lower.");
                    } else {
                        screen.setText("The number you have guessed is too low, please try going higher.");
                    }
                    if (i == lives - 1) {
                        screen.setText("GAME OVER");
                        screen.setText("The number was " + randomNum);
                    }
                }
            }
        });
        panel.add(answer);

        JButton quit = new JButton("Quit");
        quit.setBounds(750, 500, 100, 25);
        panel.add(quit);
    }
}
