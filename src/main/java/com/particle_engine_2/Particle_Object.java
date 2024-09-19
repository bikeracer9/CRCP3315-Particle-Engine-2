/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 18th, 2024
 * This file is Superclass for all the particle objects.
 */

package com.particle_engine_2;

import processing.core.PApplet;

public class Particle_Object {
    PApplet main; //processing functionality

    float x,y; //location
    int color; //color of the Particle Object
    float xVel, yVel; //velocity of the Particle Object
    float size; //size of the Particle Object
    boolean hit; // if the Particle Object is hit

    //initializes everything
    Particle_Object(PApplet main_, float size_, int color_)
    {
        main = main_;
        size = size_;
        color = color_;
    }

    
    //displays all the particle objects
    // void display()
    // {
    //     main.fill(color);
    //     main.ellipse(x, x, size, size);
    // }

    //checks to see if there was a collision
    boolean collision(Particle_Object particle)
    {
        float distance = PApplet.dist(x,y, particle.getX(), particle.getY());
        return (distance < (size/2 + particle.getSize()/2));
    }

    void spawn()
    {
        x = main.random(main.width);
        y = main.random(main.height);

        xVel = main.random(-10,10);
        yVel = main.random(-10,10);
    }

    float getX()
    {
        return x;
    }

    float getY()
    {
        return y;
    }

    float getSize()
    {
        return size;
    }
}
