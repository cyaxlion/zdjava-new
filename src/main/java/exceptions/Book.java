package exceptions;

public class Book {
    public String name;
    public int release;
    public Book(String name, int release) {
        this.name = name;
        this.release = release;
    }

    @Override
    public String toString() {
        return "Book={name=\"" + this.name + "\",release=" + this.release + "}";
    }
}
