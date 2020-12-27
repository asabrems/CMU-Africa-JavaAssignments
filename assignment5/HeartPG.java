
/**
 *This program is a helper class for drawing the Heart shape.
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

public class HeartPG extends PositionalGraphic
{
    private TrianglePG base;
    private OvalPG[] circles;

    public HeartPG()
    {
        super();
        base = new TrianglePG();
        circles = new OvalPG[2];
        circles[0] = new OvalPG();
        circles[1] = new OvalPG();

        int xBase, yBase, xCircle1, yCircle1, yCircle2, xCircle2;
        int h, w;

        h = super.getHeight();
        w = super.getWidth();

        xBase = super.getBottomLeft().x;
        yBase = (int) (super.getBottomLeft().y);
        xCircle1 = super.getTopLeft().x;
        yCircle1 = super.getTopLeft().y;
        xCircle2 = super.getTopLeft().x + (super.getWidth() / 2);
        yCircle2 = super.getTopLeft().y + (super.getHeight() / 2);

        base.setBottomLeft(xBase, yBase);
        circles[0].setTopLeft(xCircle1, yCircle1);
        circles[1].setTopLeft(xCircle2, yCircle2);

        base.setHeight((int) (h / 1.4));
        base.setWidth(w);

        circles[0].setHeight((int) ((h / 2.0)));
        circles[0].setWidth((int) (w / 2.0));
        circles[1].setHeight((int) ((h / 2.0)));
        circles[1].setWidth((int) (w / 2.0));

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

    private void setShapeSize()
    {
        int h, w;
        h = super.getHeight();
        w = super.getWidth();

        base.setHeight((int) (h / 1.4));
        base.setWidth(w);

        circles[0].setHeight((int) ((h / 2.0)));
        circles[0].setWidth((int) (w / 2.0));
        circles[1].setHeight((int) ((h / 2.0)));
        circles[1].setWidth((int) (w / 2.0));
    }

    private void setLocation()
    {
        int xBase, yBase, xCircle1, yCircle1, yCircle2, xCircle2;

        xBase = super.getBottomLeft().x;
        yBase = (int) (super.getBottomLeft().y);
        xCircle1 = super.getTopLeft().x;
        yCircle1 = super.getTopLeft().y;
        xCircle2 = super.getTopLeft().x + (super.getWidth() / 2);
        yCircle2 = super.getTopLeft().y;

        base.setBottomLeft(xBase, yBase);

        circles[0].setTopLeft(xCircle1, yCircle1);
        circles[1].setTopLeft(xCircle2, yCircle2);

    }

    @Override
    public void setColor(Color c)
    {
        super.setColor(c);
        base.setColor(c);
        circles[1].setColor(c);
        circles[0].setColor(c);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        base.setDown();
        base.paint(g);

        circles[0].paint(g);

        circles[1].paint(g);

    }

    @Override
    public String toString()
    {
        return "string";
    }
}
