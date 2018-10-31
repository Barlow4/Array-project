/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array.game;
import java.util.Scanner;
/**
 *
 * @author thbar7035
 */
public class ArrayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        //Declaring doubles and array
        double [ ] marks = new double [10];
        double total = 0;
        double average;
        
        //Output to user that indicates for them to interact with code
        System.out.println("Hows it going fella, you want your mark calculated? well I'm gonna need to know those marks then!");
        System.out.println("Put in 10 marks, we'll find the average");
        
        //loop that allows repetitive input from user
        for (int i = 0; i <= 9; i = i + 1)
        {
            marks[i] = keyedInput.nextDouble();
        }
        
        
        //loop that does the math to get the total of the numerals inputed
        for (int i = 0; i<=9; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //math to calculate average of the numbers
        average = total/10;
        average = average * 100;
        average = Math.round(average);
        average = average/100;
        
        //outputs average
        System.out.println("Your average was " + average + "%");
        
        //outputs diffrent messages depending on how good the mnarks were
        if (average >= 200){
            System.out.println("Yeah...no...you put it in wrong cause that's BS");
        }
        else if (average >= 101){
            System.out.println("You either have a lot of bonus marks, or you're lying");
        }
        else if (average >= 70){
            System.out.println("That's pretty good");
        }
        else if (average > 51){
            System.out.println("Hey, atleast you passed");
        }
        else if (average > 25){
            System.out.println("That's a hard OOF");
        }
        else if (average > 10){
            System.out.println("Wow you must've gone to class like...once");
        }
        else {
            System.out.println("That's a...uh...damn...I don't even...words cannot...*sigh*");
        }
        
        
        
        
    }
    
}
