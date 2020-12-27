
/**
 *This is a test program for the diamond class.
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
import java.io.*;

import javax.swing.*;

public class TestDiamondPG
{
    public static void main(String[] args) throws IOException
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        // Declare and instantiate the variables you need to prompt for the centerX and
        // centerY,
        // the width and height, and the color.
        // ---------- You write the code here:
        String str = "";
        String[] coordinates;
        String[] sizes;
        Point p;
        p = new Point(0, 0);
        int width, height;

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Create your shape and call the constructor. Call your variable shape.
        // ---------- You write the code here:
        DiamondPG shape = new DiamondPG();
       
        panel.add(shape); // add your shape to the displayed screen

        // Do not change these. We will talk about the code as time permits.

        panel.setBackground(Color.white);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        shape.setSize(frame.getSize());
        shape.setPreferredSize(frame.getSize());

        /*
         * Use your setters to setup the initial attributes for your shape. Don't forget
         * to set debug on.
         */
        shape.setDebug();
        shape.setColor(Color.red);
        // ---------- You write the code here:

        /*
         * Prompt the user for the attributes, starting with the x and y coordinates of
         * the center. Then prompt for width,height Then prompt for the color. Use your
         * setters to re-set the attributes. Right before re-prompting, call
         * shape.repaint() to update the picture. Continue prompting until they press
         * enter when asked for x,y.
         *
         */
        // ---------- You write the code here:

        System.out.print("Please provide the Point in the for (x,y): ");
        str = keyboard.readLine();
        while (!str.equals(""))
        {
            str = str.replaceAll(" ", "");
            coordinates = str.split(",");
            if (!(coordinates.length == 2))
            {
                break;
            }
            p.x = Integer.parseInt(coordinates[0]);
            p.y = Integer.parseInt(coordinates[1]);
            shape.setCenter(p.x, p.y);

            System.out.print("Please provide the width, height: ");
            str = keyboard.readLine();
            str = str.replaceAll(" ", "");
            sizes = str.split(",");
            
            if (str.isEmpty() && !(coordinates.length == 2) )
            {
                break;
            }
            
            str = str.replaceAll(" ", "");
            width = Integer.parseInt(sizes[0]);
            height = Integer.parseInt(sizes[1]);

            System.out.print("Please provide the Color: ");
            str = keyboard.readLine();
            str = str.replaceAll(" ", "");
            if (str.isEmpty())
            {
                break;
            }

            shape.setColor(ColorConverter.getColor(str));
            shape.setWidth(width);
            shape.setHeight(height);
            shape.repaint();
            System.out.print("Please provide the Point in the for (x,y): ");
            str = keyboard.readLine();
        }

        // This is printed when the user exits your input loop.
        System.out.println("Finished testing. Close the window when finished.");
    }

}
