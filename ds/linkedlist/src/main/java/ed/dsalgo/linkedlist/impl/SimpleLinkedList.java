package ed.dsalgo.linkedlist.impl;

import java.lang.StringBuilder;

public class SimpleLinkedList{
    public Node head;
    public Node tail;
    public SimpleLinkedList(){

    }

    public SimpleLinkedList(int val){
	Node head = new Node(val, null);
	this.head = head;
	tail = head;	
    }

    ///traverse list:
    ///print list
    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	if(head != null){
	    Node curr = head;
	    while(curr != null){
	        sb.append(String.valueOf(curr.value));
		if(curr.next != null )
		{
		    sb.append(", ");
		}
		curr = curr.next;		
	    }
	}
	return sb.toString();
    }
    ///size of list
    public int size(){
	if(head == null)
	    return 0;
	int count = 0;
	Node curr = head;
	 
	while(curr != null) {
	    count++;
	    curr = curr.next;
	}
       return count;
    }
    
    ///add nodes
    public void add(int val){
	Node _new = new Node(val, null);
	if(head == null){
	    head = _new;
	}
	else if(head.next == null){
	    head.next = _new;
	}
	else 
	    tail.next = _new;
	tail = _new;
    }
    //add node at
    public void add(int val, int pos){
	///if list is empty simpoly call add()
	//if pos < size() throw exceptoon
	//
	
    }
    //add first
    //add lst
    
    ///remove nodes
    //remove node at    
    //remove first
    //remove lst
    
}

class Node{
    public Node(int value, Node next){
	this.value = value;
	this.next = next;
    }
    public int value;
    public Node next;
}
