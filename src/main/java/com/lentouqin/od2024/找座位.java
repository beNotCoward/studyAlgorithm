package com.lentouqin.od2024;

/**
 * it is still a beautiful world
 *
 * @author by hothead
 * @date 2024/3/21.
 */
public class 找座位 {
    public static void main(String[] args) {
  /*      Scanner sc = new Scanner(System.in);
        int res = 0;

        String inStr = sc.nextLine();*/
        int[] seats = {1, 0, 0, 1, 0, 1};
        System.out.println(maxAdditionalSeats(seats));
    }

    public static int maxAdditionalSeats(int[] seats) {
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            // 从前往后遍历
            if (seats[i] == 0) {  // 如果有空位
                // 空位左边是否也是空位
                boolean left = i == 0 || seats[i - 1] == 0;
                // 右边也是空位
                boolean right = i == seats.length - 1 || seats[i + 1] == 0;

                // 两者都满足
                if (left && right) {
                    res++;
                    seats[i] = 0;  // 坐一个人
                    i++;
                }
            }
        }
        return res;
    }
}
