package practice;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Practice04 extends JFrame {

  public Practice04() {
    Color[] colorArr = {
      Color.RED,
      Color.ORANGE,
      Color.YELLOW,
      Color.GREEN,
      Color.CYAN,
      Color.BLUE,
      Color.MAGENTA,
      Color.GRAY,
      Color.PINK,
      Color.LIGHT_GRAY,
    };
    setTitle("Ten Color Buttons Frame");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout());

    for (int i = 0; i < 10; i++) {
      JButton button = new JButton(Integer.toString(i));
      button.setBackground(colorArr[i]);
      contentPane.add(button);
    }
  }

  public static void main(String[] args) {
    Practice04 practice04 = new Practice04();
    practice04.setVisible(true);
  }
}
