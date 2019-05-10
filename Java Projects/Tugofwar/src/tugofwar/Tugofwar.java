package tugofwar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author elijahblake12
 */
public class Tugofwar {

    public static void main(String[] args) throws FileNotFoundException {
        int weightMax;
        WeightMatrix weights;

        Scanner in = new Scanner(new File("balanced.txt"));
        PrintWriter out = new PrintWriter(new File("balanced.out"));
        
        

        while (in.hasNext()) {

            int numberChildren = in.nextInt();
            weightMax = in.nextInt();
            weights = new WeightMatrix(numberChildren, weightMax);
            weights.solve(in, numberChildren);
            if (in.hasNext()) {

                out.println();

            }

        }

        out.close();
    }

}
