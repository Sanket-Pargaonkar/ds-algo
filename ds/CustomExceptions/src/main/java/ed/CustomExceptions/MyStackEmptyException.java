package ed.CustomExceptions;

public class MyStackEmptyException extends Exception{
    public MyStackEmptyException(){
	super("MyStock is Empty. Cannot pop elements.");
    }
}

class WrongInsertPositionException extends Exception{
    public WrongInsertPositionException(int position,int arraySize){
	super("Incorrect insert position: "+position+".- Size of the array is "+ arraySize);
    }
}
