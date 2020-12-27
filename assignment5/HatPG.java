
/**
 *This program is a helper class for drawing the HatPG shape.
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
import java.awt.*;

public class HatPG extends PositionalGraphic
{
    private RectanglePG brim;
    private HalfCirclePG crown;

    public HatPG()
    {
        super();
        brim = new RectanglePG();
        crown = new HalfCirclePG();
        setShapeSize();
        setLocation();
    }

    public void setBrim(RectanglePG _brim)
    {
        brim = _brim;

    }

    public void setCrown(HalfCirclePG _crown)
    {
        crown = _crown;

    }

    public RectanglePG getBrim()
    {
        return brim;
    }

    public HalfCirclePG setBrim()
    {
        return crown;

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

    private void setShapeSize()
    {
        int h, w;
        h = super.getHeight();
        w = super.getWidth();
        brim.setHeight((int) (h / 4.0));
        brim.setWidth(w);
        crown.setHeight(h);
        crown.setWidth((int) (w / 2.0));
    }

    private void setLocation()
    {
        int xBrim, yBrim, xCrown, yCrown;

        xBrim = super.getBottomLeft().x;
        yBrim = (int) (super.getBottomLeft().y);
        xCrown = super.getCenter().x;
        yCrown = super.getCenter().y;
        brim.setBottomLeft(xBrim, yBrim);
        crown.setCenter(xCrown, yCrown);

    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        brim.setColor(getColor());
        brim.paint(g);
        crown.setColor(getColor());
        crown.paint(g);
    }

    @Override
    public String toString()
    {
        return "string";
    }
}
