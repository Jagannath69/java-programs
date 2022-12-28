import java.util.*;
class Person {
    public void display() {
    System.out.print("\n\n\t PERSON");
    }   
}
class Doctor extends Person {
    public void display(){
        System.out.print("\n\n\t DOCTOR");
    }
}
class Override {
    public static void main(String args[]) {
        Person p=new Person();
        Doctor d=new Doctor();
        p.display();
        d.display();
    }
}