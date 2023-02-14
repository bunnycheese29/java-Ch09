package practice;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Practice05 extends JFrame {

  public Practice05() {
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
      Color.WHITE,
      Color.DARK_GRAY,
      Color.BLACK,
      Color.ORANGE,
      Color.BLUE,
      Color.MAGENTA,
    };
    setTitle("4x4 Color Frame");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 200);
    setVisible(true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 4));
    for (int i = 0; i < 16; i++) {
      JLabel label = new JLabel(Integer.toString(i));
      label.setOpaque(true);
      //new Color(rgb)
      label.setBackground(colorArr[i]);
      contentPane.add(label);
    }
  }

  public static void main(String[] args) {
    Practice05 practice05 = new Practice05();
    practice05.setVisible(true);
  }
}
