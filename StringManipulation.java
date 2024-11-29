package stringmanipulation;

import java.util.Scanner;

/*
    
Develop a Java application that will manipulate a String. 
The program must allow the user to enter a string input.
The application must then manipulate the given String by determining if there are any non-alphanumeric characters
(such as punctuation or special symbols). After manipulating the String, 
display the original input string, the input string in uppercase, 
the number of non-alphanumeric characters and the non-alphanumeric characters.

*/

public class StringManipulation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int count = 0;
        String nonCh = "";
        
        System.out.print("Enter the string you want to manipulate: ");
        String text = input.nextLine();
        
        System.out.println("Input String: " + text);
        System.out.println("Input String in Upper Case: " + text.toUpperCase());
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if(!Character.isLetterOrDigit(ch)){
                count++;
                nonCh += ch;
            }
            
        }
        
        System.out.println("Total non-alphanumeric characters: " + count);
        System.out.println("Non-alphanumeric characters: " + nonCh);
    }
}