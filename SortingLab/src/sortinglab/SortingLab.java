package sortinglab;

import java.util.Random;

/**
 *
 * @author elijahblake12
 */
public class SortingLab {

    public static void sort(int arrayLength) {
        Random ran = new Random();
        int[] bubbleArray = new int[arrayLength];
        int[] insertionArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int arrayNumber = ran.nextInt(100);
            bubbleArray[i] = arrayNumber;
            insertionArray[i] = arrayNumber;

        }

        long bubbleStartTime = System.currentTimeMillis();
        bubbleSort(bubbleArray);
        long bubbleFinishTime = System.currentTimeMillis();
        System.out.println("");
        System.out.println("The time in milliseconds to sort " + arrayLength + " items is " + (bubbleFinishTime - bubbleStartTime) + " with bubble sort");
        System.out.println("");

        long insertionStartTime = System.currentTimeMillis();
        insertionSort(insertionArray);
        long insertionFinishTime = System.currentTimeMillis();
        System.out.println("");
        System.out.println("The time in milliseconds to sort " + arrayLength + " items is " + (insertionFinishTime - insertionStartTime) + " with insertion sort");
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

                }

            }
        }
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        printArray(array);
        for (int i = 0; i < array.length; i++) {

            int temp = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            array[j + 1] = temp;

        }
        printArray(array);
    }

    public static void main(String[] args) {
        sort(20);
        sort(100);
        sort(500);
        sort(1000);
        sort(10000);
    }

}
