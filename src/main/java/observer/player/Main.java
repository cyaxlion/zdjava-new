package observer.player;

public class Main {
    public static void main(String[] args) {
        Player player=new Player("Lewandowski",Status.IDLE);
        TVNotification tv = new TVNotification();
        TVNotification tv2 = new TVNotification();
        TVNotification tv3 = new TVNotification();
        TVNotification tv4 = new TVNotification();
        TVNotification tv5 = new TVNotification();
        RadioNotification radio=new RadioNotification();
        player.addObserver(tv);
        player.addObserver(tv2);
        player.addObserver(tv3);
        player.addObserver(tv4);
        player.addObserver(tv5);
        player.addObserver(radio);
        player.update(Status.SCORED);
    }
}

