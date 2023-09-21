package ed.dsalgo.arrays;
import ed.CustomExceptions.*

public class DynamicArray{
    private int size;
    private int capacity;
    private int[] array;
    public DynamicArray(int capacity) {
        this.capacity = capacity;    
        this.array = new int[capacity];
    }

    //traverse 
    public void traverse(){

    }
    //insert
    public bool insert(int i, int pos){
	if(pos >=capacity){
	    throw new WrongInsertPositionException(int pos ,int capacity)
	}
    }
    //delete
    //sort
    //search
}

