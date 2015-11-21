package spacerace;

@SuppressWarnings("serial")
public class InvalidLocationException extends GameException {
    public InvalidLocationException(String msg) {
        super(msg);
    }
}
