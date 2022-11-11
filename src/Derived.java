import java.util.*;
class Base {

    public Base(){
        //this(5);
        System.out.println("Calling Default Constructor of Base Class");
    }
    public Base(int x){
        System.out.println("Calling parameterized constructor of Base Class with x equal to " + x);
    }



}
public class Derived extends Base{
    public Derived(){
        this(6);
        System.out.println("Calling Default Constructor of Derived Class");
    }

    public Derived(int x){
        super(5);
        System.out.println("Calling parameterized constructor of Derived Class with x equal to " + x);
    }

    public static void main(String[] args) {
        Derived d=new Derived();
    }

}
