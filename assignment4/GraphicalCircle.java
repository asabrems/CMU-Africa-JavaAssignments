import java.awt.*;

import javax.swing.JPanel;
public class GraphicalCircle  extends JPanel
{
private int diameter;
private Point point;
private Color color;

public GraphicalCircle()
{
	
}
public GraphicalCircle(Point p1, Color c, int Diameter)
{
    diameter = Diameter;
	point = p1;
	color= c;
}
//setters
public void setPoint(Point p1)
{
	point= new Point(p1);
}
public void setColor(Color c)
{
	color= c;
}

public void setDiameter(int Diameter)
{
	diameter= Diameter;
}

// getters
public Point getPoint()
{
	return point;
}

public int getDiameter()
{
	return diameter;
}
public Color getColor()
{
	return color;
}


public void paintComponent(Graphics g)
{
	//int width;
	int d;
	super.paintComponent(g);
	g.setColor(getColor());
	d = getDiameter();
    //g.drawOval(point.x, point.x,diameter, diameter);
    g.fillOval(point.x, point.y,d, d);
	//diameter = getHeight()/4;
	//width = getWidth()/4;
	//drawCircle(g,point.x, point.x,diameter, color);
}

//public void drawCircle(Graphics g, int x, int y, int height, int width, Color c)
/*public void drawCircle(Graphics g, int x, int y, int height, Color c)
{
	g.setColor(c);
    g.drawOval(x, y, height, height);
    g.fillOval(x, y, height, height);
}*/
}
