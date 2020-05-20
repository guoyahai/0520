package exception;
/**
 * desc:重复预约异常
 * @author 60551
 *
 */
public class RepeatAppointException extends RuntimeException {
	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}
}
