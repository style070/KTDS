package exception_handling.exceptions;

/**
 * 1. 시스템 계정으로 회원가입을 하려는 시도를 막아주는 예외
 * root / admin / system
 */
public class InvalidUserIdExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7343809389749747339L;
	
	public InvalidUserIdExceptions(String message) {
		super(message);
	}
	
	public InvalidUserIdExceptions(String message,Throwable cause) {
		super(message,cause);
	}
}
