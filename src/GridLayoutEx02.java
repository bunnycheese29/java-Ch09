import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx02 extends JFrame {

  public GridLayoutEx02() {
    setTitle("GridLayout Sample");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
    Container contentPane = getContentPane();

    contentPane.setLayout(new GridLayout(4, 2, 5, 5));

    contentPane.add(new JLabel("이름"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel("학번"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel("학과"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel("과목"));
    contentPane.add(new JTextField(""));
  }

  public static void main(String[] args) {
    GridLayoutEx02 gridLayout = new GridLayoutEx02();
    gridLayout.setVisible(true);
  }
}
