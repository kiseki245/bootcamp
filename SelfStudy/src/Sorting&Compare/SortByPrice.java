import java.util.Comparator;

public class SortByPrice implements Comparator<Toy> {
    public static SortByPrice of(){
        return new SortByPrice();
    }

    @Override
    public int compare(Toy t1, Toy t2){
        return t1.getPrice() > t2.getPrice() ? -1 : 1;
    }
}
