package ed.dsalgo.linkedlist;

import ed.dsalgo.linkedlist.impl.SimpleLinkedList;
import ed.dsalgo.linkedlist.impl.Node;
import java.util.ArrayList;
import java.util.Hashtable;
public class App{
    public static void main(String[] args){
	System.out.println("Hello world");
	try{
	ArrayList<SimpleLinkedList>  list = createIntersectingListsData();
	Hashtable<String, Node> ht = new Hashtable<String, Node>();
	Node curr = list.get(0).head;
	int count = 0;
	while(curr!= null){
	    ht.put(String.valueOf(count++),curr);
	    curr = curr.next;
	}

	System.out.println("HT: "+ht.toString());	
	curr = list.get(1).head;
	while(curr!= null){
	    if(ht.containsValue(curr))
		break;
	    curr = curr.next;
	}
	if(curr!= null)
	    System.out.println("Common Node Exists: "+curr.value);
	else
	    System.out.println("Common Node Does nor Exists: ");

	    
	}catch(Exception e){
	    System.out.println(e.toString());
	    System.out.println(e.getMessage());
	}

	
    }
    private static ArrayList<SimpleLinkedList> createIntersectingListsData(){
	ArrayList  list = new ArrayList();
	SimpleLinkedList sll1 = new SimpleLinkedList();
	sll1.add(4);
	sll1.add(1);
	Node intr = sll1.add(8);
	sll1.add(4);
	sll1.add(5);	   	     
	SimpleLinkedList sll2 = new SimpleLinkedList();	    
	sll2.add(5);
	sll2.add(6);	    
	sll2.add(1);
	sll2.add(intr);
	System.out.println(sll1.toString());	    
	System.out.println(sll2.toString());	    
	list.add(sll1);
	list.add(sll2);
	return list;
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
