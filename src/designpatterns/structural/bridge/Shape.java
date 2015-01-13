package designpatterns.structural.bridge;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class Shape
{

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI)
    {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
