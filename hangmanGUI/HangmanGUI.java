
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
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class HangmanGUI extends LayoutGUI implements StringHandler
{
    private PhraseList phrase = new PhraseList();
    private HangedMan hangedMan = new HangedMan(200, 200);
    private SingleUseButton playAgainButton;
    private JSecretString string;
    private JPanel alphabetsPanel = new JPanel();
    Container c;
    private JLabel game = new JLabel("0");
    private JLabel won = new JLabel("0");
    private JLabel losses = new JLabel("0");

    private ArrayList<SingleUseButton> buttons = SingleUseButton.getLetterButtons(this);

    public HangmanGUI()
    {
        playAgainButton = new SingleUseButton("PlayAgain", this);
        playAgainButton.setVisible(false);
    }

    public HangmanGUI(String str)
    {
        phrase.readInPhrases(str);
        playAgainButton = new SingleUseButton("PlayAgain", this);
        playAgainButton.setVisible(false);

    }

    public void addComponents(JFrame theFrame)
    {
        JLabel l1 = new JLabel("Games:");
        JLabel l2 = new JLabel("won");
        JLabel l3 = new JLabel(" lost");
        JLabel separation = new JLabel("______");
        JLabel separation2 = new JLabel("______");
        string = new JSecretString(phrase.getRandomPhrase());
        JPanel namePanel = new JPanel();
        JPanel hangmanPanel = new JPanel();
        JPanel NumGamePanel = new JPanel();
        JPanel GamesPlayedPanel = new JPanel();

        JPanel win = new JPanel();
        JPanel loss = new JPanel();

        JPanel keyBoardPanel = new JPanel();
        JPanel hangedmanPanel = new JPanel();

        c = theFrame.getContentPane();
        c.setLayout(new FlowLayout());
        c.setMinimumSize(new Dimension(1000, 1000));

        NumGamePanel.setLayout(new FlowLayout());
        NumGamePanel.setBackground(Color.white);
        NumGamePanel.add(l1);
        NumGamePanel.add(game);

        win.setLayout(new GridLayout(3, 1));
        win.add(l2);
        win.add(separation);
        win.add(won);

        loss.setLayout(new GridLayout(3, 1));
        loss.add(l3);
        loss.add(separation2);
        loss.add(losses);

        GamesPlayedPanel.setLayout(new FlowLayout());
        GamesPlayedPanel.setBackground(Color.white);

        GamesPlayedPanel.add(win);
        GamesPlayedPanel.add(loss);

        namePanel.setLayout(new GridLayout(2, 4));
        namePanel.setBackground(Color.white);
        namePanel.add(NumGamePanel);
        namePanel.add(GamesPlayedPanel);

        string.setLayout(new GridLayout(1, 1));
        string.setBackground(Color.white);

        hangmanPanel.setLayout(new FlowLayout());
        hangmanPanel.add(hangedMan);
        hangmanPanel.setMaximumSize(new Dimension(100, 100));

        hangedmanPanel.setLayout(new BorderLayout());
        hangedmanPanel.add(hangmanPanel, BorderLayout.EAST);
        hangedmanPanel.setMaximumSize(new Dimension(100, 100));

        alphabetsPanel.setLayout(new GridLayout(3, 1));
        for (SingleUseButton button : buttons)
        {
            alphabetsPanel.add(button);
        }

        keyBoardPanel.setLayout(new BorderLayout());
        keyBoardPanel.add(alphabetsPanel, BorderLayout.SOUTH);

        c.add(namePanel);
        c.add(string);
        c.add(hangedmanPanel);
        c.add(keyBoardPanel);
        c.add(playAgainButton);

    }

    public String getString(String str)
    {
        return str;
    }

    public void processString(String text)
    {

        string.uncover(text);

        if (string.uncover(text) == 0)
        {

            hangedMan.addBodyPart();
            hangedMan.repaint();
            playAgainButton.setVisible(false);
        }
        else if (string.uncover(text) != 0)
        {
            string.repaint();

            playAgainButton.setVisible(false);

        }
        if (string.equals() && !text.equals(playAgainButton.getText()))
        {

            playAgainButton.setVisible(true);
            playAgainButton.setEnabled(true);

            game.setText("" + (Integer.parseInt(game.getText()) + 1));
            won.setText("" + (Integer.parseInt(won.getText()) + 1));
            for (SingleUseButton button : buttons)
            {
                button.setEnabled(false);

            }
        }

        else if (hangedMan.isHanged() && !text.equals(playAgainButton.getText()))
        {

            playAgainButton.setVisible(true);
            playAgainButton.setEnabled(true);
            string.uncoverALL();

            game.setText("" + (Integer.parseInt(game.getText()) + 1));

            losses.setText("" + (Integer.parseInt(losses.getText()) + 1));
            for (SingleUseButton button : buttons)
            {

                button.setEnabled(false);

            }

        }
        // getting the message on the play again button
        if (text.equals(playAgainButton.getText()))
        {

            string.setPhrase(phrase.getRandomPhrase());
            string.repaint();
            hangedMan.reset();

            for (SingleUseButton button : buttons)
            {
                button.setEnabled(true);

            }
            playAgainButton.setVisible(false);
        }

    }

    public String toString()
    {
        return "this is a hangman game";
    }

}
