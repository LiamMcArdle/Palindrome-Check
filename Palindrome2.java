/**
 * Liam McArdle
 * February 24th, 2019
 * A simple program that checks to see if the user inputs a palindrome or not.
 */
import java.util.*;
import javax.swing.JOptionPane;
public class Palindrome2 {
    public static void checkPalindrome(String s)
    {
        // reverse the given String and buffer it
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equalsIgnoreCase(reverse))
            JOptionPane.showMessageDialog(null,"Yes, this is a palindrome.");

        else
            JOptionPane.showMessageDialog(null,"No, this is not a palindrome.");
    }

    public static void main (String[] args)
    {
        String userInput = "";
        userInput = JOptionPane.showInputDialog("Please enter a word to see if it is a palindrome."); //Collects user's input
        String pal = userInput.replaceAll(" ", ""); //Replaces all whitespace with nothing
        String palFinal = pal.replaceAll("\\p{Punct}",""); //Replaces all punctuation with nothing, "\\p{Punct} represents all types of punctuation.
        checkPalindrome(palFinal); //Executes the checkPalindrome class to determine the user's input status
    }

}
