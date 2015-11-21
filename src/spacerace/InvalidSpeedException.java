package spacerace;

@SuppressWarnings("serial")
public class InvalidSpeedException extends GameException  {
    public InvalidSpeedException(String msg) {
        super(msg);
    }
}
