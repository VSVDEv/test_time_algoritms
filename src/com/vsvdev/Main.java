package com.vsvdev;

public class Main {

    int BASE = 16777216;
 /*
    public static void main(String [] args) {
        int [] ar = {1,4,5,67898,77,99};
        int numTries = 1;
        long begTime = System.currentTimeMillis();
        for (int i = 0; i < numTries; ++i) {
            System.gc();
            quickSort(ar,0,ar.length-1);

        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time for %10d tries: %d ms\n", numTries, (endTime-begTime));
    }

  */

    public static void main(String[] args) {
        int [] ar = {1,4,5,67898,77,99};
        TrialSuite ts = new TrialSuite();
        System.out.println("*******************");
        new Main().testQS(ar);
        System.out.println("*******************");
        for (int m:ar
        ) {
            System.out.println(m);
        }
    }



    private void testQS(int[] ar) {
        System.gc();
        long start = System.currentTimeMillis();
        quickSort(ar,0,ar.length-1);
        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println(result);
    }



        static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }


}
