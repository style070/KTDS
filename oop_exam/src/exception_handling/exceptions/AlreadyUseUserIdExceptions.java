package exception_handling.exceptions;

/**
 * 이미가입된 ID로 회원가입을 시도할 때 발생할 예외
 */
public class AlreadyUseUserIdExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 872950573564968394L;

	
	public AlreadyUseUserIdExceptions(String message) {
		super(message);
	}
	
	public AlreadyUseUserIdExceptions(String message , Throwable cause) {
		super(message,cause);
	}
	
	
	
}
