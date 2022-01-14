package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        Integer[] arrA = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] arrB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        List<Integer> tempA = new ArrayList<Integer>(Arrays.asList(arrA));
        List<Integer> tempB = new ArrayList<Integer>(Arrays.asList(arrB));
        tempA.removeIf(x -> tempB.contains(x));

        int[] arr = new int[tempA.size()];

        for (int i = 0; i < tempA.size(); i++) {
            arr[i] = tempA.get(i);
        }

        return arr;
    }
}





