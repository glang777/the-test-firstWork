package cn.gl.test1;

public class MySelftException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public MySelftException(String message, Throwable cause) {
		super(message, cause);
	}

	public MySelftException(String message) {
		super(message);
	}


	 
	
}
