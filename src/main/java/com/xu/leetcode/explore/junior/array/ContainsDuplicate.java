package com.xu.leetcode.explore.junior.array;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    /**
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
     */
    public static boolean containsDuplicate(int[] nums) {

        if(nums.length==0 || nums.length==1){
            return false;
        }

        //先对数组进行排序
        Arrays.sort(nums);

        //记录
        int currentValue = nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentValue==nums[i]){
                return true;
            }else{
                currentValue = nums[i];
            }
        }
        return false;
    }
}
