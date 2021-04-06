package com.vsvdev;

public class Test {


    public static void main(String[] args){


        TrialSuite ts = new TrialSuite();
        for (long len = 8000000; len <= 16000000; len += 2000000) {
            for (int i = 0; i < 30; i++) {
                System.gc();
                long now = System.currentTimeMillis();
/** Хронометрируемая задача. */
                long sum = 0;
                for (int x = 1; x <= len; x++) {
                    sum += x;
                }
                long end = System.currentTimeMillis();

                ts.addTrial(len, now, end);
            }
        }
        System.out.println(ts.computeTable());
    }
}


