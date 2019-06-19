package com.internship.model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Array {

    private int[] array;
    private int numberOfOperations;
    private long sortTime;

    Array(int size, boolean shuffle) {
        array = new int[size];
        generateArray(size, shuffle);
        sortTime = 0;
        numberOfOperations = 0;
    }

    public static Array createNewArray(int size, boolean shuffle){
        return new Array(size, shuffle);
    }

    private int[] generateArray(int size, boolean shuffle){
        fillArray();
        if(shuffle) shuffleArray();
        return array;
    }

    private void fillArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println("Array filled in");
        printArray();
    }

    private void shuffleArray(){
        Random rnd = ThreadLocalRandom.current();

        for (int i = array.length-1; i > 0; i--) {
            //nextInt return rnd int from 0 (incl) to bound (excl).
            int index = rnd.nextInt(i + 1);
            swap(index, i);
        }
        System.out.println("Array shuffled");
        printArray();
    }

    /**
     *
     * @return long array where [0] = numberOfOperation along sorting and [1] = sort time in millis
     */

    public long[] sort (){
        printArray();
        System.out.println("Start sorting ... \n");
        numberOfOperations = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            for (int n = 0; n < array.length - (1 + i); n++) {
                if (array[n] < array[n + 1]) {
                    swap(n, n + 1);
                }
                if(array.length < 50) printArray();
                numberOfOperations++;
            }
        }
        sortTime = System.currentTimeMillis() - startTime;
        System.out.println("\nAfter sort ...");
        printArray();

        return new long[] {numberOfOperations, sortTime};
    }

    public void printArray(){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void swap(int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public int[] getArray() {
        return array;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }

    public long getSortTime() {
        return sortTime;
    }
}
