/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 19th, 2024
 * This file inherits the superclass (the particle object) and draws a rectangle with a ellipse inside of it!
 */

 package com.particle_engine_2; //change to be a combination of a shape!

 import processing.core.PApplet;
 
 public class Rectangle extends Particle_Object {
     
    Rectangle(PApplet main_)
     {
         super(main_, 45, main_.color(main_.random(255),main_.random(255),main_.random(255)), 255);
         
         super.spawn();
        //  x = main.random(main.width);
        //  y = main.random(main.width);
     }
     
     void setLocation(float x_, float y_)
     {
         x = x_;
         y = y_;
     }
 
    //  void display()
    //  {
    //      main.fill(color);
    //      main.rect(x, x, size*2, size);
    //  }

     void draw()
     {
        
        main.rectMode(3);
        main.fill(color);
        main.rect(x, y, size*2, size);
        main.ellipse(x, y, size*1/2, size*2);
        super.move();
     }

    //  void spawn()
    // {
    //     x = main.random(main.width);
    //     y = main.random(main.height);

    //     xVel = main.random(-1,1);
    //     yVel = main.random(-1,1);

    //     main.fill(color);
    //     main.rect(x, x, size*2, size);
    // }
 
 }
 