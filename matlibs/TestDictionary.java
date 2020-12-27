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

public class TestDictionary
{
    public static void main(String args[]) throws IOException, ClassNotFoundException

    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        MadDictionary dictionary = new MadDictionary();
        ObjectOutputStream out;
        ObjectInputStream in;
        String str;
        StringBuffer madDef;
        String dictionaryFileName = "MadDictionary.dat";
        // before you uncomment the code below, write the code to check if the file exists.
        if (fileExists(dictionaryFileName))
        {
            in = new ObjectInputStream(new FileInputStream(dictionaryFileName));
            dictionary = (MadDictionary) in.readObject();
            in.close();

        }
        
        System.out.print("Enter a word and i will look it up or add it to the Mad Dictionary: ");
        str = keyboard.readLine();
        while (!str.equals(""))
        {
            madDef = lookupWord(str, dictionary, keyboard);
            System.out.println("The MadDefinition for " + str + " is: " + madDef);
            System.out.println();
            System.out.print("Enter another word: ");
            str = keyboard.readLine();

        }
        dictionary.print();

        out = new ObjectOutputStream(new FileOutputStream(dictionaryFileName));
        out.writeObject(dictionary);
        out.close();

    }

    public static boolean fileExists(String file)

    {
        File document;
        document = new File(file);
        if (document.exists())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static StringBuffer lookupWord(String word, MadDictionary d, BufferedReader keyboard) throws IOException
    {
        String str;
        StringBuffer definition;
        definition = d.getDescription(word);
        if (definition != null)
            return definition;
        System.out.print("Word: " + word + " not in Mad Dictionary. Please enter the description: ");
        definition = new StringBuffer(keyboard.readLine());
        d.addWord(word, definition);
        return definition;

    }
}
