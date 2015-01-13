package designpatterns.creational.builder;

/**
 *
 * @author Francesco Bertolino
 */
public class Coke extends ColdDrink {

    @Override
    public String name()
    {
        return "Coke";
    }

    @Override
    public float price()
    {
        return 35.0f;
    }

}
