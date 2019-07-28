/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gowse
 */
import java.util.Scanner;

public class ctofconverter 
{
    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       double farTemp = 0;
       double celTemp = 0;
       String trash = "";
       double freezing = 32;
       double fraction = 0.5556;
       
        // Ask the user for temp in far
        System.out.print("Please enter the Fahrenheit temperature you wish to convert into celsius: ");
        //Make the input bullet proof
        farTemp = getDouble();
        //Calculate the temp in cel
        celTemp = (farTemp - freezing) * fraction;
        celTemp = Math.round(celTemp * 100.0) / 100.0;
        //Return the temp in cel
        System.out.println("The temperature in Fahrenheit you provided was " + farTemp);
        System.out.println("The converted temperature into Celsius is " + celTemp);
    }
    
    public static double getDouble() // bullet proofs the input. 
    {
        double inputValue = 1000;
        boolean done = false;
        String trash;
        
        while(!done)
        {
            if(in.hasNextDouble())
            {
                inputValue = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.print("You must enter a number. Try again: ");
            }
        }
        return inputValue;
        
    }
    
}
