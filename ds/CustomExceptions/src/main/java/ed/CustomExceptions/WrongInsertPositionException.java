package ed.CustomExceptions;

public class WrongInsertPositionException extends Exception{
    public WrongInsertPositionException(int position,int arraySize){
	super("Incorrect insert position: "+position+".- Size of the array is "+ arraySize);
    }
}
