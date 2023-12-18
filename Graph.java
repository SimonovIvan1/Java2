import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
public class Graph extends JFrame {
private static final long serialVersionUID = 1L;
// Переопределяем метод paint, который вызывается

// автоматически,когда перерисовается окно
@Override
public void paint(Graphics g) {
super.paint(g);
g.setColor(new Color(66, 170, 255));
g.drawOval(25, 35, 250, 250);
g.setColor(new Color(0,0,0));
g.drawOval(60, 200, 50, 50);
g.drawOval(180, 200, 50, 50);
g.drawOval(120, 45, 50, 50);
g.drawOval(120, 130, 50, 50);
g.setColor(new Color(0, 0, 255));
g.fillOval(120, 130, 51, 51);
g.setColor(new Color(0,0,0));
g.drawLine(145, 130, 145, 95);
g.drawLine(90, 200, 130, 175);
g.drawLine(160, 175, 200, 200);
g.setColor(new Color(255, 255, 255));
g.fillOval(121, 46, 49, 49);
g.fillOval(61, 201, 49, 49);
g.fillOval(181, 201, 49, 49);
g.setColor(new Color(0,0,0));
g.drawString("ЭВМ", 193, 230);
g.drawString("ВПМ", 73, 230);
g.drawString("САПР", 130, 70);
g.drawString("ВС", 138, 85);
g.drawString("ФВТ", 135, 160);
;
}
public static void main(String[] args) {
	Graph gd = new Graph();
// Определяем заголовок окна
gd.setTitle("Пример графики на Java");
// Определяем размер окна
gd.setSize(300, 300);
// Запрещаем пользователю изменять размеры окна
gd.setResizable(false);

gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Делаем окно видимым
gd.setVisible(true);
}
}