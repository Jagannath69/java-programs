import java.util.*;
class Quadratic {
    public static void main(String args[])throws Exception {
 
     int a,b,c;
    double d,r,r1,r2,p,q,z;
    Scanner sc=new Scanner(System.in);
    System.out.print("\n\n\t ENTER THE COEFFICIENT OF X*X...");
    a=sc.nextInt();
    System.out.print("\n\n\t ENTER THE COEFFICIENT OF X...");
    b=sc.nextInt();
    System.out.print("\n\n\t ENTER THE CONSTANT TERM......");
    c=sc.nextInt();
    d=(b*b)-(4*a*c);
    if(d==0) {
        r=-(b/(2*a));
        System.out.print("\n\n\t THE ROOTS ARE REAL AND EQUAL");
        System.out.print("\n\n\t THE ROOT IS...."+r);
    }
    else if(d>0) {
        p=-(b/(2*a));
        q=(Math.sqrt(d))/(2*a);
        r1=p+q;
        r2=p-q;
        System.out.print("\n\n\t THE ROOTS ARE REAL AND DISTINCT");
        System.out.print("\n\n\t THE ROOTS ARE...."+r1 +"AND"+r2);
    }
    else {
        z=Math.abs(d);
        p=-(b/(2*a));
        q=(Math.sqrt(z))/(2*a);
        System.out.print("\n\n\t THE ROOTS ARE IMAGINARY");
        System.out.print("\n\n\t THE FIRST ROOT IS...."+p+"+"+q+"i");
    System.out.print("\n\n\t THE SECOND ROOT IS..."+p+"-"+q+"i");
    } 
}
}