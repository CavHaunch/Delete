BinString Class Constructor:

public BinString(String str) {
  try {
    bin = a;
    CharSequence cs0 = "0", cs1 = "1";

    if( !(bin.contains(cs0)&&bin.contains(cs1))) {
      throw new StringIsNotBinaryException("The string entered is not a binary integer");
    }
  }
  catch(StringIsNotBinaryException e) {
          System.out.println(e) ;
  }
}

Exception Class Code:
package ivanti.challenge;

public class StringIsNotBinaryException extends Exception{
	
	public StringIsNotBinaryException() {
        super();
    }
	
	public StringIsNotBinaryException(String message) {
        super(message);
    }
	
	public StringIsNotBinaryException(String message, Throwable throwable) {
	    super(message, throwable);
	}
}
