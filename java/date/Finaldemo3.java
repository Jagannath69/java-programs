final class Simple1 {
    public void display( ) {
    System.out.print("\n\n\t BASE CLASS");
    } 
}
class Simple2 extends Simple1{
    public void display( ){
    System.out.print("\n\n\t DERIVED CLASS");
    } 
}
class Finaldemo3 {
    public static void main(String args[ ]){
    Simple2 s=new Simple2( );
    s.display( );
 }
}