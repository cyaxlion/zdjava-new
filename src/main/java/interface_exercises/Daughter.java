package interface_exercises;

public class Daughter implements FamilyMember {
    @Override
    public void przedstawSie() {
        System.out.println("I am a daughter, " + this.name);
    }
    @Override
    public boolean jestDorosly() {
        return false;
    }

    public String name;
    public Daughter(String name) {
        this.name = name;
    }
}
