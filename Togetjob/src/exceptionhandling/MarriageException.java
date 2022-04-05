package exceptionhandling;

public class MarriageException extends Exception{
	String msg="invalid age";
	MarriageException(String msg)
	{
		this.msg=msg;
	}
public String getMessage()
{
	return msg;
}
}
