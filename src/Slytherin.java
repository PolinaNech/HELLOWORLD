public class Slytherin extends Hogwarts{
    private int guile;
    private int resolve;
    private int ambition;
    private int gumption;
    private int lustForPower;
    public Slytherin (String surname,  String name, int powerOfMagic,int transgressionDistance, int guile, int resolve, int ambition, int gumption, int lustForPower){
        super(surname,name,powerOfMagic,transgressionDistance);
        this.guile = guile;
        this.resolve = resolve;
        this.ambition = ambition;
        this.gumption = gumption;
        this.lustForPower = lustForPower;

    }

    public int getGuile() {
        return guile;
    }

    public void setGuile(int guile) {
        this.guile = guile;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getGumption() {
        return gumption;
    }

    public void setGumption(int gumption) {
        this.gumption = gumption;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
