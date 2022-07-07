package obiektowe.town;

public class Townsman extends Citizen {
    public Townsman(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
