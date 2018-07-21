package com.xu.leetcode.explore.junior.array;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {1,2,1};

        int result = singleNumber(nums);

        System.out.println(result);
    }

    /**
     * 这个方法不限重复数字的个数,不限制是两个
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {

        //长度为1则直接返回
        if(nums.length==1){
            return nums[0];
        }

        //外层循坏取每个数比较
        label:for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                //内层循环取除了外层循环取出来的数比较
                if(j==i){
                    continue;
                }
                if(nums[i]==nums[j]){
                    //如果相等就找下一个
                    continue label;
                }
            }
            return nums[i];
        }

        return 0;
    }

    /**
     * 重复数字有且只为两个的时候可以用这个方法
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums){

        Arrays.sort(nums);

        //若果当前数字与后一个相等,取后面第二个继续向下比较
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                i++;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
