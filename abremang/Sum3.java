 /**
 *this program takes in a number of values and add values that are divisible by 3. 
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
public class Sum3
{
public static void main(String[] args) throws IOException
{
    int val; 
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String str ="";
    System.out.print("Please provide input: ");
    str= input.readLine();
    val = Integer.parseInt(str);
while (val != -1)
{
    System.out.println(divSum3(val));
    System.out.print("Please provide input: ");
    str = input.readLine();
    val = Integer.parseInt(str);
}

}

public static int divSum3(int N)
{
    int i;
    int val;
    int sum;
    val = 0;
    sum = 0; 
for (i=1; i<=N;i++ )
{
    val = i;
if ((i%3) ==0)
{
 sum = sum + val;
}
}
    return sum;
}
}

