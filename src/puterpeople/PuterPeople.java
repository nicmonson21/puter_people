package puterpeople;

import java.util.ArrayList;
import java.util.List;
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
        int number;
        System.out.print("Enter a number: ");
        number = stdIn.nextInt();
        
        for(int i = 1;i<=number;i++){
            System.out.println(i);
        }
      
      Scanner stdIn2 = new Scanner(System.in);
        int nextNumber;
        System.out.print("Enter another number: ");
        nextNumber = stdIn2.nextInt();
        System.out.println();
        double x = MathFunctions.SquareRootAndAddThree(nextNumber);
    
    
    List<Integer> numbers= new ArrayList();
        numbers.add(nextNumber);
        int sum=0;
        for(Integer j: numbers) {
            sum= sum +j;
            System.out.println("The sum is " + sum);
           

    
            
    }    
        }       
    }

