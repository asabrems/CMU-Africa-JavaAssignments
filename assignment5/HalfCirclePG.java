
/**
 *This program is a helper class for drawing a half circle shape.
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
import java.awt.Graphics;

public class HalfCirclePG extends PositionalGraphic
{

    public HalfCirclePG()
    {
        super();
    }
    
    public HalfCirclePG(int width, int height)
    {
        super(width, height);
    }
    

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        int x, y, width, height;
        int startAngle;
        int arcAngle;

        super.paint(g);

        x = super.getTopLeft().x;
        y = super.getTopLeft().y;

        width = super.getWidth();
        height = 2*super.getHeight();

        g.fillArc( x, y, width,height,0, 180 );
    }

    @Override
    public String toString()
    {
        return "halfcircle" + super.toString();
    }

}
