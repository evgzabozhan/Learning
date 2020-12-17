package com.zeoblocks.learning.lyambda;

import java.util.Arrays;

public class Lyambda {
    public static void main(String[] args) {
        String[] words = { "Hello1","Hello2","Hello3","World4","World"};

        Arrays.sort(words,(first,second) ->first.length() - second.length());

        System.out.println(words.toString());

    }
}
