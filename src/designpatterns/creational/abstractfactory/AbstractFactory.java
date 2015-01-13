package designpatterns.creational.abstractfactory;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class AbstractFactory
{

    abstract Color getColor(final String color);

    abstract Shape getShape(final String shape);
}
