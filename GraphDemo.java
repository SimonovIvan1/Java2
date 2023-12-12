import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;


public class GraphDemo extends JFrame
{
  public GraphDemo ()
  {
  }

  public void paint (Graphics g)
  {
    super.paint (g);
    Graphics2D g2 = (Graphics2D) g;
    int[] pointOne = new int[]{ 10, 295, 590 };
    int[] pointTwo = new int[]{ 500, 30, 500 };
    g2.setPaint (new
		 GradientPaint (300.0F, 500.0F, Color.gray, 300.0F, 250.0F,
				Color.CYAN));
    g2.fillPolygon(pointOne, pointTwo, 3);
    Ellipse2D ellipseLeft = new Ellipse2D.Double(70.0, 400.0, 80.0, 80.0);

    Ellipse2D ellipseReigth = new Ellipse2D.Double(450.0, 400.0, 80.0, 80.0);

    g2.setPaint (new
		 GradientPaint (300.0F, 450.0F, Color.YELLOW, 300.0F, 400.0F,
				Color.RED));

    g2.fill(ellipseLeft);
    g2.fill(ellipseReigth);
    Ellipse2D ellipseUp = new Ellipse2D.Double(255.0, 100.0, 80.0, 80.0);
    g2.setPaint (new
		 GradientPaint (300.0F, 150.0F, Color.YELLOW, 300.0F, 100.0F,
				Color.RED));

    g2.fill(ellipseUp);
    Ellipse2D elipseMain = new Ellipse2D.Double (174.0, 210.0, 250.0, 250.0);

    g2.setPaint (new
		 GradientPaint (10.0F, 250.0F, Color.white, 590.0F, 250.0F,
				Color.GREEN));

    g2.fill (elipseMain);

    g2.setColor (Color.black);

    g2.setStroke (new BasicStroke (2.5F));

    g2.setColor (new Color (0xF50606));

    CubicCurve2D c = new CubicCurve2D.Double ();

    c.setCurve (150.0, 300.0, 300.0, 600.0, 300.0, 110.0, 450.0, 300.0);

    g2.draw (c);

//g2.clip(new Ellipse2D.Double(150.0, 250.0, 175.0, 175.0));
    float[] dashThing = new float[]{ 1.0F, 10.0F, 15.0F, 10.0F };

    g2.setColor (new Color (0.0F, 0.0F, 0.0F, 0.8F));

    g2.setStroke (new BasicStroke (3.5F, 1, 0, 3.5F, dashThing, 0.0F));

    RoundRectangle2D Figure =
      new RoundRectangle2D.Double (240.0, 30.0, 180.0, 70.0, 30.0, 30.0);

    AffineTransform scale = AffineTransform.getScaleInstance (1.3, 1.3);

    AffineTransform rotate =
      AffineTransform.getRotateInstance (Math.toRadians (45.0), 45.0, 45.0);

    AffineTransform transform = new AffineTransform ();

    transform.concatenate (rotate);

    transform.concatenate (scale);

    g2.draw (transform.createTransformedShape (Figure));

    g2.setComposite (AlphaComposite.getInstance (3, 0.7F));

    g2.setPaint (Color.blue);

    g2.fill (transform.createTransformedShape (Figure));


  }

  public static void main (String[]args)
  {

    GraphDemo gd = new GraphDemo ();

    gd.setTitle ("Java 2D");

    gd.setSize (600, 600);

    gd.setResizable (false);

    gd.setDefaultCloseOperation (3);

    gd.setVisible (true);

  }
}
