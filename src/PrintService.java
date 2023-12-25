public class PrintService {
    public void print(Hogwarts [] students){
        System.out.println("Всего студентов: " + students.length);
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println("Студент: " + hogwarts.getSurname() + hogwarts.getName()
                    + "; Сила магии: " + hogwarts.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + hogwarts.getTransgressionDistance() + ". ");
        }
    }
    public void print(Gryffindor [] potterSquad){
        System.out.println("Студентов на факультете: " + potterSquad.length);
        for (int i = 0; i <potterSquad.length; i++) {
            Gryffindor gryffindor = potterSquad[i];
            System.out.println("Студент: " + gryffindor.getSurname() + gryffindor.getName()
                    + "; Сила магии: " + gryffindor.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + gryffindor.getTransgressionDistance()
                    + "Факультет: Гриффиндор. Благородство: " + gryffindor.getNobility()
                    + "; Честь:" + gryffindor.getHonor()
                    + "; Храбрость:" + gryffindor.getBravery() + ".");
        }
    }
    public void print(Slytherin [] malfoySquad){
        System.out.println("Студентов на факультете: " + malfoySquad.length);
        for (int i = 0; i <malfoySquad.length; i++) {
            Slytherin slytherin = malfoySquad[i];
            System.out.println("Студент: " + slytherin.getSurname() + slytherin.getName()
                    + "; Сила магии: " + slytherin.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + slytherin.getTransgressionDistance()
                    + "Факультет: Гриффиндор. Благородство: " + slytherin.getGuile()
                    + "; Честь:" + slytherin.getResolve()
                    + "; Храбрость:" + slytherin.getAmbition() + ".");
        }
    }
}
