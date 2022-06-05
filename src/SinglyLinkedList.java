class Node {
    public Integer data;
    public Node next;
}

public class SinglyLinkedList {

    public Node start;
    
    public void add(Integer value) {
        Node p = new Node();
        p.data = value;
    }

    public void display() {
        Node s = start;
        System.out.println("Data");

        while(s != null) {
            System.out.println(s.data);
            s = s.next;
        }
    }

    public void delete(Integer value) {
        Node s = start;
        
        while( s.data != value) {
            s = s.next;
        }
        
        Node k = start;
        while( k.next != value) {
            k = k.next;
        }
        k.next = s.next;


    }

}
