package designpatterns.creational.builder;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class ColdDrink implements Item
{

    @Override
    public Packing packing()
    {
        return new Bottle();
    }
}
