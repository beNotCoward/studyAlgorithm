package com.lentouqin.od2023;

import java.io.IOException;
import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){

            System.out.println(get(sc.nextInt()));
        }

    }

    public static int get(int sum){
        int count =0;
        while (sum != 0){
            if((sum & 1) == 1){
                count++;
            }
            sum >>>= 1;
        }
        return count;

    }
}
