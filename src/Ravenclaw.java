public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;
    public Ravenclaw(String surname, String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(surname, name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    @Override
    public String toString() {
        return super.toString() + " Факультет: Когтевран. Ум: " + smart
                + "; Мудрость:" + wise
                + "; Остроумие:" + witty
                + "; Творческие наклонности:" + creative + ".";
    }
    public static void bestOnRavenclaw(Ravenclaw  studentsOne,Ravenclaw studentsTwo){
        int sumStudentsOne=studentsOne.getSmart() + studentsOne.getWise() + studentsOne.getWitty() + studentsOne.getCreative();
        int sumStudentsTwo = studentsTwo.getSmart() + studentsTwo.getWise() + studentsTwo.getWitty() + studentsTwo.getCreative();
        if (sumStudentsOne>sumStudentsTwo){
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + "  лучший Когтевранец, чем "
                    + studentsTwo.getSurname() + studentsTwo.getName());
        } else if (sumStudentsTwo>sumStudentsOne) {
            System.out.println(studentsTwo.getSurname() + studentsTwo.getName() + "  лучший Когтевранец, чем "
                    + studentsOne.getSurname() + studentsOne.getName());
        } else {
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + " и "
                    + studentsTwo.getSurname() + studentsTwo.getName() + " равны по силе.");
        }
    }
}
