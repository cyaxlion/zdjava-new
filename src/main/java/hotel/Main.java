package hotel;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Hotel hotel = new Hotel();
        UserService service = new UserService(hotel);
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj rok urodzenia:");
        Integer age = input.nextInt();
        
        /**
         * Wyswietl liste pokoi (wolny-zajety)
         * wyswietl liste dostepnych pkoi
         * zarezerwuj pokoj
         * zwolnij pokoj
         */
        while (true) {
            System.out.println("--- Actions ---");
            System.out.println(
                    "Wybierz opcję: \n" +
                            "1) Wyświetl wszystkie pokoje \n" +
                            "2) Wyświetl dostępne pokoje \n" +
                            "3) Zarezerwuj pokój \n" +
                            "4) Zwolnij pokój \n\n"
            );
            int selection = input.nextInt();
            input.nextLine();
            switch(selection) {
                case 1: {
                    System.out.println(service.getRooms());
                    break;
                }
                case 2: {
                    System.out.println(service.getFreeRooms());
                    break;
                }
                case 3: {
                    Integer roomId = requestRoomId(input);
                    Room room = hotel.rooms.get(roomId);
                    if(room == null)  {
                        System.out.println("Pokój nie istnieje!");
                        break;
                    }
                    if(!room.isClean) {
                        System.out.println("Nie można zarezerwować pokoju, który nie jest czysty! Wybierz inny pokój.");
                        break;
                    }
                    boolean roomIsReserved = service.reserve(roomId);
                    if(!roomIsReserved) {
                        System.out.println("Nie można zarezerwować pokoju, który jest już zarezerwowany!");
                    } else {

                        System.out.println("Pomyślnie zarezerwowano pokój!");
                    }
                    break;
                }
                case 4: {

                    Integer roomId = requestRoomId(input);
                    if(hotel.rooms.get(roomId) == null)  {
                        System.out.println("Pokój nie istnieje!");
                        break;
                    }
                    boolean roomIsFreed = service.free(roomId);
                    if(!roomIsFreed) {
                        System.out.println("Nie można zwolnić wolnego pokoju!");
                    } else {
                        System.out.println("Pomyślnie zwolniono pokój nr: " + roomId);
                    }
                    break;
                }
                default: {
                    System.out.println("Nieprawidłowa opcja!");
                }
            }
        }



    }



    public static Integer requestRoomId(Scanner scanner) {
        System.out.println("Wprowadź numer pokoju: ");
        Integer selection = scanner.nextInt();

        scanner.nextLine();
        return selection;
    }

}
