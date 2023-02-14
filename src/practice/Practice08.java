package practice;

import java.awt.*;
import javax.swing.*;

public class Practice08 extends JFrame {

  public Practice08() {
    setTitle("여러 개의 패널을 가진 프레임");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel northPanel = new JPanel();
    northPanel.setLayout(new FlowLayout());
    northPanel.setBackground(Color.GRAY);
    northPanel.add(new JButton("열기"));
    northPanel.add(new JButton("닫기"));
    northPanel.add(new JButton("나가기"));

    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());
    southPanel.setBackground(Color.YELLOW);
    southPanel.add(new JButton("Word Input"));
    southPanel.add(new JTextField(10));

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(null);
    for (int i = 0; i < 10; i++) {
      int x = (int) (Math.random() * 150);
      int y = (int) (Math.random() * 150);
      JLabel label = new JLabel("*");
      label.setSize(20, 20);
      label.setForeground(Color.RED);
      label.setLocation(x, y);
      label.setOpaque(true);
      centerPanel.add(label);
    }
    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(southPanel, BorderLayout.SOUTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);

    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    Practice08 practice08 = new Practice08();
    practice08.setVisible(true);
  }
}
