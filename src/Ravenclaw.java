public class Ravenclaw  extends Hogwarts {

    private  int intelligence;

    private int wisdom;

    private int wit;


    private int creativity;

    public Ravenclaw( String name, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} ";
    }

    @Override
    public int calculateSpecificScore() {
        return this.intelligence + this.wisdom + this.wit + this.creativity;
    }

    @Override
    public void printCompereOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println( String.format(" %s лучший Когтевранец  чем %s",betterStudentName, otherStudentName));
    }
}
