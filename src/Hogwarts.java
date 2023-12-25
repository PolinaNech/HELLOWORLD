public class Hogwarts  {
    private static String surname;
    private static String name;
    private static int powerOfMagic;
    private static int transgressionDistance;

    public Hogwarts(String surname,  String name, int powerOfMagic,int transgressionDistance) {
        this.surname = surname;
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getName() {
        return name;
    }

    public static int getPowerOfMagic() {
        return powerOfMagic;
    }

    public static void setPowerOfMagic(int powerOfMagic) {
        Hogwarts.powerOfMagic = powerOfMagic;
    }

    public static int getTransgressionDistance() {
        return transgressionDistance;
    }

    public static void setTransgressionDistance(int transgressionDistance) {
        Hogwarts.transgressionDistance = transgressionDistance;
    }

    public String toString(){
        return "Студент: " + surname + name + "; Сила магии: " + powerOfMagic + "; Дистанция трансгресии: " + transgressionDistance + ". ";
    }

}
