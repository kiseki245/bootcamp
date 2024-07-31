public class Node {
    private String name;
    private Node next;
    public Node(String name){
        this.name = name;
    }

    public Node(String name, Node node){
        this.name = name;
        this.next = node;
    }

    public String getName(){
        return this.name;
    }
    public Node getNext() {
        return this.next;
    }

    public Node setNext(Node node){
        this.next = node;
        return node;
    }
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        node1.setNext(node2);
        node2.setNext(new Node("C"));

        Node head = node1;
        while (head != null){
            System.out.println(head.getName());
            head = head.getNext();
        }

    }
}
