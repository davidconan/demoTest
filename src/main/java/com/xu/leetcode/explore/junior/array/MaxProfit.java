package com.xu.leetcode.explore.junior.array;

public class MaxProfit {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int sum = maxProfit(prices);

        System.out.println(sum);
    }

    /**
     *
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * [7,1,5,3,6,4]
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {

        //记录数组长度
        int length = prices.length;

        if(length<2){
            return 0;
        }

        //记录收益
        int sum = 0;

        //记录当前股价值
        int currentValue = prices[0];

        //遍历
        for(int i=1;i<length;i++){
            //如果第二天的值高于今天的,计算两者差,累加到总和上
            if(currentValue<prices[i]){
                sum += prices[i] - currentValue;
            }
            //将当前值记为后一天的值
            currentValue = prices[i];
        }

        return sum;
    }
}
