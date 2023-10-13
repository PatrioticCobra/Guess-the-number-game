// Note that color will still be added to the game, most likely red and orange
// This is just how I would like to structure the game.
import javax.swing.*;
import java.awt.*;

public class HomePage {

    public static void ScreenON(){
        boolean screen = true;
    }

    public static void ScreenOff(){

    }
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Guess the number?!");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Guess The Number!!!");
        titleLabel.setBounds(250, 30, 300, 80);
        Font wackyFont = new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18);
        titleLabel.setFont(wackyFont);
        panel.add(titleLabel);

        JButton button = new JButton("Play");
        button.setBounds(290, 120, 100, 25);

        Images hat = new Images();
        hat.MagicHat(50, -40, 150, 300, panel);

        panel.add(button);

        frame.setVisible(true);
    }
}
