/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 19th, 2024
 * This file inherits the superclass (the particle object) and draws a circle!
 */

package com.particle_engine_2;

import processing.core.PApplet;

public class Circle extends Particle_Object {
    Circle(PApplet main_)
    {
        super(main_, 45, main_.color(main_.random(255),main_.random(255),main_.random(255)), 255);
        super.spawn();
    }


    void draw()
    {
        main.fill(color);
        main.ellipse(x, y, size, size);
        super.move();
    }
}
