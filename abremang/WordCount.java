/**
 *This program uses the concept of arrays, the program counts the number of letters, words and sentences within a string passed.
 *
 * @author Adwoa Asantewaa Bremang
 *
 * Andrew ID: abremang
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
public class WordCount
{
public static void main(String[] args) throws IOException
{    
    int i;
    int count;   
    int loops;
    String str =""; 
    String arg="";
    count = 0;
    loops =0;
    String string[];
    Character letters[];
    String words[];
    String sentences[];
    
    string = new String[22];
while (count <= 10)
{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Please enter a string, press Enter to end: ");
    str = input.readLine(); 
    string[count] = new String(str);
if (!(string[count].equals("")))//this is a condition counts the number of arrays filled
{
    loops = loops +1;
}
    count = count +1;
} 
    System.out.println("thanks for entering "+(loops)+" lines of code");
for (i=0; i<loops;i++)
{
    arg= string[i];
    letters = splitLetters(arg);
    words = getWord(arg);
    sentences = getSentence(arg);
    System.out.println("counts(letters, words, sentences): "+letters.length+ " "+ words.length + " " +sentences.length);
    printArray("letter",letters);
    System.out.print("\n");
    printArray("word",words);
    System.out.print("\n");
    printArray("sentence",sentences);
}
            
}

                                                                                    
public static Character[] splitLetters(String word)
{
    int i;
    int len1;
    Character  letters[];
    len1 = word.length();
    letters =new Character[len1];
 for (i=0; i< len1; i++)
{
    letters[i]= word.charAt(i);
}
    return letters;
}                                                                                  
public static String[] getWord(String word)
{
    String words[];
    word.replaceAll("[.,'?    ]"," ");
    words= word.split(" ");
    return words;
}
public static String[] getSentence(String word)
{                                                                                    
    int len1;
    String words[];
    words= word.split("[,.;]");
    return words;
}
public static void printArray(String label, Object array[])
{
    int i;
for (i=0; i< array.length; i++)
{
    System.out.println(label+"["+i+"]: "+ array[i]);
}
 
}
}

