package designpatterns.structural.decorator;

/**
 *
 * @author Francesco Bertolino
 */
public class Rectangle implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Shape: Rectangle");
    }
}
