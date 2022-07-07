package obiektowe.town;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private String name;
    private ArrayList<Citizen> population = new ArrayList<Citizen>();

    public Town(String name) {
        this.name = name;
    }

    public void addMember(Citizen member) {
        this.population.add(member);
    }

    public int howManyCanVote() {
        return (int) this.whoCanVote().stream().count();
    }
    public List<String> whoCanVote() {
        return this.population.stream().filter(el -> el.canVote() == true).map(el -> el.getName()).toList();
    }

}
