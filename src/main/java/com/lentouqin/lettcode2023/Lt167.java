package com.lentouqin.lettcode2023;

public class Lt167 {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int[] num1 = {-3,-2,-1,1};
        int target = 9;
        int target1 = 1;
        twoSum(num,target);
        twoSum(num1,target1);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if(sum < target){
                ++low;
            } else {
                --high;
            }

        }
        return new int[]{-1,-1};
    }
}
