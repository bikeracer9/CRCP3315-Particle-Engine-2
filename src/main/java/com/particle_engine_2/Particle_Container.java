/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 18th, 2024
 * This project controls the particles!
 */
package com.particle_engine_2;

import processing.core.PApplet;

public class Particle_Container {
    PApplet main; //the main class, which has all the processing functionality.

    public Particle_Container(PApplet main_) 
    {
        main = main_;
    }

    public void draw()
    {
        main.background(0);
    }

    

}
