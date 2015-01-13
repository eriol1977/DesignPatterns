package designpatterns.creational.abstractfactory;

/**
 *
 * @author Francesco Bertolino
 */
public class Blue implements Color {

    @Override
    public void fill()
    {
        System.out.println("Inside Blue::fill() method.");
    }

}
