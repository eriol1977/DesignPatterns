package designpatterns.creational.factory;

/**
 *
 * @author Francesco Bertolino
 */
public class Circle implements Shape {

    @Override
    public void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }

}
