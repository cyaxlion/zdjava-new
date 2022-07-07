package connector;

public class FileReadException extends Exception {

    public FileReadException() {
        super("File is not present.");
    }
}
