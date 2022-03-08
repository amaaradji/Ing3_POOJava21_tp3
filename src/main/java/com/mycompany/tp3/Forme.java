/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author amaaradji
 */
public abstract class Forme implements Comparable<Forme>{
    double x, y;
    abstract double getSurface();

    @Override
    public int compareTo(Forme other) {
        if(this.getSurface() == other.getSurface())
            return 0;    
        else if (this.getSurface() > other.getSurface())
            return 1;    
        else    
            return -1;    
    }

    public double getDistanceOrigine() {
        return Math.sqrt( x*x + y*y );
    }
    
}

