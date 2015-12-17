package com.gof.designpattern.strategy.basis;

/**
 * Created by yl3 on 17.12.15.
 */
public class Earth implements Planet {
    public void showGravity() {
        System.out.println("Gravity of earth is 9.81 m/s2");
    }
}
