package com.zeoblocks.learning.lyambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lyambda {
    public static void main(String[] args) {
        String[] words = { "Hello1","Hello2","Hello3","World4","World"};

        Arrays.sort(words,(first,second) ->first.length() - second.length());
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Git init");

    }
}
