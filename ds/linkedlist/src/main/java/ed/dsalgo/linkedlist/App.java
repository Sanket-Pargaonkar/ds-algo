package ed.dsalgo.linkedlist;

import ed.dsalgo.linkedlist.demo.IntrsectingListsDemo;

public class App{
    public static void main(String[] args){
	System.out.println("Hello world");
	try{
	    IntrsectingListsDemo demo = new IntrsectingListsDemo();
	    demo.demo();
	    
	}catch(Exception e){
	    System.out.println(e.toString());
	    System.out.println(e.getMessage());
	}

	
    }


}



//sll testing

	    // sll.add(1);
	    // sll.addLast(20);
	    // sll.add(2);
	    // sll.add(3);
	    // sll.add(17,0);
	    // sll.addFirst(5);
	    // sll.addLast(9);
	    // System.out.println(sll.toString());	    
	    // sll.remove(0);
	    // System.out.println(sll.toString());
	    // sll.remove(2);
	    // System.out.println(sll.toString());
	    // sll.remove(3);
	    // System.out.println(sll.toString());	    
	    // sll.removeFirst();
	    // System.out.println(sll.toString());	    
	    // sll.removeLast();
