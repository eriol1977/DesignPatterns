package designpatterns.creational.abstractfactory;

/**
 *
 * @author Francesco Bertolino
 */
public class Red implements Color {

    @Override
    public void fill()
    {
        System.out.println("Inside Red::fill() method.");
    }

}
