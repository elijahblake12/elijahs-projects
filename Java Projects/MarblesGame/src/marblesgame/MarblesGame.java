/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marblesgame;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author elijahblake12
 */

class Nim {
    
}
public class MarblesGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random(); 
        int marbles = ran.nextInt(91) + 10;
        System.out.println("There are " + marbles + " marbles");
        int ft = ran.nextInt(2);
        //System.out.println(ft);
        if (ft == 0)
        {
            System.out.println("The computer will go first");
             
            while (marbles != 1)
            {
            int computerSelection = ran.nextInt(marbles/2);
            //System.out.println(computerSelection);
            marbles = marbles - computerSelection;
            System.out.println("The computer has taken " + computerSelection + " marbles");
            System.out.println("How many marbles out of " + marbles + " would you like you take?");
            Scanner take = new Scanner(System.in);
            int taken = take.nextInt();
            System.out.println(take.nextLine());
            marbles = marbles - taken;
            System.out.println("There are " + marbles + " marbles left");
            System.out.println("");
            }
            
            if (marbles == 1)
            {
                System.out.println("The Game is over!");
            }
        }
        else
        {
            System.out.println("You will go first");
            
            while (marbles != 1)
            {
            System.out.println("How many marbles out of " + marbles + " would you like you take?");
            Scanner take = new Scanner(System.in);
            int taken = take.nextInt();
            System.out.println(take.nextLine());
            marbles = marbles - taken;
            System.out.println("There are " + marbles + " marbles left");
            System.out.println("");
            int computerSelection = ran.nextInt(marbles/2);
            //System.out.println(computerSelection);
            marbles = marbles - computerSelection;
            System.out.println("The computer has taken " + computerSelection + " marbles");
            }
            
            if (marbles == 1)
            {
                System.out.println("The Game is over!");
            }
            
            
        }
        
        
        
        
        
        
        
    }
    
}
