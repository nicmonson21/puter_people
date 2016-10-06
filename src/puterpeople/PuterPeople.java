/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puterpeople;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class PuterPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
        String number;
        System.out.print("Enter a number: ");
        number = stdIn.nextLine();
        System.out.println("Your number is " + number);
  
    }
    
}
