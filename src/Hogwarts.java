public class Hogwarts  {
    private String surname;
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String surname,  String name, int powerOfMagic,int transgressionDistance) {
        this.surname = surname;
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String toString(){
        return "Студент: " + surname + name + "; Сила магии: " + powerOfMagic + "; Дистанция трансгресии: " + transgressionDistance + ". ";
    }

}
