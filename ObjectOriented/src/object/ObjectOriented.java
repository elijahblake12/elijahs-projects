/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author elijahblake12
 */
public class ObjectOriented {
    
    private int x ;
    boolean mybool = true;
    
    
    ObjectOriented(int input)
    {
        x = input;
    }
    
    public int getX()
    {
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ObjectOriented xclass;
        
        xclass = new ObjectOriented(69);
        
        ObjectOriented yclass = new ObjectOriented(-69);
        
        int answer = yclass.getX();
        
       // System.out.println("yclass: " + answer);
       // System.out.println("xclass: " + xclass.getX());
        
        //System.out.println("dfdfdf");
        Random ran = new Random();
        int marbles = ran.nextInt(100);
        System.out.println(marbles);
        int computerSelection = ran.nextInt((marbles)/2) + 1;
        System.out.println(computerSelection);
        
        while (marbles - computerSelection != 3 &&
               marbles - computerSelection !=  7 &&
               marbles - computerSelection !=  15 &&
               marbles - computerSelection !=  31 &&
               marbles - computerSelection !=  63)
        {
            computerSelection = ran.nextInt((marbles)/2) + 1;
            
        }
        System.out.println(marbles);
        System.out.println(computerSelection);
        int w = ran.nextInt(2);
        System.out.println(w);
        
        
    
}
    public void myScannerMethod() 
    {
        Scanner console;
        console = new Scanner(System.in);
        System.out.println("Give me a number:");
        int number = (int)console.nextInt();
    }
    
    
    
    
    
    
    
    
    
        
        
    
    
}
