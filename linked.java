import java.util.*;
public class linked{
    Node head;
    Node temp;
    Node newNode;
    class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public void create(int x){
    Node newNode=new Node(x);
    if(head==null){
        head=temp=newNode;
        return;
    }
    else{
        temp.next=newNode;
        temp=newNode;
    }
        
}
public void addfirst(int x){
    Node newNode=new Node(x);
    newNode.next=head;
    head=newNode;
}
public void addlast(int x){
    Node newNode=new Node(x);
    temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
}
public void addpos(int pos ,int x){
    int i=1;
    temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        Node newNode=new Node(x);
        newNode.next=temp.next;
        temp.next=newNode;
}

public void printlist(){
    System.out.println("Your linked list is ");
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    temp=head;
    while(temp!=null){
        System.out.print(temp.data +"->");
        temp=temp.next;
    }
    System.out.println("Null");
}
public static void main(String [] args){
    linked list=new linked();
    list.create(2);
    list.create(3);
    list.create(4);
    list.addfirst(1);
    list.addlast(5);
    list.printlist();
    list.addpos(2,4);
    list.printlist();
}
}