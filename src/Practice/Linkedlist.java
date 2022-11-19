package Practice;

public class Linkedlist {
    Node head;
    Node tail;
    int size;
    public Linkedlist(){
        this.size=0;
    }
}
class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
        }
