
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
import javax.swing.JLabel;

public class JSecretString extends JLabel
{
    private String secretPhrase;
    private String displayString;

    public JSecretString()
    {
        secretPhrase = "Java is great!";
        displayString = secretPhrase.replaceAll("[a-zA-Z]", "_");
        setText(displayString);
    }

    public JSecretString(String str)
    {
        secretPhrase = str;
        displayString = str.replaceAll("[a-zA-Z]", "_");
        setText(displayString);
    }

    public void setPhrase(String str)
    {
        secretPhrase = str;
        displayString = str.replaceAll("[a-zA-Z]", "_");
        setText(displayString);

    }

    public int uncover(String str)
    {
        int length;
        int count = 0;
        int i, j;
        int secretLength;
        String displayLetter = "";
        String letter = "";
        String secretLetter = "";

        length = str.length();
        secretLength = displayString.length();
        for (i = 1; i <= length; i++)
        {
            for (j = 1; j <= secretLength; j++)
            {
                letter = str.substring(i - 1, i);
                displayLetter = secretPhrase.substring(j - 1, j);

                if (letter.equalsIgnoreCase(displayLetter))
                {
                    secretLetter = secretPhrase.substring(j - 1, j);

                    displayString = displayString.substring(0, j - 1) + secretLetter + displayString.substring(j);
                    count++;
                    setText(displayString);
                    repaint();

                }

            }

        }
        return count;
    }

    public void uncoverALL()
    {
        displayString = secretPhrase;
        setText(displayString);
    }

    public boolean equals()
    {
        if (secretPhrase.equalsIgnoreCase(displayString))
            return true;

        else
            return false;
    }

    public boolean equal(String str)
    {
        if (secretPhrase.equalsIgnoreCase(str))
            return true;

        else
            return false;
    }

    public String toString()
    {

        return displayString;
    }
}