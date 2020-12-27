/**
 *This program uses a helper class called Coin to provide the heads or tail outcome of coin toss.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
public class CoinToss
{
public static void main(String[] args )
{
    int i;
    int heads;
    int tails;
    int N;
    heads =0;
    tails =0;
    Coin coin;
    coin  = new Coin();
if ((args.length)==0)
{
    N = 0;
}
else
{
    N = Integer.parseInt(args[0]);
}
for (i=1; i<=N; i++)
{
    coin.flip();
    if (coin.isHeads()== true)
{
     heads= heads +1;
}
else if (coin.isTails()==true)
{
    tails = tails +1;
}
}

    System.out.println("Java Coin "+ N);
    System.out.println("Toss a coin "+N+" times.");
    System.out.println("Heads: "+heads +" Tails:"+tails);
    System.out.println("Heads: "+formatPercent(heads,N) +" Tails:"+formatPercent(tails,N));
}
public static String formatPercent(int heads, int N)
{
    String percent ="";
    int value;
    value =(int)(((double)heads/(double)N)*(100.0));
    percent = ""+ value+"%";
return percent;
}                                                                                                         
}
