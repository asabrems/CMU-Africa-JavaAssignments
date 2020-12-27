 /**
 *This program determines all prime numbers from 1 to 1001 using Eratosthenes algorithm.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
public class Primes
{
public static void main(String[] args)
{
    boolean prime[];
    int i; 
    int j; 
    prime = new boolean[1001];
//this loops sets each array to true 
for (i=1; i< 1001; i++)
{
    prime[i] = true;
}                      
//this loop performs the Seive of Eratosthenes algorithm;  
for (i =2; i< 1001;i++)
{
    if(prime[i]== true)
{
//this nested loop assigns false to all numbers which are not prime
for (j=(i);j< 1001;j++)
{
    if (((j%i) == 0)&&(i!=j))
{
    prime[j]= false;
}
}                                
}

}
//this loop looks throw array and picks up slots with true
for(i=1; i< 1001; i++)
{
if (prime[i]== true)
{
    System.out.println((i)+" is a prime number");
}
}

}
}
