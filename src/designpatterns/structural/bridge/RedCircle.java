package designpatterns.structural.bridge;

/**
 * Bridge to draw red circles
 * 
 * @author Francesco Bertolino
 */
public class RedCircle implements DrawAPI
{

    @Override
    public void drawCircle(int radius, int x, int y)
    {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
