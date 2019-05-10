package turtle;

import javax.swing.*;
import java.awt.*;

public class Turtle {

    public static void main(String[] args) {
        Turtle turtle = new Turtle(250, 250, 0);
        turtle.startProgram(0);
        turtle.penColor(0,0,255);
        for (int i = 0; i < 12; i++) {
            turtle.forward(20);
            turtle.setHeading(30);
        }
        
        turtle.forward(50);
        turtle.penColor(255,0,0);
        turtle.right();
        turtle.forward(50);
        turtle.left();
        turtle.forward(50);
        turtle.goTo(50,50,0);
        turtle.penColor(0,255,0);
        turtle.forward(50);
        turtle.home();
        //turtle.clear();
        System.out.println(turtle.xcor());
        System.out.println(turtle.ycor());
    }
    private static JFrame jframe;
    private static JPanel panel;
    private static Graphics graphics;

    public static int width = 500;

    public static int height = 500;

    private int x = 250;
    private int y = 250;
    private double turtleAngle;
    private boolean penDown = true;
    private Color turtleColor = Color.black;

    public Turtle() {
        this(width / 2, height / 2, 0);
    }

    public Turtle(int x, int y, int ang) {
        if (jframe == null) {
            jframe = new JFrame("Turtle window");
            panel = new JPanel();
            panel.setPreferredSize(new Dimension(width, height));
            jframe.getContentPane().add(panel, BorderLayout.CENTER);
            jframe.pack();
            jframe.setVisible(true);
            graphics = panel.getGraphics();
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            clear();
            this.x = x;
            this.y = y;
            clear();

        }

        this.x = x;
        this.y = y;
        turtleAngle = ang;
    }
    
    public void forward(int d) {
        double rAngle = (turtleAngle * Math.PI) / 180;
        int newX = (int) Math.round(x + Math.cos(rAngle) * d);
        int newY = (int) Math.round(y - Math.sin(rAngle) * d);
        if (penDown) {
            Color save = graphics.getColor();
            graphics.setColor(turtleColor);
            graphics.drawLine(x, y, newX, newY);
            graphics.setColor(save);
        }
        x = newX;
        y = newY;
    }

    public void right() {
        turtleAngle = turtleAngle - 90;
    }

    public void left() {
        turtleAngle = turtleAngle + 90;
    }

    public void penUp() {
        penDown = false;
    }

    public void penDown() {
        penDown = true;
    }

    public void home() {
        x = 250;
        y = 250;
        turtleAngle = 0;
    }

    public void goTo(int x, int y, int ang) {
        Color save = graphics.getColor();
        graphics.setColor(turtleColor);
        this.x = x;
        this.y = y;
        turtleAngle = mod(ang, 360);
        graphics.setColor(save);
    }

    public int xcor() {
        return x;
    }

    public int ycor() {
        return y;
    }

    public void setHeading(double a) {
        turtleAngle = mod(turtleAngle + a, 360);
    }

    public void speed(int d) {
        try {
            Thread.currentThread().sleep(d);
        } catch (InterruptedException e) {
        }
    }

    public void penSize(int size) {
        //graphics.setStroke(new BasicStroke(size));
    }

    public void clear() {
        Color c = graphics.getColor();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(c);
    }

    public void penColor(int r, int g, int b) {
        turtleColor = new Color(r,g,b);
    }
    
    public Color getColor() {
        return turtleColor;
    }

    public void startProgram(int d) {
        graphics.drawOval(x - d / 2, y - d / 2, d, d);
    }

    private double mod(double x, int y) {
        double ans = x % y;
        if (ans < 0) {
            ans = ans + y;
        }
        return ans;
    }

}
