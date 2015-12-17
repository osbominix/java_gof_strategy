package com.gof.designpattern.strategy;

import com.gof.designpattern.strategy.basis.Planet;

/**
 * Created by yl3 on 17.12.15.
 */
public class GravityFinder {
    private Planet planet;

    public GravityFinder(Planet planet) {
        this.planet = planet;
    }

    public void showPlanetGravity() {
        planet.showGravity();
    }
}
