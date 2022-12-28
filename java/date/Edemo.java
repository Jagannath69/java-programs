import java.util.*;
class Ebill {
    int cno;
    String cname;
    String ctype;
    int pmr,cmr,cu;
    double amt;
public void accept( )throws Exception {
    Scanner sc= new Scanner(System.in);
    System.out.print("\n\n\t ENTER THE CONSUMER NUMBER...");
    cno=sc.nextInt( );
    System.out.print("\n\n\t ENTER THE CONSUMER NAME......");
    cname=sc.next( );
    System.out.print("\n\n\t ENTER THE CONSUMER TYPE(DOMESTIC OR COMMERCIAL).......");
    ctype=sc.next( );
    System.out.print("\n\n\t ENTER THE PREVIOUS METER READING....");
    pmr=sc.nextInt( );
    System.out.print("\n\n\t ENTER THE CURRENT METER READING....");
    cmr=sc.nextInt( );
}
public void display( ){
    System.out.print("\n\n\t---------------------------------------------------------------");
    System.out.print("\n\n\t CONSUMER NO--------"+cno);
    System.out.print("\n\n\tCONSUMER NAME----"+cname);
    System.out.print("\n\n\tCONSUMER TYPE-----"+ctype);
    System.out.print("\n\n\t PREVIOUS METER READING-----"+pmr);
    System.out.print("\n\n\t CURRENT METER READING-----"+cmr);
    System.out.print("\n\n\t NO OF UNITS CONSUMED--------"+cu);
    System.out.print("\n\n\t TOTAL AMOUNT----------------------"+amt);
    System.out.print("\n\n\t---------------------------------------------------------------");
}
public void compute( ){
    cu=cmr-pmr;
    if(ctype.equals("DOMESTIC")){
        if(cu<=100){
            amt=cu*1.00;
        }
        else if(cu>100 && cu<=200){
            amt=(100*1.00)+(cu-100)*2.50;
        }
        else if(cu>200 && cu<=500){
            amt=(100*1.00)+(100*2.50)+(cu-200)*4.00;
        }
        else {
            amt=(100*1.00)+(100*2.50)+(200*4.00)+(cu-500)*6;
        }
    }
    else if(ctype.equals("COMMERCIAL")) {
        if(cu<=100){
            amt=cu*2.00;
        }
        else if(cu>100 && cu<=200){
            amt=(100*2.00)+(cu-100)*4.50;
        }
        else if(cu>200 && cu<=500){
            amt=(100*2.00)+(100*4.50)+(cu-200)*6.00;
        }
        else{
            amt=(100*2.00)+(100*4.50)+(200*6.00)+(cu-500)*7;
        } 
    }
    else {
        System.out.print("\n\n\t INVALID CONSUMER TYPE");
    }
}
}
class Edemo {
    public static void main(String args[ ])throws Exception{
    Ebill eb=new Ebill( );
    eb.accept( );
    eb.compute( );
    eb.display( );
    } 
}