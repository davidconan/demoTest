package com.xu.leetcode.explore.junior.array;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int result = removeDuplicates(nums);

        System.out.println(result);
    }

    /**
     * 给定一个排序数组，
     * 在原地删除重复出现的元素，
     * 使得每个元素只出现一次，
     * 返回移除后数组的新长度。
     * @param nums [1,1,2] [0,0,1,1,1,2,2,3,3,4]
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        if(nums.length==0 || nums.length==1){
            return nums.length;
        }

        //记录数组第一个值
        int currentValue = nums[0];
        //记录当前长度,当前长度总在当前值对应的下标的后一个(总是大1)
        int currentLength = 1;

        for(int i=1;i<nums.length;i++){
            //只要当前值与后一个值不等，就把后一个值记在当前位置上
            //当前位置加一,用后一个值作为当前值继续向下比较
            if(currentValue != nums[i]){
                currentValue = nums[i];
                nums[currentLength] = currentValue;
                currentLength++;
            }
        }

        return currentLength;
    }
}
