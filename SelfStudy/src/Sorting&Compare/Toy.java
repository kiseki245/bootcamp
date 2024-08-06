import java.util.Comparator;
import java.util.Queue;

public class Toy{
    private String name;
    private double price;
    private static int stock = 100;
    public Toy(){

    };
    public Toy(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getBName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " " + "Price: " + this.price;
    }


}
