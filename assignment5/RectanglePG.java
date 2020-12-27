
/**
 *This program is a helper class for drawing a rectangle.
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

public class RectanglePG extends PositionalGraphic
{

    public RectanglePG()
    {
        super();
    }
    
    public RectanglePG(int width, int height)
    {
        super(width, height);
    }
    

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        int x, y, width, height;

        super.paint(g);

        x = super.getTopLeft().x;
        y = super.getTopLeft().y;

        width = super.getWidth();
        height = super.getHeight();

        g.fillRect(x, y, width, height);
    }

    @Override
    public String toString()
    {
        return "rectangle" + super.toString();
    }

}
