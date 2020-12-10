package com.zeoblocks.learning.interfaces;

/**
 * Created with IntelliJ IDEA. 10.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class InterfaceTest {

    public static void main(String[] args) {
        Costable truck = new TruckCar("KAMAZ",200,100);
        Costable sport = new SportCar("Lamb",1000,400);

        System.out.println(truck.costable());
        System.out.println(sport.costable());
    }

}
