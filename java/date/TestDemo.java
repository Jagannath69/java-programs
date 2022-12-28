import java.util.*;
class Student {
    int rollno;
    String name;
    public void accept_details( )throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE ROLLNO....");
        rollno=sc.nextInt( );
        System.out.print("\n\n\t ENTER THE NAME.......");
        name=sc.next( );
    }
    public void display_details( ) {
    System.out.print("\n\n\t ROLLNO IS....."+rollno);
    System.out.print("\n\n\t NAME IS........."+name);
    } 
}
class Test extends Student {
    int m,p,c;
    public void accept_marks( )throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\n\t ENTER THE MARKS IN MATHS.....");
        m=sc.nextInt( );
        System.out.print("\n\n\t ENTER THE MARKS IN PHYSICS....");
        p=sc.nextInt( );
        System.out.print("\n\n\t ENTER THE MARKS IN CHEMISTRY....");
        c=sc.nextInt( );
    }
    public void display_marks( )throws Exception {
        System.out.print("\n\n\t MARKS IN MATHS......"+m);
        System.out.print("\n\n\t MARKS IN PHYSICS...."+p);
        System.out.print("\n\n\t MARKS IN CHEMISTRY...."+c);
    } 
}
class TestDemo {
    public static void main(String args[ ])throws Exception {
        Test t= new Test( );
        t.accept_details( );
        t.accept_marks( );
        t.display_details( );
        t.display_marks( );
    }
}