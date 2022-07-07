package connector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {
    boolean connected = false;
    String file;
    public FileConnection(String file) {
        this.file = file;
    }

    public void connect() throws DBFailException {
        this.connected = true;
        Random rand = new Random();
        if(rand.nextDouble() < 0.25) {
            throw new DBFailException();
        }
    }

    public String getData() throws NotConnectedException, FileReadException {
        if(!this.connected) {
            throw new NotConnectedException();

        }

        List<String> lineList = new ArrayList<>();
        File file = new File(this.file);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineList.add(line);
            }

        } catch (FileNotFoundException e) {
            this.connected = false;
            throw new FileReadException();
        }

        return String.join("\n", lineList);
    }
    public void disconnect() {
        this.connected = false;

    }

}
