/**
 *This program is a game that allows user guess random number it generates. It tests the ability to construct methods and pass bufferReader as an argument.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
import java.util.*;

public class GuessTheNumber
{
    static Random r = new Random();
public static void main(String argv[]) throws IOException
{
    String str ="";
    String name;
    int trial;
    int trialchecker;
    int maxRange;
    String output;
    trial =0;
    maxRange = 1 +r.nextInt(1000);
    trialchecker = log2(maxRange);
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    name = promptForName(keyboard);
    System.out.print("Hi "+name+" would you like to play the game: ");                                                                                                          
    str = keyboard.readLine();
    String output2;
    output = isYes(str);
    output2 = isBlank(str);

while ((output.equals("yes"))||(output2.equals("yes")))
{
    System.out.println("Hi " + name +" I am thinking of a number from 1- "+ maxRange + " -guess the number");   
    guess(keyboard, maxRange, name);

if (trial<trialchecker )
{ 
    System.out.println("you know the secret!");                                                                                                        
}                                                                                                                                                                                                               

else if (trial > trialchecker)
{                                                                                                             
    System.out.println("You should be able to do better!");
}   
    System.out.println("Congratulations, you guessed the number!");
    System.out.println("Hi "+name+" would you like to play the game again: ");
    str= keyboard.readLine();
    output = isYes(str);
    output2 = isBlank(str);

}

}

public static String promptForName(BufferedReader keyboard) throws IOException
{
    String name;
    System.out.print("please enter your name: ");
    name = keyboard.readLine();
    return name;
}

public static int guess(BufferedReader keyboard, int maxRange, String name) throws IOException
{
String str;
    int trial;
    int guess;
    int number;     
    trial =0;// this integer variable determines the number of trials
    number =1+ r.nextInt(maxRange);   
    str = keyboard.readLine();
    guess = Integer.parseInt(str);

while(true)  
{                                                                                                      
if (guess == number)
{
     break;                                                                                                
}

if (guess< number)
{
    System.out.println("Too low.");
}

else
{ 
    System.out.println("Too high");
}
    trial = trial +1;
    System.out.println("Try again");
    System.out.println("Hi " + name +"I am thinking of a number from 1-"+ maxRange + "-guess the number"); 
    str = keyboard.readLine();
    guess = Integer.parseInt(str);
}
    return trial;   
}

public static int log2(int maxRange)
{
    int val ;
    val = (int)(Math.round(Math.log10(maxRange)/Math.log10(2)));
    return val;
}

public static String isBlank(String answer)
{
    answer= answer.replaceAll("[.?, :   ']","");
if( answer.equals(""))
{ 
    return answer = "yes";
}
    return answer = "no"; 
}

public static String isYes(String answer)
{
if ((answer.equalsIgnoreCase("y"))||(answer.equalsIgnoreCase("yes")||(answer.equalsIgnoreCase("yep"))))
{
    return answer="yes";
}
    return answer = "no";
}
                                                                                                         
}
