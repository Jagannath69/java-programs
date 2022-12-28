import java.util.*;
class Matrixmul {
    public static void main(String args[])throws Exception {
    int m,n,p,q,i,j,k,a[][],b[][],c[][];
    Scanner sc= new Scanner(System.in);
    System.out.print("\n\n\t ENTER THE NUMBER OF ROWS IN THE FIRST MATRIX...");
    m=sc.nextInt();
    System.out.print("\n\n\t ENTER THE NUMBER OF COLUMNS IN THE FIRST MATRIX...");
    n=sc.nextInt();
    System.out.print("\n\n\t ENTER THE NUMBER OF ROWS IN THE SECOND MATRIX...");
    p=sc.nextInt(); 
    System.out.print("\n\n\t ENTER THE NUMBER OF COLUMNS IN THE SECOND MATRIX...");
    q=sc.nextInt();
    a=new int[m][n];
    b=new int[p][q];
    c=new int[m][q];
    if(n==p) {
        System.out.print("\n\n\t ENTER THE ELEMENTS OF THE FIRST MATRIX...");
        for(i=0;i<m;i=i+1) {
            for(j=0;j<n;j=j+1) {
                System.out.print("\n\n\t ENTER THE ELEMENT-a["+i+"]["+j+"]...");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n\n\t ENTER THE ELEMENTS OF THE SECOND MATRIX...");
        for(i=0;i<p;i=i+1) {
            for(j=0;j<q;j=j+1) {
                System.out.print("\n\n\t ENTER THE ELEMENT-b["+i+"]["+j+"]...");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n\n\t THE ELEMENTS OF THE FIRST MATRIX ARE...\n");
        for(i=0;i<m;i=i+1) {
            for(j=0;j<n;j=j+1){
                System.out.print(" "+a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\t THE ELEMENTS OF THE SECOND MATRIX ARE...\n");
        for(i=0;i<p;i=i+1) {
            for(j=0;j<n;j=j+1){
                System.out.print(" "+b[i][j]);
            }
            System.out.print("\n");
        }
        for(i=0;i<m;i=i+1){
            for(j=0;j<q;j=j+1) {
                c[i][j]=0;
            }
        }
        for(i=0;i<m;i=i+1) {
            for(j=0;j<q;j=j+1){
                for(k=0;k<n;k=k+1){
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.print("\n\n\t THE PRODUCT OF TWO MATRICES IS...\n");
        for(i=0;i<m;i=i+1){
            for(j=0;j<q;j=j+1) {
                System.out.print(" "+c[i][j]);
            }
            System.out.print("\n");
        }
    }
    else {
        System.out.print("\n\n\t MATRIX MULTIPLICATION IS NOT POSSIBLE DUE TO DIMENSIONS");
    } 
}
}