
/**
 *This program is a parent class to various shapes.
 *
 * @author Adwoa Asantewaa Bremang
 *
 *
 * discussed design with: Jean Bosco Ntwari
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.awt.*;

public class PositionalGraphic extends Canvas
{
    private Rectangle boundingRectangle;
    private boolean debug;
    private Color color;

    // constructors
    public PositionalGraphic()
    {
        boundingRectangle = new Rectangle(0, 0, 100, 100);
        debug = false;
        color = Color.red;

    }

    public PositionalGraphic(int height, int width)
    {
        boundingRectangle = new Rectangle(0, 0, width, height);
        debug = false;
        color = Color.red;
    }

    public PositionalGraphic(Color c, int height, int width)
    {
        boundingRectangle = new Rectangle(0, 0, width, height);
        debug = false;
        color = c;

    }

    public PositionalGraphic(Point p, Color c, int height, int width)
    {
        boundingRectangle = new Rectangle(p.x, p.y, width, height);
        debug = false;
        color = c;

    }

    public PositionalGraphic(Point p, Color c, int diameter)
    {
        boundingRectangle = new Rectangle(p.x, p.y, diameter, diameter);
        debug = false;
        color = c;

    }
    
    public PositionalGraphic(int x,int y, int diameter)
    {
        boundingRectangle = new Rectangle(x, y, diameter, diameter);
        debug = false;
        color = Color.red;

    }
    
    public PositionalGraphic(Color c, int diameter)
    {
        boundingRectangle = new Rectangle(0, 0, diameter, diameter);
        debug = false;
        color = c;

    }

    public PositionalGraphic(Point p, int height, int width)
    {
        boundingRectangle = new Rectangle(p.x, p.y, width, height);
        debug = false;
        color = Color.red;
    }

    public PositionalGraphic(int x, int y, int height, int width)
    {
        boundingRectangle = new Rectangle(x, y, width, height);
        debug = false;
        color = Color.red;
    }

    public PositionalGraphic(int x, int y, Color c, int height, int width)
    {
        boundingRectangle = new Rectangle(x, y, width, height);
        debug = false;
        color = c;
    }

    // debug
    public void setDebug()
    {

        debug = true;
    }

    public void clearDebug()
    {

        debug = false;
    }

    // setters
    public void setDiameter(int diameter)
    {       
        boundingRectangle.setSize(diameter, diameter);
    }

    public void setBound(int width, int height)
    {
        boundingRectangle.setSize(width, height);
    }

    public void setHeight(int height)
    {
        boundingRectangle.height = height;
    }
    
    public void setWidth(int width)
    {
        boundingRectangle.width = width;
    }

    public void setBoundingRectangle(Point center, int width, int height)
    {
        boundingRectangle = new Rectangle(center.x, center.y, width, height);
    }

    public void setColor(Color c)
    {
        color = c;
    }
    
    public void setCenter(int x, int y)
    {
        x = (int) (x - (boundingRectangle.getWidth() / 2));
        y = (int) (y - (boundingRectangle.getHeight() / 2));
        boundingRectangle.setLocation(x, y);
    }

    // create setters for Tops
    public void setTopCenter(int x, int y)
    {
        x = (int) (x - boundingRectangle.getWidth());
        y = (int) (y - boundingRectangle.getHeight());
        boundingRectangle.setLocation(x, y);
    }

    public void setTopLeft(int x, int y)
    {
        boundingRectangle.setLocation(x, y);
    }

    public void setTopRight(int x, int y)
    {
        x = (int) (x + boundingRectangle.getWidth());
        boundingRectangle.setLocation(x, y);
    }

    // setting bottoms
    public void setBottomCenter(int x, int y)
    {
        x = (int) (x - (boundingRectangle.getWidth() / 2));
        y = (int) (y - boundingRectangle.getHeight());
        boundingRectangle.setLocation(x, y);
    }

    public void setBottomRight(int x, int y)
    {
        x = (int) (x - boundingRectangle.getWidth());
        y = (int) (y - boundingRectangle.getHeight());
        boundingRectangle.setLocation(x, y);
    }

    public void setBottomLeft(int x, int y)
    {
        y = (int) (y - boundingRectangle.getHeight());
        boundingRectangle.setLocation(x, y);
    }

    // setting sides
    public void setRightCenter(int x, int y)
    {
        x = (int) (x - boundingRectangle.getWidth());
        y = (int) (y - (boundingRectangle.getHeight() / 2));
        boundingRectangle.setLocation(x, y);
    }

    public void setLeftCenter(int x, int y)
    {
        y = (int) (y - (boundingRectangle.getHeight() / 2));
        boundingRectangle.setLocation(x, y);
    }

    // getters
    public Rectangle getboundingRectangle()
    {
        return boundingRectangle;
    }


    public Color getColor()
    {
        return color;
    }

    public int getWidth()
    {
        return (int) boundingRectangle.getWidth();
    }

    public int getHeight()
    {
        return (int) boundingRectangle.getHeight();
    }

   
   
    public Point getCenter()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + (boundingRectangle.getWidth() / 2));
        y = (int) (boundingRectangle.getY() + (boundingRectangle.getHeight() / 2));
        return (p = new Point(x, y));
    }

    public Point getTopLeft()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX());
        y = (int) (boundingRectangle.getY());
        return (p = new Point(x, y));
    }

    public Point getLeftCenter()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX());
        y = (int) ((boundingRectangle.getY()) + ((boundingRectangle.getHeight()) / 2));
        return (p = new Point(x, y));
    }

    public Point getBottomLeft()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX());
        y = (int) (boundingRectangle.getY() + boundingRectangle.getHeight());
        return (p = new Point(x, y));
    }
    public Point getBottomCenter()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + (boundingRectangle.getWidth()/2));
        y = (int) (boundingRectangle.getY() + boundingRectangle.getHeight());
        return (p = new Point(x, y));
    }

    public Point getTopCenter()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + (boundingRectangle.getWidth() / 2));
        y = (int) (boundingRectangle.getY());
        return (p = new Point(x, y));
    }

    public Point getTopRight()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + boundingRectangle.getWidth());
        y = (int) (boundingRectangle.getY());
        return (p = new Point(x, y));
    }

    public Point getRightCenter()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + boundingRectangle.getWidth());
        y = (int) (boundingRectangle.getY() + (boundingRectangle.getHeight() / 2));
        return (p = new Point(x, y));
    }

    public Point getBottomRight()
    {
        int x, y;
        Point p;
        x = (int) (boundingRectangle.getX() + boundingRectangle.getWidth());
        y = (int) (boundingRectangle.getY() + boundingRectangle.getHeight());
        return (p = new Point(x, y));
    }



    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        int x, y, width, height;

        x = (int) (boundingRectangle.getX());
        y = (int) (boundingRectangle.getY());

        width = (int) boundingRectangle.getWidth();
        height = (int) boundingRectangle.getHeight();
        g.setColor(color);
        if (!debug)
            return;
       g.drawRect(x, y, width, height);
        
    }

    public String toString()
    {
        return "shape has: " + "color" + color + " bounded rectangle" + boundingRectangle;
    }

}
