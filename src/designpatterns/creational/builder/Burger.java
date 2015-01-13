package designpatterns.creational.builder;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class Burger implements Item
{

    @Override
    public Packing packing()
    {
        return new Wrapper();
    }
}
