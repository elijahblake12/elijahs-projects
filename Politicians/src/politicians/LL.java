

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicians;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author elijahblake12
 */
public class LL {

    Scanner fin;        //allows file to be read in
    Scanner console;        
    Node next;      //node for coming after the node before
    Node first;     //first node
    Node last;      //last node

    LL() {

        try {       
            fin = new Scanner(new File("nkm.txt"));     //reads in file to use for program
            console = new Scanner(System.in);
        } catch (Exception e) {     //used for if the file can't be read in
            System.err.println("Opening file errer" + e);
        }

    }

    public void play() {        //method for going through the shooting process
        while (fin.hasNextLine()) {     //does shooting process using numbers from each line
            String x = fin.nextLine();
            String[] numbers = x.split(" ");      //creates a list of each of the different numbers
            int people = new Integer(numbers[0]);       //creates variable for number of people in the circle
            int clockWise = new Integer(numbers[1]);        //creates variable for how far the person shooting will move clockwise
            int counterClockwise = new Integer(numbers[2]);     //creates variable for how far the person shooting will move counterclockwise

            //for (int i = 1; i <= people; i++) {
                //if (first == null) {
                    first = new Node(1);        //sets the first Node to the first person
                //}
                //if (i == people) {
                    last = new Node(people);     //sets the last node to the last person
                //}
                //next = new Node(i);     //the next node will be the next person

            //}
            System.out.println("Program 4");
            System.out.println("---------");
            System.out.println("N = " + people + ", k = " + clockWise + ", m = " + counterClockwise);
            System.out.println("Output");

                  //determines the next counterclockwise position
            //
            next = new Node(clockWise);     //determines which person gets killed from clockwise

            last = new Node(people - counterClockwise + 1);     //determines which person gets killed from clockwise


            System.out.println(next.getPeople() + " " + last.getPeople());

            int g = next.getPeople();       //determines the next clockwise position
            int h = last.getPeople();       //determines the next counterclockwise position

            int count = 0;

            while (count != people) {       //while loop will stop when all the people have been dealt with

                if (h == g) {       //if m and k land on the same person

                    System.out.println(h);
                    System.out.println(g);
                    count += 1;     //only one person will be removed
                } else {        //if m and k land on different people

                    for (int i = 1; i <= people; i++) {

                        next = new Node(i);

                        if (i == g || i == h) {
                            next = null;        //removes the node
                        }

                    }

                    count += 2;     //two people will be removed
                }

                g = g + clockWise + 1;
                h = h - counterClockwise;
                if (g > people) {
                    g = g - people;
                }

                if (h < 1) {
                    h = h + 1 + people;
                }
                System.out.println(g + " " + h);

            }
            System.out.println("End of Program 4");
            System.out.println("");

        }

    }

}
