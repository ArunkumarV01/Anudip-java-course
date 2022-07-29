/*
Author Arunkumar V
Question - find the area of the shape also find the largest among them 
*/



class FindLargestShape
{
    public static void main(String arg[])
    {
     shape. check();
    }    
}

class shape
{
    public static void check()
    {
        Rectangle r = new Rectangle(10.0, 4.0);
        Square s = new Square(7.0);
        Circle c = new Circle(3.5);
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();
        
        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.print("Rectangle");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.print("Square");
        }
        else
        {
            System.out.print("Circle");
        } 
        System.out.println(" has the Largest area  ");
    }      
}



class Rectangle
{
    double length;
    double breadth;

     public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea()
    {
        return length * breadth;
    }
}

class Square
{
    double side;

   public Square(double side)
    {
        this.side = side;
    }

    public double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

     public Circle(double radius)
    {
        this.radius = radius;
    }

     public double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}