import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class EntryPoint extends Registration implements ActionListener{
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Guess the number?!");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // Creating a register button
        JButton register = new JButton("Register");
        register.setBounds(60, 150, 100, 25);
        register.addActionListener(new EntryPoint()); // Still going to edit this
        panel.add(register);

        // creating prompt text for whether you woul like to register or not
        JLabel titleLabel = new JLabel("Please Login or Register to play the Game");
        titleLabel.setBounds(80, 40, 500, 80);
        Font wackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18);
        titleLabel.setFont(wackyFont);
        panel.add(titleLabel);

        // Creating text next for the back button
        JLabel TitleLabel = new JLabel("YOU READY TO PLAY??? ");
        TitleLabel.setBounds(100, -20, 500, 80);
        Font WackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12);
        TitleLabel.setFont(WackyFont);
        panel.add(TitleLabel);

        // Creating back button
        JButton backButton = new JButton("<");
        backButton.setBounds(10, 10, 30, 25);
        backButton.setBorder(new RoundedBorder(30)); //10 is the radius
        panel.add(backButton);

        // Creating Login button
        JButton button = new JButton("Login");
        button.setBounds(350, 150, 100, 25);
        button.addActionListener( new EntryPoint()); // Still going to edit this
        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}