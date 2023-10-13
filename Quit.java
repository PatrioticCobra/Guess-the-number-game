import javax.swing.*;
import java.awt.*;

public class Quit {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("<html> Would you like to continue playing???</html>");
        titleLabel.setBounds(75, 30, 400, 80);
        Font wackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18);
        titleLabel.setFont(wackyFont);
        panel.add(titleLabel);

        JButton yesButton = new JButton("Yes");
        yesButton.setBounds(100, 150, 80, 25);
        panel.add(yesButton);

        JButton noButton = new JButton("No");
        noButton.setBounds(300, 150, 80, 25);
        panel.add(noButton);

        frame.setVisible(true);
    }
}
