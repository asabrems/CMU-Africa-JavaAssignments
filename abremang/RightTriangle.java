/**
 *This is a hellper class runned by PrintRightTriangle that takes the string, position and width to draw a triangle.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
import java.io.*;
import java.util.*;
import java.lang.*; 
import java.awt.*;
public class RightTriangle
{
    private int width;
    private String str; 
    private String location;
public RightTriangle()
{                                                  
  
}
public RightTriangle(int rWidth, String rString, String rLocation)
{  
    width=rWidth ;                                                                                            
    location=rLocation ;
    str=rString ;
    
}
//creating the getters
public String getPosition()
{
    return location;
}

public int getWidth()
{
    return  width;
}

public String getString()
{
    return  str;
}
//creating the setters
public void setWidth(int newWidth)
{
    width=newWidth;
}
public void setString(String newString)
{
    str=newString;
}
public void setPosition(String newLocation)
{
    location = newLocation ;
}


public void drawAsciiArt()

{
int i;
int acc;
int len;
acc=0;
len = str.length();
if (location.equals("bl"))
{
for (i=1; i<= width; i++)
{
    System.out.println(buildString(str,i));
}
    System.out.print("\n");
}

else if (location.equals("tl"))
{
for (i=width; i>= 1; i--)
{
    System.out.println(buildString(str,i));
}
    System.out.print("\n");
}
else if (location.equals("tr"))
{
    String s =" ";
for (i=width; i>= 1; i--)
{   
    acc =(acc +len*(1));
    s= buildString(" ",(acc));
    System.out.println(s+ buildString(str,i));
        
}
    System.out.print("\n");
}
else if (location.equals("br"))
{
    String s =" ";
for (i=1; i<= width; i++)
{   
    acc =len*(width-(i-1));
    s= buildString(" ",(acc));
    System.out.println(s+ buildString(str,i));
        
}
    System.out.print("\n");
}
else 
{
    System.out.println(location + " does not exist");
}
}

private String buildString(String str, int num)
{
    int i;
    String s ="";
for (i=1; i<=num; i++)
{
    s = s+str;
}
   return s;
}
public String toString()
{
   return str;
}
}
