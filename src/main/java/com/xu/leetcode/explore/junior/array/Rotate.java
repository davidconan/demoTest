package com.xu.leetcode.explore.junior.array;

public class Rotate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

        rotate(nums,2);

    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {

        int length = nums.length;
        //取最小的k
        k = k % length;
        //内循环右移一位,外循环为右移的次数
        for(int j=0;j<k;j++){
            int temp = nums[0];
            nums[0] = nums[length-1];
            for(int i=1;i<length;i++){
                int inTemp = nums[i];
                nums[i] = temp;
                temp = inTemp;
            }
        }
    }

    public static void rotate2(int[] nums,int k){
        /**
         2.翻转法，反序--别人的思路
         */
        int n = nums.length;
        if (k == 0 || nums == null || n == 0 || (k % n) == 0) {
            return;
        }
        //如果是往后移动k步，则说明前n-k个元素都要依次往后移动k步直到数组末尾
        //所以先翻转前n-k个元素，再翻转后k个元素，最后翻转整个数组即为所得
        reverse(nums, 0, n-k%n-1);
        reverse(nums, n-k%n, n-1);
        reverse(nums, 0, n-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        int i = 0;
        while (i < (end - start + 1)/2) {
            int temp = arr[start+i];
            arr[start+i] = arr[end-i];
            arr[end-i] = temp;
            i++;
        }
    }


}
