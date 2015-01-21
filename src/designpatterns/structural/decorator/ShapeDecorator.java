package designpatterns.structural.decorator;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class ShapeDecorator implements Shape
{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
    }
}
