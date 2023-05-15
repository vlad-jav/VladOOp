public abstract class Hogwarts  {

    private String name;

    private  int powerOfMagic;

    private  int  transgressionDistance;

    public String getName() {
        return name;
    }

    public Hogwarts(String name , int powerOfMagic, int transgressionDistance) {
        this.name =name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public int calculateGeneralScore(){
        return powerOfMagic +  transgressionDistance;
    }

    public abstract int calculateSpecificScore();

public abstract void printCompereOfStudents(String betterStudentName, String otherStudentName );


public void compare(Hogwarts hogwarts){
    if (this.getClass().equals(hogwarts.getClass())){
        compareBySpecific(hogwarts);
    }else{
        compareByGeneral(hogwarts);
    }
}


private void compareBySpecific(Hogwarts hogwarts){
    int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
    int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();
    if( thisScore > otherScore ) {
        printCompereOfStudents(this.getName(), hogwarts.getName());
    }else if ( thisScore < otherScore) {
        printCompereOfStudents(hogwarts.getName(),this.getName());
    }else{
        System.out.println("Волшебники равны по силе ");
    }

}
  private void compareByGeneral(Hogwarts hogwarts){
      int thisScore = this.calculateGeneralScore();
      int otherScore = hogwarts.calculateGeneralScore();
      if( thisScore > otherScore ) {
          System.out.println(String.format("%s сильнее че %s ", this.name,hogwarts.getName()));
      }else if ( thisScore < otherScore) {
          System.out.println(String.format("%s сильнее че %s ", hogwarts.getName(),this.name));
      }else{
          System.out.println("Волшебники равны по силе ");
      }

    }

}
