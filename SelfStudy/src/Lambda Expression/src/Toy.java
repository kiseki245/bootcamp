public class Toy {
    private String name;
    private double price;
    private static int stock = 100;
    private ToyType type;
    public Toy(){

    };
    public Toy(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Toy(String name){
        this.name = name;
    }
    public Toy(String name, double price, ToyType type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public ToyType getType(){ return this.type;}
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " Price: " + this.price + " Type: " + this.type + "\n";
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
