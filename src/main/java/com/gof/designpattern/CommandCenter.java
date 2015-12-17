package com.gof.designpattern;

import com.gof.designpattern.strategy.GravityFinder;
import com.gof.designpattern.strategy.basis.Earth;
import com.gof.designpattern.strategy.basis.Mars;
import com.gof.designpattern.strategy.basis.Moon;

/**
 * Created by yl3 on 17.12.15.
 */
public class CommandCenter {

    public static void main(String[] args) {
        Earth earth = new Earth();
        Moon moon = new Moon();
        Mars mars = new Mars();

        GravityFinder earthGravityFinder = new GravityFinder(earth);
        GravityFinder moonGravityFinder = new GravityFinder(moon);
        GravityFinder marsGravityFinder = new GravityFinder(mars);

        earthGravityFinder.showPlanetGravity();
        moonGravityFinder.showPlanetGravity();
        marsGravityFinder.showPlanetGravity();

    }
}
