public class Gryffindor  extends Hogwarts {

    private  int nobility;

    private  int honor;

    private int courage;

    public Gryffindor( String name ,int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name,  powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;

    }

    @Override
    public String toString() {
        return super.toString() + "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "} ";
    }

    @Override
    public int calculateSpecificScore() {
        return this.nobility + this.honor + this.courage;
    }

    @Override
    public void printCompereOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println( String.format(" %s лучший Гриффиндорец чем %s",betterStudentName, otherStudentName));
    }


}
