import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MouseListener implements java.awt.event.MouseListener {
	JButton b1;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		Point p = b1.getLocation();
		
		if (p.x > 300) {p.x -= 100;}
		else {p.x += 100;}
		if (p.y > 300) {p.y -= 100;}
		else {p.y += 100;}
		b1.setLocation(p);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
