
/**
 * This program reads phrases from a file or user and stores them in an arraylist.
 *
 * @author Asantewaa Bremang
 * 
 * Andrew Id: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this
 * work.
 *
 */
import java.io.*;
import java.util.*;

import java.awt.*; // import the AWT graphic classes
import javax.swing.*; // import the Swing classes

public class PlayGame
{

    public static void main(String args[]) throws IOException
    {

        final LayoutGUI gui;

        if ((args.length > 0))
        {
            gui = new HangmanGUI(args[0]);

        }
        else
        {
            gui = new HangmanGUI();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI(gui);
            }
        });
    }

    private static void createAndShowGUI(LayoutGUI gui)
    {
        // Create a JFrame and get its content pane

        JFrame theFrame = new JFrame(gui.getClass().getName() + " Application");
        Container c = theFrame.getContentPane();

        // Instantiate the GUI, which is a JPanel

        gui.addComponents(theFrame);

        // Set the size of the frame and exit behavior

        theFrame.setPreferredSize(new Dimension(500, 400));
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the GUI to the frame

        c.add(gui);

        // show the frame

        theFrame.pack();
        theFrame.setVisible(true);
    }
}
