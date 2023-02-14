package practice;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Practice03 extends JFrame {

  public Practice03() {
    setTitle("Ten Color Buttons Frame");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout());

    for (int i = 0; i < 10; i++) {
      JButton button = new JButton(Integer.toString(i));
      contentPane.add(button);
    }
  }

  public static void main(String[] args) {
    Practice03 practice03 = new Practice03();
    practice03.setVisible(true);
  }
}
