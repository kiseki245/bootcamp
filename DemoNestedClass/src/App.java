public class App {
    public static void main(String[] args) throws Exception {
        // Bank.Account ba = new Bank.Account();

        
        // Inner class (non-static)
        
        
        
        // Box.Ball ball = new Box().new Ball();
        Box box = new Box();
        Box.Ball ball = box.new Ball();
        box.add(ball);
        System.out.println(box.getBall().size()); //1


        //Annoymous Inner Class
        int x = 2;
        if (x == 3){
        Swim persons = new Swim(){
            @Override
            public void swimable(){
                System.out.println();
            }
        
        };
    } else {
        Swim sally = new Swim() {
            private String name = "Sally";
            public String getName(){
                return this.name; // You cannot call it
            }
            
            @Override
            public void swimable(){
                System.out.println("Sally is swimming...");
            }
        };
    
        sally.swimable();
        // sally.getName(); Since the interface Swim has no getName() method so we cannot call it
    }
    }
}
