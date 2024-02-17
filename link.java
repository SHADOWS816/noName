import java.util.*;

class node{
    int data;
    node next;
}

class ll{
    node head = new node();
    void insert(int a){
        node newNode = new node();
        if(head.next == null){
            System.out.println("inserter head");
            head.next = newNode;
            newNode.data = a;
            newNode.next = null;
        }else{
            System.out.println("inserter");
            newNode.next = head.next;
            head.next = newNode;
            newNode.data = a;
        }
    }
    void insert_s(int a,int data){
        node newNode = new node();
        if(head.next == null){
            System.out.println("inserter head");
            head.next = newNode;
            newNode.data = a;
            newNode.next = null;
        }else{
            node curr = new node();
            curr.next = head.next;
            while(curr.next.data != a){
                if(curr.next.data == a){
                    newNode.next = curr.next.next;
                    curr.next.next = newNode;
                    newNode.data = a;
                }
                curr.next =curr.next.next;
            }
        }
    }
    void delete(){
        if(head.next == null){
            System.out.println("undreflow");
            return;
        }else{
            head.next = head.next.next;
        }
    }

    void display(){ 
        node curr = new node();
        curr.next = head.next;  
        while(curr.next != null){
            System.out.println(curr.next.data+ "    ");
            curr.next = curr.next.next;
        }
    }
}

public class link {
    public static void main(String[] args) {
        System.out.println("program to implement LINKED LIST");

        ll l = new ll();
        // l.insert(4);
        // l.insert(5);
        // l.insert(6);
        // l.insert(7);
        l.insert_s(10,6);
        l.insert(8);
        l.display();
        l.delete();
        l.display();
    }
}
