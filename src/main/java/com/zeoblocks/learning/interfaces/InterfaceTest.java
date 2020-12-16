package com.zeoblocks.learning.interfaces;

import com.zeoblocks.learning.interfaces.timer.SuperCar;

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
        Costable superCar = new SuperCar("Lamb",10000,4000);
        System.out.println(sport.cost());

        System.out.println(truck.costable());
        System.out.println(sport.costable());
        System.out.println(superCar.costable());
    }

}
