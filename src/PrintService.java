public class PrintService {
    public void print(Hogwarts [] students,int i){
        System.out.println("Всего студентов: " + students.length);
            Hogwarts hogwarts = students[i];
            System.out.println("Студент: " + hogwarts.getSurname() + hogwarts.getName()
                    + "; Сила магии: " + hogwarts.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + hogwarts.getTransgressionDistance() + ". ");
    }
    public void bestWizard(Hogwarts [] students,int x, int y){
        Hogwarts hogwarts = students[x];
        System.out.println(hogwarts.getSurname() + hogwarts.getName());
        int a = hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance();
        Hogwarts hogwartsNew = students[y];
        System.out.println(hogwarts.getSurname() + hogwarts.getName());
        int b = hogwarts.getPowerOfMagic() + hogwarts.getTransgressionDistance();
        if (a>b){
            System.out.print(hogwarts.getSurname() + hogwarts.getName() + " обладает бОльшей мощностью магии, чем ");
            System.out.println(hogwarts.getSurname() + hogwarts.getName());
        }
    }
    public void print(Gryffindor [] potterSquad){
        System.out.println("Студентов на факультете: " + potterSquad.length);
        for (int i = 0; i <potterSquad.length; i++) {
            Gryffindor gryffindor = potterSquad[i];
            System.out.println("Студент: " + gryffindor.getSurname() + gryffindor.getName()
                    + "; Сила магии: " + gryffindor.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + gryffindor.getTransgressionDistance()
                    + " Факультет: Гриффиндор. Благородство: " + gryffindor.getNobility()
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
                    + " Факультет: Слизерин. Хитрость: " + slytherin.getGuile()
                    + "; Решительность:" + slytherin.getResolve()
                    + "; Амбициозность:" + slytherin.getAmbition()
                    + "; Находчивость: " + slytherin.getGumption()
                    + "; Жажда власти: " + slytherin.getLustForPower() + ".");
        }
    }
    public void print(Hufflepuff [] diggorySquad, int i){
        System.out.println("Студентов на факультете: " + diggorySquad.length);
        Hufflepuff hufflepuff = diggorySquad[i];
        System.out.println("Студент: " + hufflepuff.getSurname() + hufflepuff.getName()
                    + "; Сила магии: " + hufflepuff.getPowerOfMagic()
                    + "; Дистанция трансгресии: " + hufflepuff.getTransgressionDistance()
                    + " Факультет: Хаффлпафф. Трудолюбие: " + hufflepuff.getHardWork()
                    + "; Верность:" + hufflepuff.getLoyalty()
                    + "; Честность:" + hufflepuff.getHonesty() + ".");

    }
    public void print(Ravenclaw [] lovegoodSquad, int i){
        System.out.println("Студентов на факультете: " + lovegoodSquad.length);
        Ravenclaw ravenclaw = lovegoodSquad[i];
        System.out.println("Студент: " + ravenclaw.getSurname() + ravenclaw.getName()
                + "; Сила магии: " + ravenclaw.getPowerOfMagic()
                + "; Дистанция трансгресии: " + ravenclaw.getTransgressionDistance()
                + " Факультет: Рейвнкло. Ум: " + ravenclaw.getSmart()
                + "; Мудрость:" + ravenclaw.getWise()
                + "; Остроумие:" + ravenclaw.getWitty()
                + "; Творческие наклонности:" + ravenclaw.getCreative() + ".");

    }
}
