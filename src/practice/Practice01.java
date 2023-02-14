package practice;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Practice01 extends JFrame {

  public Practice01() {
    setTitle("Let's study Java");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout(5, 7));
    contentPane.add(new JButton("North"), BorderLayout.NORTH);
    contentPane.add(new JButton("South"), BorderLayout.SOUTH);
    contentPane.add(new JButton("East"), BorderLayout.EAST);
    contentPane.add(new JButton("West"), BorderLayout.WEST);
    contentPane.add(new JButton("Center"), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    Practice01 practice01 = new Practice01();
    practice01.setVisible(true);
  }
}
