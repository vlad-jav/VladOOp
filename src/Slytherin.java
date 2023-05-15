public class Slytherin extends Hogwarts {

    private int conning;

    private int determination;

    private  int    ambition;

    private int resourcefulness;


    private  int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int conning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.conning = conning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "Slytherin{" +
                "conning=" + conning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} ";
    }

    @Override
    public int calculateSpecificScore() {
        return this.conning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    @Override
    public void printCompereOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println( String.format(" %s лучший Слизеренец  чем %s",betterStudentName, otherStudentName));
    }
}
