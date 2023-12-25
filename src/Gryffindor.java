public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String surname,  String name, int powerOfMagic,int transgressionDistance, int nobility, int honor, int bravery){
        super(surname,name,powerOfMagic,transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        Hogwarts hogwarts = super;
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
    public String toString(){

        return hogwarts + "Факультет: Гриффиндор. Благородство: " + nobility + "; Честь:" + honor + "; Храбрость:" + bravery + ".";}
    }
