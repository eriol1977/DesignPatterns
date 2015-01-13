package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Francesco Bertolino
 */
public class ShapeCache
{

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
