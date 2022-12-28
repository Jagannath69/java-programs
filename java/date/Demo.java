import java.util.*;
interface convert1{
 public void dollar_to_rupee(int d);
}
interface convert2{
 public void euro_to_rupee(int e);
}
interface convert3{
 public void yen_to_rupee(int y);
}
class Currency implements convert1,convert2,convert3{
    public void dollar_to_rupee(int d ){
        double r=81*d;
        System.out.print("\n\n\t" + d + "dollars="+r+" rupees");
}
public void euro_to_rupee(int e ){
        double r=84.18 *e;
        System.out.print("\n\n\t" + e+"euros="+r+" rupees");
}
public void yen_to_rupee(int y){
        double r=0.65*y;
        System.out.print("\n\n\t"+ y+"yen="+r+" rupees");
    }
}
class Demo{
public static void main(String args[ ]) throws Exception{
    int p,ch;
    Scanner sc= new Scanner(System.in);
    Currency c= new Currency( );
    do { 
    System.out.print("\n\n\t-------MENU-------");
    System.out.print("\n\n\t 1......DOLLAR-TO-RUPEES");
    System.out.print("\n\n\t 2......EURO-TO-RUPEES");
    System.out.print("\n\n\t 3.....YEN-TO-RUPEES");
    System.out.print("\n\n\t 4......EXIT");
    System.out.print("\n\n\t ENTER YOUR CHOICE....");
    ch=sc.nextInt( );
    switch(ch){
        case 1:
            System.out.print("\n\n\t ENTER THE NUMBER OF DOLLARS....");
            p=sc.nextInt( );
            c.dollar_to_rupee(p);
            break;
        case 2:
            System.out.print("\n\n\t ENTER THE NUMBER OF EUROS.....");
            p=sc.nextInt( );
            c.euro_to_rupee(p);
            break;
        case 3: 
            System.out.print("\n\n\t ENTER THE NUMBER OF YEN.....");
            p=sc.nextInt( );
            c.yen_to_rupee(p);
            break;
        case 4:
            System.exit(0);
        default:
            System.out.print("\n\n\t INVALID CHOICE....");
        }
    }while(ch>=1 && ch<=3);
    }
}