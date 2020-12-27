 /**
 *This program converts binary numbers to hexadecimal.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
public class HexFun
{
public static void main(String[] args) throws IOException
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String str ="";
    System.out.print("Please provide binary number: ");
    str= input.readLine();  
    System.out.println("the decimal value is: " + convertToHex(str));
}
public static String convertToHex(String binaryNumber)
{
    int len;
    int remainder;
    int factors;
    int i;
    len = binaryNumber.length();
    remainder = len%4;//this helps remainder when binary number is not a multiple of 4
    factors = len/4;// this finds the various four sections of binary numbers. 
    String val1 ="";
    String val2 ="";
    String val3 =""; 
//this statement caters for extra numbers which are not factors of four. it adds zeros infront till it is four digits.
if(remainder >0)
{
    val1= binaryNumber.substring(0,remainder);
for (i=1; i<=(4-remainder); i++)
{
    val1 = "0" +val1; 
}
    val2 = convertHexDigit(val1);
    val3 = val2;
} 

for (i=1; i<=factors;i++)
{
    val1 =binaryNumber.substring(remainder,(remainder)+ 4);
    remainder = (remainder +4);
    val2 = convertHexDigit(val1);
    val3 = val3 +val2;

}
    return val3;
}
public static String convertHexDigit(String binaryNumber)
{
    String s1 ="";                                                                                                                                                                                                        
    String val = "";
    int i;                                                                                                                                                                                                                         
    int num;
    int hex1;
    num =0;

for (i = 1; i<=4; i++ )
{
   s1 = binaryNumber.substring(i-1,i);
//this statement ensures only binary numbers are computed
if ((s1.equals("0")) || (s1.equals("1")))
{
    hex1 = Integer.parseInt(s1)*(int)(Math.pow(2, 3-(i-1)));
    num = num + hex1;
}
else
{
    return binaryNumber;    
}
}  

    val = "" + num;
    if (num == 10)
{
     val = "A";
}
    else if (num == 11)
{
     val = "B";
}
   else if (num == 12)
{
     val = "C";
}
   else if (num == 13)
{
     val = "D";
}
   else if (num == 14)
{
     val = "E";
}
   else if (num == 15)
{
     val = "F";
}
    return val;
}
}

