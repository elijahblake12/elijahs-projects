/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicians;

/**
 *
 * @author elijahblake12
 */
public class Node {
    
    private Node next;
    private Node previous;
    private int people;
    private int clockWise;
    private int counterClockwise;
    
    public Node(int people, int clockWise, int counterClockwise){
        this.people = people;
        this.clockWise = clockWise;
        this.counterClockwise = counterClockwise;
    }
    
    public Node(int people){
        this.people = people;
    }
    
    public String toString(){
        return (people + clockWise + counterClockwise + "");
    }
    
    public void setNext(Node x){
        next = x;
    }
    
    public void setPrevious(Node x){
        previous = x;
    }
    
    public Node getPrevious(){
        return previous;
    }
    
    public Node getNext(){
        return next;
    }
    
    public int getPeople(){
        return people;
    }
    
    public int getClockWise(){
        return clockWise;
    }
    
    public int getCounterClockwise(){
        return counterClockwise;
    }
    
    
}
