import java.util.*;

/**
 * This program reads phrases from a file or user and stores them in an arraylist.
 *
 * @author Asantewaa Bremang
 * 
 * Andrew Id: abremang
 * 
 * @author Fortune Madziro
 *
 * Andrew Id: fkm
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this
 * work.
 *
 */

public class PhraseList
{
    private ArrayList<String> phrases = new ArrayList<String>();
    private Random randomGenerator = new Random();

    public PhraseList()
    {
        phrases.add("Java is great!");

    }

    public PhraseList(String str)
    {
        phrases.add(str);

    }

    public void readInPhrases(String fileName)
    {
        String phrase;

        phrase = new String("Asantewaa");

        InputDataFile datafile;

        datafile = new InputDataFile(fileName);

        datafile.open();

        if (!datafile.isOpen())
        {
            System.out.println("Cannot open " + datafile.getName() + " for reading. Program ending.");
            System.exit(1);
        }

        phrase = datafile.readString();

        while (phrase != null)
        {

            phrases.add(phrase);

            phrase = datafile.readString();
        }

        datafile.close();
    }

    public void addPhrase(String phrase)
    {
        phrases.add(phrase);
    }

    public void clearPhrases()
    {
        phrases.clear();
    }

    public void printPhrases()
    {
        for (int i = 0; i < phrases.size(); i++)
            System.out.println(phrases.get(i));
    }

    public String getPhrase(int n)
    {
        if (n > 0 && n <= phrases.size())
        {
            int index;

            index = n - 1;

            return phrases.get(index);
        }

        else
        {
            return "";
        }

    }

    public String getRandomPhrase()
    {

        return phrases.get(randomGenerator.nextInt(phrases.size()));
    }

    public String toString()
    {
        String str = "";

        for (int i = 0; i < phrases.size(); i++)
            str = str + phrases.get(i) + "\n";

        return ("The list of phrases is as follows: \n" + str);
    }
}
