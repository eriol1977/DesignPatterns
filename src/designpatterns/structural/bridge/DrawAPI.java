/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.structural.bridge;

/**
 * Works as a bridge, decoupling abstraction Shape from its concrete implementation
 * Circle. This way, both red circles and green circles can be drawn using the 
 * same abstract method draw() offered by the abstraction.
 * 
 * @author Francesco
 */
public interface DrawAPI
{
    void drawCircle(int radius, int x, int y);
}
