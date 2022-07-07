package interface_exercises;

public class Father implements FamilyMember {
    @Override
    public void przedstawSie() {
        System.out.println("I am your father, " + this.name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
    public String name;
    public Father(String name) {
        this.name = name;
    }
}
