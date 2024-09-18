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

    Balls balls; //draws the simulation to the screen
    Particle_Container container; //controls the particles

    public static void main(String[] args) { //sets up processing
        PApplet.main("com.particle_engine_2.Main");
    }

    //sets up the size of the window
    public void settings()
    {
        size(800, 800);
        //balls = new Balls(this);
        container = new Particle_Container(this);
    }
    
    /*
     * This is the setup function
     * Changes the background color to black.
     */
    public void setup()
    {               
        //balls.setup(); //calls the balls from the class into the main function
    } 

    /*
    * This is the main draw function.
    * Draws everything on the screen.
    */
    public void draw()
    {
        container.draw();
       // balls.draw();
    }

    /*
     * This is the mousePressed method. 
     * When the mouse is pressed, the objects move in the opposite direction.
     */
    public void mousePressed()
    {
       // balls.mousePressed();
    }

    /*
     * This is the mouseDragged method. 
     * When the mouse is dragged, the opacity of the objects all change. 
     */
    public void mouseDragged()
    {
            //balls.mouseDragged();
    }
}