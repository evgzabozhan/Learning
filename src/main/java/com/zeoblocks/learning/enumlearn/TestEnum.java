package com.zeoblocks.learning.enumlearn;

/**
 * Created with IntelliJ IDEA. 08.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This class for testing enums values
 */
public class TestEnum {
    public static void main(String[] args) {
        Values[] values = Values.values();
        for (Values value : values){
            System.out.println(value.toString() + " " + value.ordinal());
        }
    }
}
