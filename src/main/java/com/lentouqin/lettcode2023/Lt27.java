package com.lentouqin.lettcode2023;

public class Lt27 {
    public static void main(String[] args) {
        int[] num = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(num, val));
    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            while (fast < nums.length && nums[fast] == val) {
                fast++;
            }
            if(fast == nums.length){
                nums[slow] = 0;
                nums[nums.length-1] = 0;
                break;
            }
            nums[slow] = nums[fast];
            fast++;
            slow++;
        }
        return slow;
    }
}
