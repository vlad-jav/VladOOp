public class Main {
    public static void main(String[] args){



        Gryffindor harryPoter = new Gryffindor("Harry Poter",100,100,100,100,100);
        Gryffindor hermioneGranger = new Gryffindor("Hermoine Granger", 85,85, 68,70,30);
        Gryffindor ronWaessley = new Gryffindor("Ron Waessley", 50,60,70,80,40);

        Hufflepuff zakhariaSmith = new Hufflepuff("Zakharia Smith",50,80,60,30,20);
        Hufflepuff chedrickDiggory = new Hufflepuff("Chedrick Diggory",65,40,70,50,80);
        Hufflepuff justinFletchlie = new Hufflepuff("Justin Fletchlie",10,20,30,40,50);

        Ravenclaw choChang =new Ravenclaw("Cho Chang",90,80,70,60,50,40);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",60,40,50,30,70,80);
        Ravenclaw marcusBeldie =new Ravenclaw("Marcus Beldie",70,70,60,60,70,70);

        Slytherin dracoMalfoy =new Slytherin("Draco Malfoy",85,85,90,70,90,80,100);
        Slytherin grahamRontague =new Slytherin("Graham Rontague",60,70,30,20,75,60,20);
        Slytherin gregoryGoyle =new Slytherin("Gregory Goyle",50,50,50,80,50,50,50);

        System.out.println(harryPoter.calculateSpecificScore());
        System.out.println(harryPoter.calculateGeneralScore());

      //  System.out.println(zakhariaSmith.calculateSpecificScore());
      //  System.out.println(zakhariaSmith.calculateGeneralScore());

     //   System.out.println(choChang.calculateSpecificScore());
      //  System.out.println(choChang.calculateGeneralScore());

        System.out.println(dracoMalfoy.calculateSpecificScore());
        System.out.println(dracoMalfoy.calculateGeneralScore());

     //   hermioneGranger.compareByGeneral(dracoMalfoy);
   //     hermioneGranger.compareBySpecific(harryPoter);
        hermioneGranger.compare(dracoMalfoy);
        hermioneGranger.compare(harryPoter);

        dracoMalfoy.compare(gregoryGoyle);












    }
}