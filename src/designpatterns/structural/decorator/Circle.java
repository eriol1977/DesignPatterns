package designpatterns.structural.decorator;

/**
 *
 * @author Francesco Bertolino
 */
public class Circle implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Shape: Circle");
    }
}
