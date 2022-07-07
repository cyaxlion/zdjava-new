package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.print("Podaj liczbę: ");
            number = scanner.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Nieprawidłowo wprowadzony znak!");
            return this.readNumber();
        }
    }

    public List<Book> readBooks(String fileName) throws BookMappingException {
        List<Book> bookList = new ArrayList<>();
        File file = new File(fileName);
        try {

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String book = scanner.nextLine();
                bookList.add(this.constructBook(book));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Masz się zabrać za czytanie!");
        }

        System.out.println(bookList);
        return bookList;
    }

    private Book constructBook(String line) throws BookMappingException {
        try {
            String[] elements = line.split(";");
            int year = Integer.parseInt(elements[1]);
            return new Book(elements[0], year);
        } catch (Exception exception) {
            throw new BookMappingException("Niepoprawny format pliku.", line);
        }
    }

}
