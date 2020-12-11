/**
 * Liam McArdle
 * February 24th, 2019
 */

import javax.swing.JOptionPane;
public class Palindrome1 {

    public static void main(String args[]) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i) + " - " +
                        (int) str.charAt(i));
            }
        } catch (Exception e) {
            System.out.println("Sorry, something went wrong.");
        }
        System.out.println("The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.");
        System.out.println("The java string split() method is used to split the string into a string array based on the provided regular expression.");
    }
}
