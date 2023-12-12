import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Liza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Лиза");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton b = new JButton("Лиза");
		MouseListener mousebutton = new MouseListener();
		mousebutton.b1 = b;
		b.addMouseListener(mousebutton);
		JPanel p = new JPanel();
		p.add(b);
		f.add(p);
	}

}
