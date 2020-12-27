/**
 *This program takes in string values and determine whether they are palindromes or not. 
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
import java.lang.*;
public class PalChecker 
{
public static void main(String args[]) throws IOException
{
    String str ="";
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    
    System.out.print("Please provide palindrome: ");
    str = input.readLine();
    System.out.println( str + reverse(str));
}
public static String strippedString(String str)
{
    str = str.replaceAll("[ ?!,.!;:']", "");
    return str;
}
public static String reverse(String str)
{
    String output ="";
    str= strippedString(str);

    String reverse="";
    String sub ="";
    int len;
    int i;
    len = str.length();
    System.out.println(len);
//this if statement takes care of empty strings
if (len <1)
{
    return output =  " "+ "is NOT a palindrome";
}
else
{
for (i=1; i<=len;i++ )
{
    sub = str.substring(i-1,i);
    reverse = sub + reverse;
}
if (reverse.equalsIgnoreCase(str))
{
    return  output =  " "+ "IS a palindrome";
}
else 
    
    
    return output =  " "+ "is NOT a palindrome";
}
}
}
