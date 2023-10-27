package Test;

/**
 * 栈是一种LIFO的结构，last in first out
 * 所以在创建栈的时候我们要让头结点是新来的结点
 */

public class StackList {
    Node first=null;
    public class Node{
        String item;
        Node next;
    }
    public void push(String item){
        //只操作一个指针
        Node old=first;
        first=new Node();
        first.item=item;
        first.next=old;
    }
    public String pop(){
        String item= first.item;
        first=first.next;
        return item;
    }

    public static void main(String[] args) {

    }

}
