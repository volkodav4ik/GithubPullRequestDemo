package com.company;

import java.util.*;

public class Main {
    private static final int SOME_NUMBER = 1000;
    private static final int MIN_VALUE = 200;
    private static final int MAX_VALUE = 400;

    public static void main(String[] args) {

        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < SOME_NUMBER; i++) {
            list.add(Integer.toString(random.nextInt(SOME_NUMBER)));
        }

        int[] array = list.stream()
                .mapToInt(Integer::parseInt)
                .filter((i) -> (i >= MIN_VALUE && i <= MAX_VALUE))
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(array));
    }

}
