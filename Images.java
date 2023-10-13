import javax.swing.*;

public class Images {

    public void MagicHat(int XAxis, int YAxis, int width, int height, JPanel panel){

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\blessing\\OneDrive\\Pictures\\magicHat.jpg");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(XAxis,YAxis, width, height);
        panel.add(label);
    }

    public void Magician(int XAxis, int YAxis, int width, int height ,JPanel panel){

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\blessing\\OneDrive\\Pictures\\magician.png");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(XAxis,YAxis, width, height);
        panel.add(label);
    }

}