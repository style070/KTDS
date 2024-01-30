package exception_handling.exceptions;

/**
 * 8글자 미만의 아이디로 회원가입을 시도할 때 발생할 예외
 */
public class UserIdLengthExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2784119821548630293L;
	
	public UserIdLengthExceptions(String message) {
		super(message);
	}
	
	public UserIdLengthExceptions(String message , Throwable cause) {
		super(message,cause);
	}
	
}
