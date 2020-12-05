package com.zeoblocks.learning.howtousestaticimport;

/**
 * Created with IntelliJ IDEA. 05.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */

import static java.lang.Math.sqrt;

public class StaticImport {

    public static void main(String[] args) {
        double res = StaticImport.sumWithSquare(10,15);
        System.out.println(res);
    }

    private static double sumWithSquare(final int a, final int b){
        return sqrt(a) + sqrt(b);

    }
}
