package spacerace;

// TODO
@SuppressWarnings("serial")
public class InvalidDirectionException extends GameException {
    /**
     * Constructor.
     * @param msg Error message.
     */

    public InvalidDirectionException (String msg) {
        super(msg);
    }

}
