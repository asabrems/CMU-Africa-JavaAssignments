
/**
 *This program is a helper class for drawing a Diamond.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * discussed design with: Jean Bosco Ntwari
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.awt.Graphics;

public class DiamondPG extends PositionalGraphic
{
    public DiamondPG()
    {
        super();
    }
     
    public DiamondPG(int width, int height)
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
        xPoints = new int[4];
        yPoints = new int[4];
        xPoints[0] = super.getTopCenter().x;
        xPoints[1] = super.getLeftCenter().x;
        xPoints[2] = super.getBottomCenter().x;
        xPoints[3] = super.getRightCenter().x;

        yPoints[0] = super.getTopCenter().y;
        yPoints[1] = super.getLeftCenter().y;
        yPoints[2] = super.getBottomCenter().y;
        yPoints[3] = super.getRightCenter().y;

        size = 4;

        super.paint(g);
        g.fillPolygon(xPoints, yPoints, size);
    }

    @Override
    public String toString()
    {
        return "diamond" + super.toString();
    }

}
