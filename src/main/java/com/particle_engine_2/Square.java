/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 19th, 2024
 * This file inherits the superclass (the particle object) and draws a square!
 */

package com.particle_engine_2;

import processing.core.PApplet;

public class Square extends Particle_Object {
    Square(PApplet main_)
    {
        super(main_, 45, main_.color(main_.random(255),main_.random(255),main_.random(255)));
        x = main.random(main.width);
        y = main.random(main.width);
    }
    
    void setLocation(float x_, float y_)
    {
        x = x_;
        y = y_;
    }

    void display()
    {
        main.fill(color);
        main.rect(x, x, size, size);
    }

}
