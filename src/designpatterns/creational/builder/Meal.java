package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francesco Bertolino
 */
public class Meal
{

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item)
    {
        items.add(item);
    }

    public float getCost()
    {
        return items.stream().map((item) -> item.price()).reduce(0.0f, (a, b) -> a + b);
    }

    public void showItems()
    {
        items.stream().forEach((item) -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }
}
