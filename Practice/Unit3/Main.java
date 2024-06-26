package Unit3;

abstract class Shape
{
    protected int dimension1;
    protected int dimension2;

    public Shape(int dimension1,int dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape
{
    public Rectangle(int length,int width)
    {
        super(length,width);
    }

    @Override
    public void printArea() 
    {
        int area = dimension1*dimension2;
        System.out.println("Area of rectangle: "+area);
    }
}

class Triangle extends Shape
{
    public Triangle(int base,int height)
    {
        super(base,height);
    }

    @Override
    public void printArea()
    {
        double area = 0.5*dimension1*dimension2;
        System.out.println("Area of Triangle: "+area);
    }
}

class Circle extends Shape
{
    public Circle(int radius)
    {
        super(radius,radius);
    }

    @Override
    public void printArea()
    {
        double area = Math.PI*dimension1*dimension2;
        System.out.println("Area of Circle: "+area);
    }
    
}

public class Main {
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(5, 2);
        Triangle t =new Triangle(2, 5);
        Circle c =new Circle(1);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
