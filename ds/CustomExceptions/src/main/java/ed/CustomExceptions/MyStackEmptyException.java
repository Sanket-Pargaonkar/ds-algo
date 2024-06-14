package ed.CustomExceptions;

public class MyStackEmptyException extends Exception{
    public MyStackEmptyException(){
	super("MyStock is Empty. Cannot pop elements.");
    }
}



