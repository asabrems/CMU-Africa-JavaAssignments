
/**
 *This program is a helper class for drawing the an icecream cone shape.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 *
 * discussed design with: Jean Bosco Ntwari
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.util.ArrayList;
import java.awt.*;

public class IceCreamConePG extends PositionalGraphic
{
    ArrayList<OvalPG> scoops = new ArrayList<OvalPG>();
    private TrianglePG cone;

    public IceCreamConePG()
    {
        super();
        cone = new TrianglePG();
        setShapeSize();
        setLocation();
    }

    public void setCone(TrianglePG _cone)
    {
        cone = _cone;

    }

    public TrianglePG getCone()
    {
        return cone;

    }

    @Override
    public void setWidth(int width)
    {
        super.setWidth(width);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setHeight(int height)
    {
        super.setHeight(height);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setTopLeft(int x, int y)
    {
        super.setTopLeft(x, y);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setCenter(int x, int y)
    {
        super.setCenter(x, y);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setTopRight(int x, int y)
    {
        super.setTopRight(x, y);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setBottomLeft(int x, int y)
    {
        super.setBottomLeft(x, y);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setBottomRight(int x, int y)
    {
        super.setBottomRight(x, y);
        setShapeSize();
        setLocation();
    }

    @Override
    public void setTopCenter(int x, int y)
    {
        super.setBottomRight(x, y);
        setShapeSize();
        setLocation();
    }

    public void addScoop(Color c)
    {
        OvalPG scoop = new OvalPG();
        scoop.setColor(c);
        scoops.add(scoop);
        setShapeSize();
        setLocation();
    }

    public void clearScope()
    {
        scoops.clear();
    }

    private void setShapeSize()
    {

        int h, w, length;
        int coneHeight, coneWidth;
        h = super.getHeight();
        w = super.getWidth();
        length = scoops.size();
        coneHeight = h / (2);
        coneWidth = w;
        cone.setHeight(coneHeight);
        cone.setWidth(coneWidth);

        for (OvalPG scope : scoops)
        {
            scope.setHeight((int) (h / (2 * length)));
            scope.setWidth(w);
        }

    }

    private void setLocation()
    {

        int xCone, yCone, xScope, yScope, i, length;

        xCone = super.getBottomLeft().x;
        yCone = (int) (super.getBottomLeft().y);
        cone.setBottomLeft(xCone, yCone);
        length = scoops.size();

        for (i = 1; i <= length; i++)
        {
            xScope = cone.getTopCenter().x;
            yScope = (cone.getTopCenter().y - ((i - 1) * (scoops.get(i - 1).getHeight())));
            scoops.get(i - 1).setBottomCenter(xScope, yScope);
        }

    }

    @Override
    public void paint(Graphics g)
    {
        int length;
        length = scoops.size();
        super.paint(g);
        for (OvalPG scope : scoops)
        {
            scope.paint(g);
        }
        cone.setColor(getColor());
        cone.setDown();
        cone.paint(g);

    }

    @Override
    public String toString()
    {
        return "icecreamcone" + super.toString();
    }
}
