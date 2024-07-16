public class DemoCharSequence {
    public static void main(String[] args) throws Exception {
        String s = "abc";
        System.out.println(s.length()); //3
        System.out.println(s.replace("c", "a"));
        System.out.println(s); //aba
        CharSequence cs = "abc";
        System.out.println(cs.length()); //3 Polymorphism 
        // Complie-time: the scope of object can be accessed by "cs"

        System.out.println(cs.charAt(1)); //b
        //cs.replace() // error, replace() is not included in CharSequence Interface

        // String s2 = cs; // Complier conerns the type of "cs" only
        // complie time cannot realize the actual object reference by "cs"
        
        //Both parent class and Interface relationship can apply downcasting:
        String s2 = (String) cs;
        System.out.println(cs);
        //during complie-time, we don't guarratee if the casting will be successful 

        // As Java developer, you may use "Instanceof" to ensure the type-safty
        if (cs instanceof String){
            
            s2 = (String) cs;
        }

        System.out.println(s2.replace("a", "c"));
        
        
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.length()); //5
        System.out.println(sb.charAt(1)); //e

        CharSequence cs3 = new StringBuilder("Hello");

        System.out.println(cs3.length());
        System.out.println(cs3.charAt(1));

        System.out.println(sb.reverse());
        // System.out.println(cs3.reverse()); You cannot do that because CharSequence has no this method
        // cs3 is pointing to CharSequence

        // StringBuilder sb2 = (StringBuilder) cs; //Runtime error, cs refer to String object
        // while object reference b2 is StringBuilder
    }
}
