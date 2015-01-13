package designpatterns.creational.abstractfactory;

/**
 *
 * @author Francesco Bertolino
 */
public class Green implements Color {

    @Override
    public void fill()
    {
        System.out.println("Inside Green::fill() method.");
    }

}
