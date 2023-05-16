/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author umin
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*char[] myLetters = new char[5];
        myLetters[0] = 'R';
        myLetters[1] = 'o';
        myLetters[2] = 'n';
        myLetters[3] = 'a';
        myLetters[4] = 'k';
        
        for (char e: myLetters) {
            System.out.print(e);
        }
*/
        
        System.out.println("Enter word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        for (int i = 0; i < myLetters.length; i++) {
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
            
        for (int i = myLetters.length - 1; i >= 0 ; i--) {
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
    }
    
}

