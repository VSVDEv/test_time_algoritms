package com.vsvdev;

import java.util.HashMap;

public class TestTask {

    public static int[] twoSum(int[] nums, int target) {
        for(int i =0;i< nums.length; i++ ){
            int first =nums[i];
            if(first< target){
                int second = target - first;
                for(int j =i+1;j< nums.length; j++){
                    if(second == nums[j]){
                        return new int[]{first, nums[j]};
                    }
                }
            }

        }
        return new int[]{0};
    }

    public static int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> num_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[]{num_map.get(complement), i};
            }
            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }



    public static void main(String [] args) {
        int [] ar = {1,4,8,5,67898,77,99,3,7,2,9};
        int numTries = 1;
        long begTime = System.currentTimeMillis();
        for (int i = 0; i < numTries; ++i) {
            System.gc();
       // twoSum(ar,10);
        twoSumHash(ar,10);

        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time for %10d tries: %d ms\n", numTries, (endTime-begTime));
    }

}
