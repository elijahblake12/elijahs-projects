/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realmaze;

/**
 *
 * @author elijahblake12
 */
public class RealMaze {
    
    

    public static void findEnd(String[][] input, int x, int y, int hand) {      //the method will take in new paramters each time to find the next move
           
        String currentPosition = input[x][y];
        input[x][y] = "X";      //marks the current position 
        //int direction = 1;
        //int direction;
        if (input[x][y] == "F"){        //used for if the end of the maze is found
            System.exit(0);
        }
        
        if(y != 11){        //used to ensure that y isn't outside of the maze 
        if(input[x][y+1] == "." && input[x][y+1] != "X"){       //checks if the next position is a dot that it can move to
            currentPosition = input[x][y+1] = "X";
            //System.out.println(direction);
            //direction = 1;
            //System.out.println("right");
            
            for(int i = 0; i<12; i++){      //prints maze with updated position
            System.out.println("");
            for(int j = 0; j<12; j++){
            System.out.print(input[i][j]);
            }
            
            }
            
            System.out.println("");
            
            findEnd(input, x, y+1, 1);      //sets the new x, new y, and new hand for the next move
            }
        }
        
        
        if(x != 0){     //used to ensure that x isn't outside of the maze 
        
        if(input[x-1][y] == "." && input[x-1][y] != "X"){       //checks if the next position is a dot that it can move to
            currentPosition = input[x-1][y] = "X";
            //direction = 3;
            //System.out.println("up");
            
            for(int i = 0; i<12; i++){      //prints maze with updated position
            System.out.println("");
            for(int j = 0; j<12; j++){
            System.out.print(input[i][j]);
            }
            
            }
            
            System.out.println("");
            
            findEnd(input, x-1, y, 3);      //sets the new x, new y, and new hand for the next move
            }
        }
        
        if(x != 11){        //used to ensure that y isn't outside of the maze 
        
        if(input[x+1][y] == "." && input[x+1][y] != "X"){       //checks if the next position is a dot that it can move to
            currentPosition = input[x+1][y] = "X";
            //direction = 4;
            //System.out.println("down");
            
            for(int i = 0; i<12; i++){      //prints maze with updated position
            System.out.println("");
            for(int j = 0; j<12; j++){
            System.out.print(input[i][j]);
            }
            
            }
            
            System.out.println("");
            
            findEnd(input, x+1, y, 4);      //sets the new x, new y, and new hand for the next move
        }
        }
        
        if(y != 0){     //used to ensure that y isn't outside of the maze 
        if(input[x][y-1] == "." && input[x][y-1] != "X"){       //checks if the next position is a dot that it can move to
            currentPosition = input[x][y-1] = "X";
            //direction = 2;
            //System.out.println("left");
            
            for(int i = 0; i<12; i++){      //prints maze with updated position
            System.out.println("");
            for(int j = 0; j<12; j++){
            System.out.print(input[i][j]);
            }
            
            }
            
            System.out.println("");
            
            findEnd(input, x, y-1, 2);      //sets the new x, new y, and new hand for the next move
            }
        }
        
        
        
        
        
        
        
           
        
           
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
String [][] maze = {{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},       //the maze in the form of a two dimensional array
                    {"#", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", "#"},
                    {".", ".", "#", ".", "#", ".", "#", "#", "#", "#", ".", "#"},
                    {"#", "#", "#", ".", "#", ".", ".", ".", ".", "#", ".", "#"},
                    {"#", ".", ".", ".", ".", "#", "#", "#", ".", "#", ".", "#"},
                    {"#", "#", "#", "#", ".", "#", "F", "#", ".", "#", ".", "#"},
                    {"#", ".", ".", "#", ".", "#", ".", "#", ".", "#", ".", "#"},
                    {"#", "#", ".", "#", ".", "#", ".", "#", ".", "#", ".", "#"},
                    {"#", ".", ".", ".", ".", ".", ".", ".", ".", "#", ".", "#"},
                    {"#", "#", "#", "#", "#", "#", ".", "#", "#", "#", ".", "#"},
                    {"#", ".", ".", ".", ".", ".", ".", "#", ".", ".", ".", "#"},
                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};

        
        
        maze[2][0] = "X";       //marking the start of the maze
        
        for(int i = 0; i<12; i++){      //printing the initial state of the maze
            System.out.println("");
            for(int j = 0; j<12; j++){
            System.out.print(maze[i][j]);
            }
            
        }
        
       
        
        
        
        findEnd(maze, 2, 0, 1);     //recursively finding the end of the maze with the x, y position, and the hand position
        
        
        
        

    }

}


