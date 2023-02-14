import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

  public GridLayoutEx() {
    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
    Container contentPane = getContentPane();
    //4x3 그리드에 gap 5
    contentPane.setLayout(new GridLayout(4, 3, 5, 5));
    contentPane.add(new JButton("1"));
    contentPane.add(new JButton("2"));
    contentPane.add(new JButton("3"));
    contentPane.add(new JButton("4"));
    contentPane.add(new JButton("5"));
    contentPane.add(new JButton("6"));
    contentPane.add(new JButton("7"));
    contentPane.add(new JButton("8"));
    contentPane.add(new JButton("9"));
    contentPane.add(new JButton("0"));
  }

  public static void main(String[] args) {
    GridLayoutEx gridLayout = new GridLayoutEx();
    gridLayout.setVisible(true);
  }
}