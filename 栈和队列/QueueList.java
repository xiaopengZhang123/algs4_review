package Test;

public class QueueList {
    int sz=0;
    public class Node{
        Node next;
        int val;
    }
    private Node first,last;
    public void push(int val){
        Node old=last;
        last=new Node();
        last.next=null;
        last.val=val;
        if(isEmpty()){
            first=last;
        }else{
            old.next=last;
        }
        sz++;
    }
    boolean isEmpty(){
        return sz==0;
    }
}
