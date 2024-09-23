/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 18th, 2024
 * This file controls the particles!
 */
package com.particle_engine_2;

import java.util.ArrayList;

import processing.core.PApplet;

public class Particle_Container {
    PApplet main; //the main class, which has all the processing functionality.

    //Particle_Object particle;//testing the superclass
    //Square square; //testing the square object.
    //Rectangle rectangle; //testing the rectangle object

    ArrayList<Square> Squares;
    int squareCount = 1;

    ArrayList<Rectangle> Rectangles;
    int rectCount = 1;

    ArrayList<Circle> Circles;
    int circleCount = 5;

    public Particle_Container(PApplet main_) 
    {
        main = main_;
        //particle = new Particle_Object(main_, 20, main.color(0,255,0));
        //particle.spawn(); //locate is somewhere
        init();
    }

    public void init()
    {
        //square = new Square(main);
        //rectangle = new Rectangle(main);
        
        Squares = new ArrayList();
        Rectangles = new ArrayList();
        Circles = new ArrayList();

        for(int i = 0; i < squareCount; i++)
        {
            Squares.add( new Square(main) );
            
        }
       
        for(int i = 0; i < rectCount; i++)
        {
            Rectangles.add( new Rectangle(main) );
        }

        for(int i = 0; i < circleCount; i++)
        {
            Circles.add( new Circle(main) );
        }
        

    }

    public void draw()
    {
        main.background(0);
        display();

        // for(int i = 0; i < squareCount; i++)
        // {
        //     Squares.get(i).draw();
        // }

        //square.move();

        // square.spawn();
        // rectangle.spawn();
    }

    public void display()
    {
        for(int i = 0; i < Squares.size(); i++)
        {
            Squares.get(i).draw();
            
        }

        for(int i = 0; i < Rectangles.size(); i++)
        {
            Rectangles.get(i).draw();
        }

        for(int i = 0; i < circleCount; i++)
        {
            Circles.get(i).draw();
        }

    }
    

}
