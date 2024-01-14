public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String surname, String name, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(surname, name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return super.toString() + " Факультет: Пуффендуй. Трудолюбие: " + hardWork
                + "; Верность:" + loyalty
                + "; Честность:" + honesty + ".";
    }

    public static void bestOnHufflepuff(Hufflepuff  studentsOne,Hufflepuff studentsTwo){
        int sumStudentsOne=studentsOne.getHardWork() + studentsOne.getLoyalty() + studentsOne.getHonesty();
        int sumStudentsTwo = studentsTwo.getHardWork() + studentsTwo.getLoyalty() + studentsTwo.getHonesty();
        if (sumStudentsOne>sumStudentsTwo){
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + "  лучший Пуффендуец, чем "
                    + studentsTwo.getSurname() + studentsTwo.getName());
        } else if (sumStudentsTwo>sumStudentsOne) {
            System.out.println(studentsTwo.getSurname() + studentsTwo.getName() + "  лучший Пуффендуец, чем "
                    + studentsOne.getSurname() + studentsOne.getName());
        } else {
            System.out.println(studentsOne.getSurname() + studentsOne.getName() + " и "
                    + studentsTwo.getSurname() + studentsTwo.getName() + " равны по силе.");
        }
    }
}
