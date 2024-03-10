package com.lentouqin.lettcode2023;

public class Lt1523 {

    public static void main(String[] args) {
        int low =3;
        int high =7;
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        if(low %2 == 1){
            --low;
        }
        if(high %2 == 1){
            ++high;
        }
        return (high-low)/2;
    }
}
