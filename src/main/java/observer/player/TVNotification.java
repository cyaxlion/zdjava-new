package observer.player;

public class TVNotification implements Observer{

    @Override
    public void update(Player player) {
        System.out.println("Tv info : ");
        System.out.println("Player " + player + " changed status to " + player.getStatus());
    }
}
