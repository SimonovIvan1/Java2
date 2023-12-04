Java2Work
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

public class GraphDemo extends JFrame {
public GraphDemo() {
}

public void paint(Graphics g) {
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
int[] pointOne = new int[]{10, 295, 590};
int[] pointTwo = new int[]{500, 30, 500};
g2.setPaint(new GradientPaint(300.0F, 500.0F, Color.gray, 300.0F, 250.0F, Color.CYAN));
g2.fillPolygon(pointOne, pointTwo, 3);
Ellipse2D ellipseLeft = new Ellipse2D.Double(70.0, 400.0, 80.0, 80.0);
Ellipse2D ellipseReigth = new Ellipse2D.Double(450.0, 400.0, 80.0, 80.0);
g2.setPaint(new GradientPaint(300.0F, 450.0F, Color.YELLOW, 300.0F, 400.0F, Color.RED));
g2.fill(ellipseLeft);
g2.fill(ellipseReigth);
Ellipse2D ellipseUp = new Ellipse2D.Double(255.0, 100.0, 80.0, 80.0);
g2.setPaint(new GradientPaint(300.0F, 150.0F, Color.YELLOW, 300.0F, 100.0F, Color.RED));
g2.fill(ellipseUp);
Ellipse2D elipseMain = new Ellipse2D.Double(174.0, 210.0, 250.0, 250.0);
g2.setPaint(new GradientPaint(10.0F, 250.0F, Color.white, 590.0F, 250.0F, Color.GREEN));
g2.fill(elipseMain);
g2.setColor(Color.black);
g2.setStroke(new BasicStroke(2.5F));
g2.setColor(new Color(0xF50606));
CubicCurve2D c = new CubicCurve2D.Double();
c.setCurve(150.0, 300.0, 300.0, 600.0, 300.0, 110.0, 450.0, 300.0);
g2.draw(c);
//g2.clip(new Ellipse2D.Double(150.0, 250.0, 175.0, 175.0));
float[] dashThing = new float[]{1.0F, 10.0F, 15.0F, 10.0F};
g2.setColor(new Color(0.0F, 0.0F, 0.0F, 0.8F));
g2.setStroke(new BasicStroke(3.5F, 1, 0, 3.5F, dashThing, 0.0F));
RoundRectangle2D Figure = new RoundRectangle2D.Double(240.0, 30.0, 180.0, 70.0, 30.0, 30.0);
AffineTransform scale = AffineTransform.getScaleInstance(1.3, 1.3);
AffineTransform rotate = AffineTransform.getRotateInstance(Math.toRadians(45.0), 45.0, 45.0);
AffineTransform transform = new AffineTransform();
transform.concatenate(rotate);
transform.concatenate(scale);
g2.draw(transform.createTransformedShape(Figure));
g2.setComposite(AlphaComposite.getInstance(3, 0.7F));
g2.setPaint(Color.blue);
g2.fill(transform.createTransformedShape(Figure));

}

public static void main(String[] args) {
GraphDemo gd = new GraphDemo();
gd.setTitle("Java 2D");
gd.setSize(600, 600);
gd.setResizable(false);
gd.setDefaultCloseOperation(3);
gd.setVisible(true);
}
}

JAVACalc
// Java program to create a simple calculator
// with basic +, -, /, * using java swing elements

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
	// create a frame
	static JFrame f;

	// create a textfield
	static JTextField l;

	// store operator and operands
	String s0, s1, s2;

	// default constructor
	calculator()
	{
		s0 = s1 = s2 = "";
	}

	// main function
	public static void main(String args[])
	{
		// create a frame
		f = new JFrame("calculator");

		try {
			// set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// create a object of class
		calculator c = new calculator();

		// create a textfield
		l = new JTextField(16);

		// set the textfield to non editable
		l.setEditable(false);

		// create number buttons and some operators
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, beq1;

		// create number buttons
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		// equals button
		beq1 = new JButton("=");

		// create operator buttons
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");

		// create a panel
		JPanel p = new JPanel();

		// add action listeners
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		beq1.addActionListener(c);

		// add elements to panel
		p.add(l);
		p.add(ba);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bs);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bd);
		p.add(b0);
		p.add(beq1);

		// set Background of panel
		p.setBackground(Color.green);

		// add panel to frame
		f.add(p);

		f.setSize(400, 400);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();

		// if the value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if operand is present then add to second no
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;

			// set the value of text
			l.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == '=') {

			double te;

			// store the value in 1st
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));

			// set the value of text
			l.setText(s0 + s1 + s2 + "=" + te);

			// convert it to string
			s0 = Double.toString(te);

			s1 = s2 = "";
		}
		else {
			// if there was no operand
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			// else evaluate
			else {
				double te;

				// store the value in 1st
				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));

				// convert it to string
				s0 = Double.toString(te);

				// place the operator
				s1 = s;

				// make the operand blank
				s2 = "";
			}

			// set the value of text
			l.setText(s0 + s1 + s2);
		}
	}
}
