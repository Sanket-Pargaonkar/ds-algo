package ed.dsalgo.linkedlist;

import ed.dsalgo.linkedlist.impl.SimpleLinkedList;

public class App{
    public static void main(String[] args){
	System.out.println("Hello world");

	SimpleLinkedList sll = new SimpleLinkedList();
	sll.add(3);
	sll.add(4);
	sll.add(5);	
	System.out.println(sll.toString());
	System.out.println(sll.size());	
    }
}
