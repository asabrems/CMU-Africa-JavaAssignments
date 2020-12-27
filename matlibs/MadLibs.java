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
import java.util.List;
import java.awt.*;

public class MadLibs
{
    public static void main(String args[]) throws IOException, ClassNotFoundException
    {
        MadDictionary dictionary = new MadDictionary();
        LinkedList<String> story = new LinkedList<String>();
        String[] words;
        words = new String[1000];
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String word = "";
        String newWord ="";
        StringBuffer madDef;
        ObjectInputStream in;
        ObjectOutputStream out;
        int i;
        InputDataFile datafile;
        String dictionaryFileName = "MadDictionary.dat";
        if (fileExists(dictionaryFileName))
        {
            in = new ObjectInputStream(new FileInputStream(dictionaryFileName));
            dictionary = (MadDictionary) in.readObject();
            in.close();

        }

        System.out.print("please provide filename: ");
        str = keyboard.readLine();

        datafile = new InputDataFile(str);
        datafile.open();

        if (!datafile.isOpen())
        {
            System.out.println("Cannot open " + datafile.getName() + " for reading. Program ending.");
            System.exit(1);
        }

        word = datafile.readString();
        words = word.split("[ /.,{}()]");

        while (word != null)
        {

            words = word.split("[ /.,{}()]");
            word = datafile.readString();
 
            for (i = 0; i < words.length; i++)
            {
                if ((words[i].startsWith("[") && words[i + 1].endsWith("]")))

                {
                    words[i] = words[i] + words[i + 1];
                    newWord = words[i].substring(1,words[i].length()-1);
                    madDef = lookupWord(newWord, dictionary, keyboard);
                    System.out.println("The MadDefinition for " + words[i] + " is: " + madDef);
                    System.out.println();

                }
                else if (words[i].startsWith("[") && words[i].endsWith("]"))
                {
                    newWord = words[i].substring(1,words[i].length()-1);
                    madDef = lookupWord(newWord, dictionary, keyboard);
                    System.out.println("The MadDefinition for " + words[i] + " is: " + madDef);
                    System.out.println();
                }
            }
           
            //System.out.println(story);
        }
        List wordList = Arrays.asList(words);
        story.addAll(wordList);

        out = new ObjectOutputStream(new FileOutputStream(dictionaryFileName));
        out.writeObject(dictionary);

        out.close();

    }

    public static boolean fileExists(String file)

    {
        File document;
        document = new File(file);
        if (document.exists())
            return true;
        else
            return false;

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
