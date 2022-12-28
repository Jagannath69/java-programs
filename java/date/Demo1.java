import java.util.*;
interface shape {
    public void accept( );
    public void area( );
}
class Square implements shape {
    int s;
    public void accept( ) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE SIDE OF THE SQUARE...");
        s=sc.nextInt( );
}
public void area( ) {
        System.out.print("\n\n\t THE AREA OF THE SQUARE IS..."+(s*s));
    }
}
class Rectangle implements shape
{
    int l,b;
    public void accept( ) {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE LENEGTH OF THE RECTANGLE....");
        l=sc.nextInt( );
        System.out.print("\n\n\t ENTER THE BREADTH OFTHE RECTANGLE....");
        b=sc.nextInt( );
    }
    public void area( ) {
        System.out.print("\n\n\t THE AREA OF THE RECTANGLE IS...."+(l*b));
    }
}
class Demo1 {
    public static void main(String args[])throws Exception {
        shape sh;
        Square x=new Square( );
        Rectangle y=new Rectangle( );
        sh=x;
        sh.accept( );
        sh.area( );
        sh=y;
        sh.accept( );
        sh.area( );
    }
}