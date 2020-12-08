package com.zeoblocks.learning.methods;

/**
 * Created with IntelliJ IDEA. 08.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.sum(1D,2D,3D,4D,5D,6D,7D));
    }

    private Double sum(Double ... args){
        Double result = 0D;
        for (Double arg : args){
            result+=arg;
        }
        return result;
    }
}
