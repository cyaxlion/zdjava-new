package connector;

public class DBFailException extends Exception {

    public DBFailException() {
        super("Reader has failed to connect.");
    }
}
