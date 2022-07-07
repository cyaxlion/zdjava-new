package interface_exercises;

public class Mother implements FamilyMember {
    public void przedstawSie() {
        System.out.println("I am the mother, " + this.name);
    }
    @Override
    public boolean jestDorosly() {
        return true;
    }

    public String name;
    public Mother(String name) {
        this.name = name;
    }
}
