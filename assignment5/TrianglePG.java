
/**
 *This program is a helper class for drawing a triangle.
 *
 * @author Adwoa Asantewaa Bremang
 *
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.awt.Graphics;

public class TrianglePG extends PositionalGraphic
{
    private Position type;
    private boolean PositionState;

    private enum Position
    {
        UP, DOWN
    }

    public TrianglePG()
    {
        super();
        type = Position.UP;

    }

    public void setUP()
    {
       
         type = Position.UP;
    }
       
   

    public void setDown()
    {
        type = Position.DOWN;
    }

    public boolean isUp()
    {
        if (type == Position.UP)
            return true;
        else
            return false;
    }

    public boolean isDown()
    {
        if (type == Position.DOWN)
            return true;
        else
            return false;
    }

    public TrianglePG(int width, int height)
    {
        super(width, height);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        int size;
        int[] xPoints;
        int[] yPoints;
        xPoints = new int[3];
        yPoints = new int[3];
        super.paint(g);
        size = 3;

        if (isDown())
        {
            xPoints[0] = super.getTopLeft().x;
            xPoints[1] = super.getTopRight().x;
            xPoints[2] = super.getBottomCenter().x;

            yPoints[0] = super.getTopLeft().y;
            yPoints[1] = super.getTopRight().y;
            yPoints[2] = super.getBottomCenter().y;
            g.fillPolygon(xPoints, yPoints, size);
        }
        else if (isUp())
        {
            xPoints[0] = super.getBottomLeft().x;
            xPoints[1] = super.getBottomRight().x;
            xPoints[2] = super.getTopCenter().x;

            yPoints[0] = super.getBottomLeft().y;
            yPoints[1] = super.getBottomRight().y;
            yPoints[2] = super.getTopCenter().y;
            g.fillPolygon(xPoints, yPoints, size);
        }
    }

    @Override
    public String toString()
    {
        return "halfcircle" + super.toString();
    }

}
