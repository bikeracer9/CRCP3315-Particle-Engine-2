/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 18th, 2024
 * This file controls the particles!
 */
package com.particle_engine_2;

import processing.core.PApplet;

public class Particle_Container {
    PApplet main; //the main class, which has all the processing functionality.

    //Particle_Object particle;//testing the superclass
    Square square; //testing the square object.
    Rectangle rectangle; //testing the rectangle object

    public Particle_Container(PApplet main_) 
    {
        main = main_;
        //particle = new Particle_Object(main_, 20, main.color(0,255,0));
        //particle.spawn(); //locate is somewhere
        square = new Square(main_);
        rectangle = new Rectangle(main);
    }

    public void draw()
    {
        main.background(0);
        square.display();
        rectangle.display();
    }

    

}
