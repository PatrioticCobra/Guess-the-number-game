import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends Registration implements ActionListener {
    private static JLabel success;
    private static JPasswordField passwordText;
    private static JTextField userText;

    public static void main(String[] args) {

        // Creating the frame and panel for my Guess the Number game
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10, 50, 80, 25);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(100, 50, 165, 25);
        panel.add(userText);

        // Creating back button
        JButton backButton = new JButton("<-");
        backButton.setBounds(10, 10, 30, 25);
        backButton.setBorder(new RoundedBorder(30)); //10 is the radius
        panel.add(backButton);

        // Creating text next for the back button
        JLabel TitleLabel = new JLabel("Login into Account");
        TitleLabel.setBounds(100, -20, 500, 80);
        Font WackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12);
        TitleLabel.setFont(WackyFont);
        panel.add(TitleLabel);

        // Creating area the area to add your password.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 80, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10, 110, 80, 25);
        button.addActionListener(new Login());
        panel.add(button);


        success = new JLabel("");
        success.setBounds(10, 140, 300, 25);
        panel.add(success);

        //Inserting image
        Images hat = new Images();
        hat.MagicHat(350, -40, 150, 300, panel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passwordText.getText();

        //Once we get database connectivity this if statement will be used to connect compare data in registration to login
        if (Objects.equals(username, "Cobra") && Objects.equals(password, "drowssap")) {
            success.setText("Login Successful! Welcome Back " + username +
                    "\nPlease continue from where you left off ;)");

        } else {
            success.setText("<html> The username and password do not exist. Please register an account </html>");

        }
    }
}
