import java.util.*;
abstract class Shape {
    int x,y;
    abstract public void area( );
}
class Rectangle extends Shape {
    public void accept( ) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE LENGTH OF THE RECTANGLE...");
        x=sc.nextInt( );
        System.out.print("\n\n\t ENTER THE BREADTH OF THE RECTANGLE....");
        y=sc.nextInt( );
    }
    public void area( ) {
        System.out.print("\n\n\t THE AREA OF THE RECTANGLE IS...."+(x*y));
    }
}
class Circle extends Shape {
    public void accept( )throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE RADIUS OF THE CIRCLE...");
        x=sc.nextInt( );
    }
    public void area( ) {
        System.out.print("\n\n\t THE AREA OF CIRCLE IS...."+(3.14*x*x));
    } 
}    
class Shapedemo {
    public static void main(String args[]) throws Exception {
    Rectangle r = new Rectangle( );
    Circle c = new Circle( );
    r.accept( );
    r.area( );
    c.accept( );
    c.area( );
}
}           