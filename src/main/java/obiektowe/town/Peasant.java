package obiektowe.town;

public class Peasant extends Citizen {
    public Peasant(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
