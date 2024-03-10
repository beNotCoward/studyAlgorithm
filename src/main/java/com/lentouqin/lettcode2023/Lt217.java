package com.lentouqin.lettcode2023;

import java.util.stream.IntStream;

public class Lt217 {

    public boolean containsDuplicate(int[] nums) {
       return IntStream.of(nums).distinct().count() != nums.length;
    }
}
