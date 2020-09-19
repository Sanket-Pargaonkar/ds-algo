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
    //get Mid
    public String getMid(){
	Node fast = head;
	Node slow = head;
	int count = 0;

	while(fast != null && fast.next != null){
	    slow = slow.next;
	    fast = fast.next.next;
	    count +=1;
	}
	StringBuilder sb = new StringBuilder();
	sb.append(String.valueOf(slow.value));
	return sb.toString();
    }
    //get Node at position
    public Node getNodeAt(int pos){
	int dist = 0;
	Node curr = head;
	while(dist<pos){
	    curr = curr.next;
	    dist++;
	}
	    
	return curr;
    }
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
    public void add(int val, int pos) throws Exception{
	if(head == null){
	    throw new Exception("Empty List");
	} 
	Node curr = head;
	int count = 0;
	Node _val = new Node(val,null);
	if(pos == 0){
	    _val.next = head;
	    head = _val;	    
	    return;
	}

	while(curr != null){
	    
	    if(curr == tail){
		tail.next = _val;
		tail = _val;
		break;
	    }
	    
	    if(count == pos){
		curr.next = _val;
		curr = _val;
		break;
	    }
	    curr = curr.next;
	    count++;
	}
	// int size = size();
	// //if pos < size() throw exceptoon	
	// if(pos>=size){
	//     throw new Exception("Invalid position");
	// }

	// Node _pos = getNodeAt(pos);

	// Node posNext = _pos.next;

	// Node _val = new Node(val,posNext);
	// _pos.next= _val;

    }
    //add first
    public void addFirst(int val){
	Node preHead = new Node(val, null);
	preHead.next = head;
	head = preHead;
    }
    
    //add lst
    public void addLast(int val){
	Node _new = new Node(val, null);
	if(head == null){
	    head = _new;
	}
	else if(head == tail){
	    head.next = _new;
	}
	else 
	    tail.next = _new;
	tail = _new;
    }
    
    ///remove nodes
    
    //remove node at
    public void remove(int pos) throws Exception{
	if(head == null){
	    throw new Exception("Empty List");
	} 
	Node curr = head;
	int count = 0;

	if(pos == 0){
	    if(head == tail)
		head=tail= null;
	    Node _curr = head.next;
	    head.next = null;
	    head = _curr;
	    return;
	}

	while(curr.next != null){
	    
	    if(curr.next == tail){
		curr.next = null;
		tail = curr;
		break;
	    }
	    
	    if(count == pos-1){
		Node _nnext = curr.next.next;
		Node next = curr.next;		

		curr.next = _nnext;
		next = null;
		break;
	    }
	    curr = curr.next;
	    count++;
	}

    }    
    //remove first
    public void removeFirst() throws Exception{
	if(head == null){
	    throw new Exception("Empty List");
	} 
	Node curr = head;
	int count = 0;
	if(head == tail)
	    head=tail= null;
	Node _curr = head.next;
	head.next = null;
	head = _curr;
	return;
    }    
    //remove lst
    public void removeLast() throws Exception{
	if(head == null){
	    throw new Exception("Empty List");
	} 
	Node curr = head;
	int count = 0;
	if(head == tail){
	    head=tail= null;
	    return;
	}
	while(curr.next != null){
	    if(curr.next == tail){
		curr.next = null;
		tail = curr;
		break;
	    }
	    curr = curr.next;
	    count++;
	}
    }    
}

class Node{
    public Node(int value, Node next){
	this.value = value;
	this.next = next;
    }
    public int value;
    public Node next;
}
