package com.vsvdev;


/**
 * Helper class for TrialSuite to maintain information about a trial run.
 *
 */
public class HistPair implements Comparable<HistPair> {
    /** Time of trial to execute (in milliseconds typically). */
    final long time;

    /** Maintain the number of executions of this exact time. Is mutable. */
    int count;

    public HistPair (long time, int count) {
        this.time = time;
        this.count = count;
    }

    /**
     * Return count.
     * @return the number of elements in the {@link HistPair}.
     */
    public int getCount() { return count; }

    /** Increase number of trials with this time. */
    public void addCount() {
        count++;
    }

    /** Reasonable toString method. */
    public String toString () {
        return time + "\t:" + count;
    }

    /** Compare by time only. */
    public int compareTo(HistPair hp) {
        if (time == hp.time) { return 0; }
        if (time < hp.time)  { return -1; }
        return +1;
    }
}
