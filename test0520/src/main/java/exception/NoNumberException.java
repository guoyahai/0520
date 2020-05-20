package exception;
/**
 * desc:库存不足异常
 * @author 60551
 *
 */
public class NoNumberException extends RuntimeException {
	public NoNumberException(String message) {
		super(message);
	}

	public NoNumberException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
