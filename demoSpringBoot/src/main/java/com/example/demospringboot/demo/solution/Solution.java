package com.example.demospringboot.demo.solution;

import java.util.HashMap;

public class Solution {
    // 1、两数之和
    public int[] twoSum(int[] nums, int target){
        int count = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < count; i++) {
            int diff = target-nums[i];
            if (hashMap.containsKey(diff)){
                System.out.println(hashMap.get(diff));
                System.out.println(i);
                return new int[]{hashMap.get(diff),i};
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }
    //2.

}
