

public class Team {

    public String teamName;


       Programmer p1 = new Programmer();
       Programmer p2 = new Programmer();



    public void  printTeamDetails(){
        System.out.println("The name of team is "+ teamName);
        p1.printProgrammerDetails();
        System.out.println(" he is the creator of the team, he doesn't have great skills but a lot of imagination");
        p2.printProgrammerDetails();
        System.out.println(" he is new in the team, he has excellent qualities and skills");

    }

}
