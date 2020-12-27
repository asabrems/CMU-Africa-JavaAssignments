/**
 *This program uses the concept of enumeration to generate random toss for the CoinToss Porgram.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.util.*;

public class Coin
{
    private static Random r = new Random();
    private CoinSide sideUp;
    private enum CoinSide { HEADS, TAILS };
public Coin()
{
    sideUp = CoinSide.HEADS;
}
public boolean isHeads()
{
    if (sideUp == CoinSide.HEADS)
{
    return true;
}
    return false;
}

public boolean isTails()
{
    if(sideUp == CoinSide.TAILS)
{
    return true;
}
    return false;
}

public void flip()
{
    // Generate a random number, either 0 or 1, and use it to set sideUp to HEADS or TAILS
int number;
number = 0+ r.nextInt(2);
    if (number ==0)
{
    sideUp = CoinSide.HEADS;
}
else if (number == 1)
{
    sideUp = CoinSide.TAILS;
}
}
public String toString()
{
    return ("Coins side up is: " + sideUp);
}
}
