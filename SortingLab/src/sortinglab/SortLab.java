package sortinglab;

import java.util.Random;

/**
 *
 * @author elijahblake12
 */
public class SortLab {

    public static void run(int arrayLength) {
        Random ran = new Random();
        int[] bubbleArray = new int[arrayLength];
        int[] insertionArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int arrayNumber = ran.nextInt(100);
            bubbleArray[i] = arrayNumber;
            insertionArray[i] = arrayNumber;

        }
        bubbleSort(bubbleArray);
        System.out.println("");
        insertionSort(insertionArray);
        System.out.println("");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] array) {
        printArray(array);
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    printArray(array);
                }

            }
        }
    }

    public static void insertionSort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {

            int temp = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            array[j + 1] = temp;
            printArray(array);
        }
    }

    public static void main(String[] args) {
        run(20);
        run(5);
        run(4);
    }

}
