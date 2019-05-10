/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author elijahblake12
 */
public class ObjectOriented {
    
    private int x ;
    
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
        
        System.out.println("yclass: " + answer);
        System.out.println("xclass: " + xclass.getX());
    }
    
}
