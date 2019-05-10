/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugofwar;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author elijahblake12
 */
class WeightMatrix {

    WeightMatrix(int numberChildren, int weightMax) {
        int[] matrix = new int[numberChildren];
    }

    void solve(Scanner in, int numberChildren) {
        int[] matrix = new int[numberChildren];
        for(int i = 0; i < numberChildren; i++){
            matrix[i] = in.nextInt();
        }
        
        int[] team1 = new int[numberChildren];
        int[] team2 = new int[numberChildren];
        
        for (int i = numberChildren-1; i >= 0; i--) {

            if ((add(team2) < add(team1)) || (add(team2) == add(team1))) {
                team2[i] = matrix[i];
            } else if (add(team1) < add(team2)) {
                team1[i] = matrix[i];
            }
        }
        System.out.print("Team 1: ");
        printSolution(team1);
        System.out.print("Team 2: ");
        printSolution(team2);
        int difference = java.lang.Math.abs(add(team1) - add(team2));
        System.out.println("The weight difference is " + difference);
        
    }

    
    
    public int add(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i];
        }
        return count;
    }
    
    public void printSolution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
            System.out.print(array[i]);
            System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
}
