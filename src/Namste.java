import java.util.*;
public class Namste {

    public Namste(){
        this("sohan");
        System.out.println("The Default constructor says Namaste");

    }

    public Namste(String x){
        this("Sohan","Patil");
        System.out.println("Namaste from " + x);
    }

    public Namste(String x,String y){
        System.out.println("Namaste from " + x + " to " + y);
    }

    public static void main(String[] args) {
        Namste n=new Namste();
    }
}
