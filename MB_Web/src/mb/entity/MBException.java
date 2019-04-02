package mb.entity;

public class MBException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MBException() {
		
	}
	public MBException(String msg) {
		super(msg);
	}
	public MBException(String msg,Throwable cause) {
		super(msg,cause);
	}
}
