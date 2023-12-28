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

    @Override
    public String toString() {
        return "Студент: " +surname+name
                + "; Сила магии: " + powerOfMagic
                + "; Дистанция трансгресии: " + transgressionDistance + ". ";
    }
    public void bestWizard(Hogwarts [] studentsOne,Hogwarts[] studentsTwo){
        int sumStudentsOne=studentsOne.getPowerOfMagic() + studentsOne.getTransgressionDistance();
        int sumStudentsTwo = studentsTwo.getPowerOfMagic() + studentsTwo.getTransgressionDistance();
        if (sumStudentsOne>sumStudentsTwo){
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + " обладает бОльшей мощностью магии, чем "
                    + studentsTwo.getSurname() + studentsTwo.getName());
        } else if (sumStudentsTwo>sumStudentsOne) {
            System.out.println(studentsTwo.getSurname() + studentsTwo.getName() + " обладает бОльшей мощностью магии, чем "
                    + studentsOne.getSurname() + studentsOne.getName());
        } else {
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + " равен по силе "
                    + studentsTwo.getSurname() + studentsTwo.getName());
        }
    }
}
