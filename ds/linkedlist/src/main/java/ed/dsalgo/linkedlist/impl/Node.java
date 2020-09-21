package ed.dsalgo.linkedlist.impl;


public class Node{
    public Node(int value, Node next){
	this.value = value;
	this.next = next;
    }
    public int value;
    public Node next;
    @Override
    public String toString(){
	return String.valueOf(value);
    }
    
}
