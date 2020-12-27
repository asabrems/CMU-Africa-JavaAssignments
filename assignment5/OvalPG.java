
/**
 *This program is a helper class for drawing the Oval shape.
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

public class OvalPG extends PositionalGraphic
{

    public OvalPG()
    {
        super();

    }

    public OvalPG(Color c, int diameter)
    {
        super(c, diameter);
    }

    public OvalPG(Point p, Color c, int diameter)
    {
        super(p, c, diameter);
    }

    public OvalPG(int x, int y, int diameter)
    {
        super(x, y, diameter);

    }

    public OvalPG(int x, int y, Color c, int diameter)
    {
        super(x, y, c, 10, 10);

    }

    @Override
    public void paint(Graphics g)
    {
       
        super.paint(g);
        int x, y, width, height;

//        super.paint(g);

        x = super.getTopLeft().x;
        y = super.getTopLeft().y;

        width = super.getWidth();
        height = super.getHeight();

        g.fillOval(x, y, width, height);
    }

    @Override
    public String toString()
    {

        return "circle" + super.toString();
    }

}
