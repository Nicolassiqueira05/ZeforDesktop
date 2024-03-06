import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    static JButton B1, B2;
    static ImageIcon br, eua;
    static JLabel l;
    SoundPlayer sp = new SoundPlayer();

    public Window(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Zé app by Nicolas");
        this.setSize(600, 260);
        this.setVisible(true);
        this.setResizable(false);

        br = new ImageIcon(this.getClass().getResource("/resources/Brazuca.png"));
        eua = new ImageIcon(this.getClass().getResource("/resources/Eua.png"));

        B1 = new JButton();
        B2 = new JButton();

        JPanel jp = new JPanel();

        jp.add(B1);
        jp.add(B2);

        jp.setBackground(Color.green);

        this.add(jp);
        this.show();

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.playSound("Zedamanga.wav");
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sp.playSound("Mangojoe.wav");
            }
        });

        int newWidth = 240;
        int newHeight = 200;

        Image resizedBr = br.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        Image resizedEua = eua.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        br = new ImageIcon(resizedBr);
        eua = new ImageIcon(resizedEua);

        B1.setIcon(br);
        B2.setIcon(eua);
    }
}
