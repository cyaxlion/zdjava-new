package observer.player;

public class RadioNotification implements Observer {

    @Override
    public void update(Player player) {
        System.out.println("Radio info : ");
        System.out.println("Player " + player + " changed status to " + player.getStatus());
    }
}