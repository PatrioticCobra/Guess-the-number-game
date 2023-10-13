
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Registration implements ActionListener {
    private static JLabel success;
    private static JPasswordField confirmPasswordText;
    private static JPasswordField passwordText;
    private static JTextField userText;

    public static void main(String[] args) {
        // Creating the frame and panel for my Guess the Number game
        JFrame frame = new JFrame("Registration");
        JPanel panel = new JPanel();
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // Creating back button
        JButton backButton = new JButton("<-");
        backButton.setBounds(10, 10, 30, 25);
        backButton.setBorder(new RoundedBorder(30)); //10 is the radius
        panel.add(backButton);

        // Creating text next for the back button
        JLabel TitleLabel = new JLabel("Create an Account");
        TitleLabel.setBounds(100, -20, 500, 80);
        Font WackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12);
        TitleLabel.setFont(WackyFont);
        panel.add(TitleLabel);

        panel.setLayout(null);
        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10, 50, 80, 25);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(150, 50, 165, 25);
        panel.add(userText);

        // Creating area the area to add your password.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(150, 80, 165, 25);
        panel.add(passwordText);

        JLabel ConfirmPasswordLabel = new JLabel("Confirm Password");
        ConfirmPasswordLabel.setBounds(10, 110, 120, 25);
        panel.add(ConfirmPasswordLabel);

        confirmPasswordText = new JPasswordField();
        confirmPasswordText.setBounds(150, 110, 165, 25);
        panel.add(confirmPasswordText);

        JButton register = new JButton("Register");
        register.setBounds(10, 150, 100, 25);
        register.addActionListener(new Registration());
        panel.add(register);

        // This is going to be the frame to my game
        success = new JLabel("");
        success.setBounds(10, 170, 300, 25);
        panel.add(success);

        //Adding image to panel
        Images hat = new Images();
        hat.MagicHat(350, -40, 150, 300, panel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passwordText.getText();
        String confirmPassword = confirmPasswordText.getText();


        if (username != null || password != null) {
            if (Objects.equals(password, confirmPassword)){
                success.setText("Registration Successful! Continue to Login");
                File userRecord = new File("userrecord.txt");

                try {
                    File mainRecord = new File("C:\\Users\\blessing\\OneDrive\\Documents\\mainrecord.txt");
                    Scanner scan = new Scanner(mainRecord);

                    // Open the FileWriter in append mode to avoid overwriting data
                    FileWriter userWriter = new FileWriter(userRecord, true);
                    // Creating the person object.
                    Player person = new Player();
                    person.setUsername(username);
                    person.setPassword(password);
                    person.setPosition(0);// for now setting position to zero, remember to create ranking system
                    person.setScore(0);// for now setting score to zero, remember to update the score system in database


                    // Using overloaded version of person object.
                    person = new Player(person.getUsername(), person.getPassword(), person.getPosition(), person.getScore());
                    person.writeOutput();
                    String data = person.Write();
                    userWriter.write(data);
                    userWriter.write("\n" + "\n");
                    System.out.println("Finished writing data to user record. \n");

                    // Closing the FileWriter
                    userWriter.close();
                    scan.close();
                } catch (IOException i) {
                    System.out.println("An error has occurred!");
                    i.printStackTrace();
                }
            }else {
                success.setText("Your password does not match your confirmed password");
            }

        } else {
            success.setText("Please enter a new Username and Password.");
        }
    }
}
