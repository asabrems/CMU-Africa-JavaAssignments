/**
 *This program executes the triangle from the triangle.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
public class PrintRightTriangle
{
public static void main(String[] args) throws IOException
{
    int width;
    String str ="";  
    String str1 ="";
    String ps ="";
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("please provide the width: ");
    str = input.readLine();
//this is a sentinel while loop        
    while (!(str.equals("")))
    {
    width = Integer.parseInt(str);
    System.out.print("please provide String type: ");
    str1 = input.readLine();
    System.out.print("please provide the position: ");
    ps= input.readLine();
    RightTriangle triangle = new RightTriangle(width,str1, ps);
    triangle.drawAsciiArt();  
    System.out.print("please provide the width: ");
    str = input.readLine();
    }
}
}
