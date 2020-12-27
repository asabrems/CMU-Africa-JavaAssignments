/**
 *This program takes an  input value and find the corresponding pi term.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
public class PiEstimate
{
public static void main(String args[]) throws IOException
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String str ="";
    int N;
    System.out.print("please provide an Nth value: ");
    str = input.readLine();
    N = Integer.parseInt(str);
    getpie(N);

}
public static double getpie(int N)
{
    int i,val2,limit,limit1,nth, val3;
    double val;
    double sum;
    String msg ="";
    val = 0;
    nth =0;
    val2 = 0;
    val3 = 0;
    sum =0;
    limit =0;
    limit1=0;

for (i =0; i<N; i++)
{
//this program works for even values of i
if ((i> 0) && ((i%2) == 0))
{
    val = (4.0/(double)((2*(i-1))+3));
    sum =sum  +val;
 
}
//this statement works for odd values of i
if((i%2)!=0)
{
    val = -(4.0/(double)((2*(i-1))+3));
    sum =sum  +val;
  
}
//this statement works when i=0;
if(i==0)
{
    val = (4/((2*(i-1))+3));
    sum =sum  +val;
   
}

    val2 = (int)(((sum* Math.pow(10.0, 5))));//this converts the pi values into integers of 6 digits

if ((i< 5) || ((i >= (N-5)) && (i <= N)))
{
    System.out.println(sum);
}
if ((val2 == 314159) && (limit == 0) )
{
    nth=i;
    limit = limit +1;
    limit1 = val2;
}
}
if (limit==1)
{
    System.out.println("Search for 3.14159, found after " + nth + " terms." );
        
}
else 
{
    System.out.println("Search for 3.14159, not found after " + N + " terms.");
}
    System.out.println("Pi for "+ N  + " terms is "+sum);

    return (sum);
}

}
