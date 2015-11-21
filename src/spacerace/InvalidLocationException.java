package spacerace;

@SuppressWarnings("serial")
public class InvalidLocationException extends InvalidLevelException {
    public InvalidLocationException(String msg) {
        super(msg);
    }
}
