package com.bs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = new int[]{6, 3, 5, 2, 4, 1};
        System.out.println("排序前：" + Arrays.toString(array));

        BubbleSort.sort(array);

        System.out.println("排序后：" + Arrays.toString(array));

    }
}
