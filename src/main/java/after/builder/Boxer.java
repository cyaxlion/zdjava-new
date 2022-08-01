package after.builder;

public class Boxer {

    private Punch punch;

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public Boxer() {

    }
    public void hit(){
        this.punch.punch ();
    }
}
