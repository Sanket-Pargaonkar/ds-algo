package ed.dsalgo.linkedlist.demo;

import ed.dsalgo.linkedlist.impl.SimpleLinkedList;
import ed.dsalgo.linkedlist.impl.Node;
import java.util.ArrayList;
import java.util.Hashtable;

public class IntrsectingListsDemo{

    public void demo(){
	    
	ArrayList<SimpleLinkedList> list = createIntersectingListsData();
	printCommonNode(list);

    }

    private void printCommonNode(ArrayList<SimpleLinkedList> list){
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
    }
    private ArrayList<SimpleLinkedList> createIntersectingListsData(){
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
