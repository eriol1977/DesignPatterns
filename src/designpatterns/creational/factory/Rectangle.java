package designpatterns.creational.factory;

/**
 *
 * @author Francesco Bertolino
 */
public class Rectangle implements Shape {

    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
