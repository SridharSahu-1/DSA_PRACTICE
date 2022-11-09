package Recursion;

public class LinkedList {
    Node head;
    Node tail;
    int size;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

    public void add(int data){
        Node node=new Node(data);


    }
    public void addFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void addLast(int data){
        if(tail==null){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next=node;
        tail=node;
        size++;
    }
    public void add(int val, int index){
        if(index==0){
            addFirst(val);
        }

    }
    public void display(){
    while(head!=null){
        System.out.println(head.data);
        head=head.next;
    }
    }
//    public boolean ispalindrone(Node node){
//
//    }
}
