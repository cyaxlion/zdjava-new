package obiektowe.town;

public class King extends Citizen {
    public King(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
