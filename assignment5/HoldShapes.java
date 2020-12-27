
/**
 *This program is a helper class that creates an array of shapes.
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

public class HoldShapes extends PositionalGraphic
{

    // The ArrayList shapes holds a list of all your shapes. Look at what paint() does.

    ArrayList<PositionalGraphic> shapes = new ArrayList<PositionalGraphic>();

    // Note: this is an instance variable so addScoop() can access it. Make sure you instantiate it.

    IceCreamConePG iceCreamCone;
    HatPG hat;
    HeartPG heart;
    OvalPG oval;
    TrianglePG triangle;
    DiamondPG diamond;
    RectanglePG rectangle;
    HalfCirclePG halfCircle;

    public HoldShapes()
    {

        // Instantiate each of your PG objects. Use your setters to set each one up. Then add each
        // of them to your shapes ArrayList.

        // ------------ You write the code ----------------
        iceCreamCone = new IceCreamConePG();
        hat = new HatPG();
        heart = new HeartPG();
        oval = new OvalPG();
        triangle = new TrianglePG();
        diamond = new DiamondPG();
        rectangle = new RectanglePG();
        halfCircle = new HalfCirclePG();

        hat.setHeight(100);
        hat.setWidth(100);
        hat.setTopLeft(100, 100);
        hat.setColor(Color.yellow);

        heart.setHeight(100);
        heart.setWidth(100);
        heart.setTopLeft(200, 100);
        heart.setColor(Color.pink);

        oval.setHeight(100);
        oval.setWidth(100);
        oval.setTopLeft(300, 100);
        oval.setColor(Color.red);

        triangle.setHeight(100);
        triangle.setWidth(100);
        triangle.setTopLeft(400, 100);
        triangle.setColor(Color.green);

        diamond.setHeight(100);
        diamond.setWidth(100);
        diamond.setTopLeft(100, 200);
        diamond.setColor(Color.green);

        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setTopLeft(200, 200);
        rectangle.setColor(Color.black);

        iceCreamCone.setHeight(100);
        iceCreamCone.setWidth(100);
        iceCreamCone.setTopLeft(300, 200);
        iceCreamCone.setColor(Color.yellow);

        halfCircle.setHeight(100);
        halfCircle.setWidth(100);
        halfCircle.setTopLeft(400, 200);
        halfCircle.setColor(Color.blue);

        // adding objects of shapes to the array
        shapes.add(hat);
        shapes.add(heart);
        shapes.add(oval);
        shapes.add(triangle);
        shapes.add(diamond);
        shapes.add(rectangle);
        shapes.add(iceCreamCone);
        shapes.add(halfCircle);

    }

    public void addScoop(String color)
    {

        // ------------ You write the code ----------------
        Color c;
        c = ColorConverter.getColor(color);
        iceCreamCone.addScoop(c);// in your IceCreamConePG class that takes the color for the new scoop.
    }

    @Override
    public void paint(Graphics g)
    {
        // This code loops through and paints all of the shapes.
        for (PositionalGraphic shape : shapes)
        { 
            shape.paint(g);
        }
    }

}
