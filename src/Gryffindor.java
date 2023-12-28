public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String surname, String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(surname, name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return super.toString() + " Факультет: Гриффиндор. Благородство: " + nobility +
                "; Честь:" + honor +
                "; Храбрость:" + bravery + '.';
    }
    public static void bestOnGryffindor(Gryffindor  studentsOne,Gryffindor studentsTwo){
        int sumStudentsOne=studentsOne.getNobility() + studentsOne.getHonor() + studentsOne.getBravery();
        int sumStudentsTwo = studentsTwo.getNobility() + studentsTwo.getHonor() + studentsTwo.getBravery();
        if (sumStudentsOne>sumStudentsTwo){
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + "  лучший Гриффиндорец, чем "
                    + studentsTwo.getSurname() + studentsTwo.getName());
        } else if (sumStudentsTwo>sumStudentsOne) {
            System.out.println(studentsTwo.getSurname() + studentsTwo.getName() + "  лучший Гриффиндорец, чем "
                    + studentsOne.getSurname() + studentsOne.getName());
        } else {
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + " и "
                    + studentsTwo.getSurname() + studentsTwo.getName() + " равны по силе.");
        }
    }
}
