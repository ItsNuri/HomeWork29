package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {

        int[] integers = {2, 5, 8, 7, 2, 9, 11, 54, 89, 55, 14, 22, 4, 66, 77};
        stream(integers).filter(x -> x % 2 == 0).map(x -> x * x).max().ifPresent(System.out::println);

    }
}
