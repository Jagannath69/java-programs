import java.util.*;
class Primegen {
    public static void main(String args[])throws Exception {
    int n,i,j,fc;
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\n\t ENTER THE VALUE FOR N....");
    n=sc.nextInt();
    System.out.print("\n\n\t THE PRIME NUMBERS BETWEEN 1 AND " + n +" ARE...");
    for(i=1;i<=n;i=i+1) {
        for(j=1,fc=0;j<=i;j=j+1){
            if(i%j==0){
            fc=fc+1;
        }
    }
    if(fc==2) {
        System.out.print(" " +i);
    } 
}
}
}