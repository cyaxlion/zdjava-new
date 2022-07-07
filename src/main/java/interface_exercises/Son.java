package interface_exercises;

public class Son implements FamilyMember {
    @Override
    public void przedstawSie() {
        System.out.println("Who's asking? I'm " + this.name);
    }
    @Override
    public boolean jestDorosly() {
        return false;
    }

    public String name;
    public Son(String name) {
        this.name = name;
    }
}
