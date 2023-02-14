package practice;

import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  public Practice07() {
    setTitle("계산기 프레임");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
    setVisible(true);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel northPanel = new JPanel();
    northPanel.setLayout(new FlowLayout());
    northPanel.setBackground(Color.GRAY);
    northPanel.add(new JLabel("수식입력"));
    northPanel.add(new JTextField(16));

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(4, 4, 5, 5));
    for (int i = 0; i < 10; i++) {
      JButton button = new JButton("" + i);
      centerPanel.add(button);
    }
    centerPanel.add(new JButton("CE"));
    centerPanel.add(new JButton("계산"));

    String marks[] = { "+", "-", "x", "/" };
    for (int i = 0; i < marks.length; i++) {
      JButton button = new JButton(marks[i]);
      button.setBackground(Color.GREEN);
      centerPanel.add(button);
    }

    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());
    southPanel.setBackground(Color.GRAY);
    southPanel.add(new JLabel("계산결과"));
    southPanel.add(new JTextField(16));

    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(southPanel, BorderLayout.SOUTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    Practice07 practice07 = new Practice07();
    practice07.setVisible(true);
  }
}
