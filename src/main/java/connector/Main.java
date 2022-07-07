package connector;


import connector.FileConnection;

public class Main {
    public static void main(String[] args) {
        FileConnection connector = new FileConnection("src\\main\\java\\exceptions\\ksiazki.txt");
        try {
            connector.connect();
            System.out.println(connector.getData());
            connector.disconnect();
            connector.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
