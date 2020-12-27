
/**
 *This program performs mathematical calculations.
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

public class MadDictionary implements Serializable
{
    private HashMap<String, StringBuffer> madWords = new HashMap<String, StringBuffer>();

    public MadDictionary()
    {
        
    }
    // need a default constructor
    public StringBuffer addWord(String word, StringBuffer description)
    {
        if (getDescription(word) != null)

            return null; // indicates its is already in the list
        // your code

        // call the method to add the key (word) and value (description ) to madWords
        madWords.put(word.toLowerCase(), description);
        return description;

    }

    public StringBuffer getDescription(String word)
    {
        StringBuffer description;

        // description = new StringBuffer();

        // you write the code
        // call the method to set description to the value in madWords for the key word
        description = madWords.get(word.toLowerCase());
        return description;

    }

    public void print()
    {
        for (String key : madWords.keySet())
        {

            // write your code
            // write the System.out.println() call to print the key and the value in madWords
            System.out.println("The Key is: " + key + " and the value is: " + madWords.get(key));
        }
    }

    public String toString()
    {
        return "the Mad Dictionary has " + madWords.size() + "keyWords";
    }
}
