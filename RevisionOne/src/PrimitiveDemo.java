public class PrimitiveDemo {
    public static void main(String[] args) throws Exception {
        //premitive
        int x = 10; // let hand side x -> variable, right habd sude 10 - > int value
        //compilar check if 10 can be assigned to x

        long l = x; // long range is higher than int value (Promotion / Overflow / Upcast)
        short s = x; // short range is lower than int type (Downcast)

        // As a developer. you design to adopt the risk of precision loss 
        // Compiler doesn't concern the value assigned to x during compile time
        // Instead, it concerns the "range" of type only

        // Ascii
        int y = 100;
        char c = (char) y; //downcasting
        int z = c;


        long l2;
        // System.out.println(l2);


    float f = 0.3f; // we need to use f after 0.3 because 0.3 is a double value by default

    byte b = 9; // Java still allow int value assugned to byte & shsort type;
    double d2 = 9.3d;
    
        
    }
}
