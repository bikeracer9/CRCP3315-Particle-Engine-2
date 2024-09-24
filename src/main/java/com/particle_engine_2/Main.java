/*
 * Prescott Lau
 * Particle Engine 2 Assignment
 * September 18th, 2024
 * This project uses OOP & Inheritance to create a particle engine.
 * This is the Main file.
 */

package com.particle_engine_2;

import processing.core.PApplet;


public class Main extends PApplet {

    Particle_Container container; //controls the particles

    public static void main(String[] args) { //sets up processing
        PApplet.main("com.particle_engine_2.Main");
    }

    //sets up the size of the window
    public void settings()
    {
        size(800, 800);
        container = new Particle_Container(this);
    }
    
    /*
     * This is the setup function
     */
    public void setup()
    {               
        
    } 

    /*
    * This is the main draw function.
    * Draws everything on the screen.
    */
    public void draw()
    {
        container.draw();
    }

    /*
     * This is the mousePressed method. 
     * When the mouse is pressed, the objects move in the opposite direction.
     */
    public void mousePressed()
    {
       container.mousePressed();
    }
}