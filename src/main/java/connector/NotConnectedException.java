package connector;

public class NotConnectedException extends Exception {

    public NotConnectedException() {
        super("File reader is not connected!");
    }
}
