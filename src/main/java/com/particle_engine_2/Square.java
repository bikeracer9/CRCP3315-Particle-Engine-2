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
        super(main_, 45, main_.color(main_.random(255),main_.random(255),main_.random(255)), 255);
        super.spawn();
    
    }
    
    void setLocation(float x_, float y_)
    {
        x = x_;
        y = y_;
    }

    // void display()
    // {
    //     main.fill(color);
    //     main.rect(x, x, size, size);
    //     move();
    // }

    void draw()
    {
        main.fill(color);
        main.rect(x, y, size, size);
        super.move();
    }

    /*
    void move()
    {
        System.out.println("hello");
        y += yVel; // equation to make the ball move in the Y axis and in the correct direction.
        //x += xVel; // equation to make the ball move in the X axis and in the correct direction.

        if(y > main.height) //if the value of the ball on the Y axis is greater than
        {                   //the bottom of the screen value, then the ball will change directions.
            yVel = yVel * -1;
        }

        if(y < 0) //if the value of the ball on the Y axis is greater than
        {        //the top of the screen value then, the ball will change directions.
            yVel = yVel * -1;
        }

        // if(x > main.height) //if the value of the ball on the X axis is greater than
        // {                   //the bottom of the screen value, then the ball will change directions.
        //     x_direction = -1;
        // }

        // if(x < 0) //if the value of the ball on the X axis is greater than
        // {        //the top of the screen value then, the ball will change directions.
        //     x_direction = 1;
        // }

    }
         */

    // void spawn()
    // {
    //     x = main.random(main.width);
    //     y = main.random(main.height);

    //     xVel = main.random(-1,1);
    //     yVel = main.random(-1,1);

    //     main.fill(color);
    //     main.rect(x, x, size, size);
    // }

    

}
