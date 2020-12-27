
/**
 *This program is a main program that draws the shapes in the array list shapes.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class ShowShapes
{

    public static void main(String argv[]) throws IOException
    {
        JFrame frame = new JFrame();
        HoldShapes shapes;
        shapes = new HoldShapes();
        int i, n;
        String str = "";
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // ------------ You write the code ----------------

        // Prompt for the number of scoops then prompt for each color and call
        // shapes.addScoop(). You will finish addScoop() in HoldShapes - it should take one
        // argument that is the color to use. Note: see Hold.java for more comments.
        System.out.print("Please provide number of scopes: ");
        str = keyboard.readLine();
        if (!str.equals(""))
        {
            n = Integer.parseInt(str);

            for (i = 0; i < n; i++)
            {
                System.out.print("Please provide scope color: ");
                str = keyboard.readLine();
                shapes.addScoop(str);

            }
            System.out.println("Thanks for ordering " + n + " scoops! Close the window when done.");
        }

        frame.setSize(1000, 850);
        shapes.setSize(frame.getSize());
        shapes.setPreferredSize(frame.getSize());
        frame.add(shapes);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
