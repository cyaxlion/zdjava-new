package obiektowe.town;

public class TownDemo {

    public static void main(String[] args) {
        Town town = new Town("Brzeg Dolny");
        town.addMember(new Peasant("Test"));
        town.addMember(new King("Artur"));
        town.addMember(new Soldier("Szymon"));
        town.addMember(new Townsman("Lolek"));

        System.out.println(town.howManyCanVote());
        System.out.println(town.whoCanVote());
    }
}
