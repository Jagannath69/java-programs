import java.util.*;
class Overload {
    public static void main(String args[])throws Exception {
    int s,x,ch;
    float ln,br,y;
    double a,b,c,z;
    Scanner sc=new Scanner(System.in);
    do {
        System.out.print("\n\n\t-----MENU-----");
        System.out.print("\n\n\t 1...AREA OF SQUARE");
        System.out.print("\n\n\t 2...AREA OF RECTANGLE");
        System.out.print("\n\n\t 3...AREA OF TRIANGLE");
        System.out.print("\n\n\t 4...EXIT");
        System.out.print("\n\n\t ENTER YOUR CHOICE...");
        ch=sc.nextInt();
        switch(ch) {
            case 1:
                System.out.print("\n\n\t ENTER THE SIDE OF THE SQUARE...");
                s=sc.nextInt();
                x=area(s);
                System.out.print("\n\n\t THE AREA OF SQUARE IS..."+x);
                break;
            case 2:
                System.out.print("\n\n\t ENTER THE LENGTH OF THE RECTANGLE...");
                ln=sc.nextFloat();
                System.out.print("\n\n\t ENTER THE BREADTH OF THE RECTANGLE...");
                br=sc.nextFloat();
                y=area(ln,br);
                System.out.print("\n\n\t THE AREA OF RECTANGLE IS..."+y);
                break;
            case 3:
                System.out.print("\n\n\t ENTER THE LENGTH OF SIDE-1...");
                a=sc.nextDouble();
                System.out.print("\n\n\t ENTER THE LENGTH OF SIDE-2...");
                b=sc.nextDouble();
                System.out.print("\n\n\t ENTER THE LENGTH OF SIDE-3...");
                c=sc.nextDouble();
                z=area(a,b,c);
                System.out.print("\n\n\t THE AREA OF TRIANGLE IS..."+z);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.print("\n\n\t INVALID CHOICE");
            }
        }while(ch>=1 && ch<=3);
    }
public static int area(int s) {
    int p;
    p=s*s;
    return(p);
}
public static float area(float ln,float br){
    float p;
    p=ln*br;
    return(p);
}
public static double area(double a, double b, double c) {
    double s,p;
    s=(a+b+c)/2;
    p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return(p);
}
}