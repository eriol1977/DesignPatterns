package designpatterns.creational.prototype;

/**
 *
 * @author Francesco Bertolino
 */
public abstract class Shape implements Cloneable
{

    private String id;
    protected String type;

    abstract void draw();

    public String getType()
    {
        return type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
