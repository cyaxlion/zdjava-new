package interface_exercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("Maciek");
        Father father = new Father("Krzysztof");
        Mother mother = new Mother("Katarzyna");
        Daughter daughter = new Daughter("Michalina");
        List<FamilyMember> list = new ArrayList<FamilyMember>();
        list.add(son);
        list.add(father);
        list.add(mother);
        list.add(daughter);

        for (FamilyMember member : list) {
            member.przedstawSie();
            member.getType();
            System.out.println(member.jestDorosly());
        }
    }
}
