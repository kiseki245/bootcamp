import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Toy> toylist = new LinkedList<>();
        toylist.add(new Toy("HG Gundam", 123));
        toylist.add(new Toy("MG Gundam", 339));
        toylist.add(new Toy("RG Gundam", 223));

        for (Toy s : toylist){
            System.out.println(s.toString());
        }
        LinkedList<Toy> newToyList = new LinkedList<>();
        newToyList.addAll(toylist);
        newToyList.addFirst(new Toy("FG Gundam", 62));

        for (Toy s : newToyList){
            System.out.println(s.toString());
        }

    }
}
