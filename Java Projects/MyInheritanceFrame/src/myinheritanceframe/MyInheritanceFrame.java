/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinheritanceframe;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author elijahblake12
 * 
 */

public class MyInheritanceFrame extends JFrame implements MouseListener{
    
    public MyInheritanceFrame(String title, int w, int h){
        this.setVisible(true);
        this.setTitle(title);
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.addMouseListener(this);
        panel.setBackground(color);
        getContentPane().add(panel);
        
        
        
    }
        JPanel panel = new JPanel();
        Color color = new Color(255,255,0);
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyInheritanceFrame frame = new MyInheritanceFrame("232 Frame", 300, 600);
        
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color color = new Color(r,g,b);
        panel.setBackground(color);
        getContentPane().add(panel);
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
   
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Color color = new Color(255,255,0);
        panel.setBackground(color);
        getContentPane().add(panel);
    }
    
}
