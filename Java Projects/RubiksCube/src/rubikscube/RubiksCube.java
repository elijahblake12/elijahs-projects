/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikscube;

import java.util.Random;

/**
 *
 * @author elijahblake12
 */
public class RubiksCube {

    void F(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];

        front[0] = f2;
        front[1] = f0;
        front[2] = f3;
        front[3] = f1;
        up[2] = l1;
        up[3] = l3;
        left[1] = d0;
        left[3] = d1;
        down[0] = r2;
        down[1] = r0;
        right[0] = u2;
        right[2] = u3;
        //System.out.println("F");
    }

    void Fp(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];

        front[0] = f1;
        front[1] = f3;
        front[2] = f0;
        front[3] = f2;
        up[2] = r2;
        up[3] = r0;
        left[1] = u2;
        left[3] = u3;
        down[0] = l1;
        down[1] = l3;
        right[0] = d0;
        right[2] = d1;
        //System.out.println("Fp");
    }

    void U(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];

        up[0] = u2;
        up[1] = u0;
        up[2] = u3;
        up[3] = u1;
        front[0] = r0;
        front[1] = r1;
        left[0] = f0;
        left[1] = f1;
        back[0] = l0;
        back[1] = l1;
        right[0] = b0;
        right[1] = b1;
        //System.out.println("U");
    }

    void Up(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];

        up[0] = u1;
        up[1] = u3;
        up[2] = u0;
        up[3] = u2;
        front[0] = l0;
        front[1] = l1;
        left[0] = b0;
        left[1] = b1;
        back[0] = r0;
        back[1] = r1;
        right[0] = f0;
        right[1] = f1;
        //System.out.println("Up");
    }

    void R(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void Rp(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void L(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void Lp(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void D(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void Dp(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void B(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    void Bp(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        char f0 = front[0];
        char f1 = front[1];
        char f2 = front[2];
        char f3 = front[3];
        char l0 = left[0];
        char l1 = left[1];
        char l2 = left[2];
        char l3 = left[3];
        char u0 = up[0];
        char u1 = up[1];
        char u2 = up[2];
        char u3 = up[3];
        char r0 = right[0];
        char r1 = right[1];
        char r2 = right[2];
        char r3 = right[3];
        char b0 = back[0];
        char b1 = back[1];
        char b2 = back[2];
        char b3 = back[3];
        char d0 = down[0];
        char d1 = down[1];
        char d2 = down[2];
        char d3 = down[3];
    }

    boolean sideSolved(char[] side) {
        for (int i = 0; i < side.length; i++) {
            if (side[i] != side[0]) {
                return false;
            }
        }
        return true;
    }

    boolean cubeSolved(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        return sideSolved(front) && sideSolved(left) && sideSolved(up) && sideSolved(back) && sideSolved(right) && sideSolved(down);
    }

    void printCube(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        System.out.print("  ");
        System.out.print(up[0]);
        System.out.println(up[1]);
        System.out.print("  ");
        System.out.print(up[2]);
        System.out.println(up[3]);
        System.out.print(left[0]);
        System.out.print(left[1]);
        System.out.print(front[0]);
        System.out.print(front[1]);
        System.out.print(right[0]);
        System.out.println(right[1]);
        System.out.print(left[2]);
        System.out.print(left[3]);
        System.out.print(front[2]);
        System.out.print(front[3]);
        System.out.print(right[2]);
        System.out.println(right[3]);
        System.out.print("  ");
        System.out.print(down[0]);
        System.out.println(down[1]);
        System.out.print("  ");
        System.out.print(down[2]);
        System.out.println(down[3]);
        System.out.print("  ");
        System.out.print(back[0]);
        System.out.println(back[1]);
        System.out.print("  ");
        System.out.print(back[2]);
        System.out.println(back[3]);
        System.out.println("  ");
    }

    void shuffle(char[] front, char[] left, char[] up, char[] right, char[] back, char[] down) {
        Random r = new Random();
        int move = r.nextInt(2);
        //System.out.println(move);
        if (move == 0) {
            F(front, left, up, right, back, down);
        }
        if (move == 1) {
            Fp(front, left, up, right, back, down);
        }
        if (move == 2) {
            U(front, left, up, right, back, down);
        }
        if (move == 3) {
            Up(front, left, up, right, back, down);
        }
    }
    
    char[] top0(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] top1(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] top2(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] top3(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] bottom0(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] bottom1(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] bottom2(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    char[] bottom3(){
        char[] piece = {'w', 'o', 'b'};
        return piece;
    }
    
    void solveFirstLayer(){
        
    }
    
    void orientLastLayer(){
        
    }
    
    void permuteLastLayer(){
        
    }

    public static void main(String[] args) {
        char[] front = {'r', 'r', 'r', 'r'};
        char[] left = {'w', 'w', 'w', 'w'};
        char[] up = {'b', 'b', 'b', 'b'};
        char[] back = {'o', 'o', 'o', 'o'};
        char[] right = {'y', 'y', 'y', 'y'};
        char[] down = {'g', 'g', 'g', 'g'};

        RubiksCube rc = new RubiksCube();
        rc.printCube(front, left, up, right, back, down);
        rc.F(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.Fp(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.F(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.Fp(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.U(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.Up(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.U(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
       rc.Up(front, left, up, right, back, down);
       rc.printCube(front, left, up, right, back, down);
        
        
       for (int i = 0; i < 100; i++) {
            rc.shuffle(front, left, up, right, back, down);
        }

        rc.printCube(front, left, up, right, back, down);

        int moves = 0;
        while (!rc.cubeSolved(front, left, up, right, back, down)) {
            rc.shuffle(front, left, up, right, back, down);
            moves += 1;
        }

        rc.printCube(front, left, up, right, back, down);
        System.out.println(moves);

    }

}
