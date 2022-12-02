public class CompetitionJava {

    public static void main(String[] args) {

        System.out.println("Welcome to the Competition Java coding!");
        CompetitionRules.printRules();

        System.out.println("Today two teams will face each other, let's introduce them.");


        Team teamA = new Team();
        teamA.teamName = "Data Pirates!";

            teamA.p1.name = "GiGi";
            teamA.p1.yearsOfExperience = 6;
            teamA.p1.programmingLanguage = "Java";

            teamA.p2.name = "Ciccio";
            teamA.p2.yearsOfExperience = 3;
            teamA.p2.programmingLanguage = "Java";

        teamA.printTeamDetails();


        Team teamB = new Team();
        teamB.teamName = "Adobe Priests!";

            teamB.p1.name = "Saro";
            teamB.p1.yearsOfExperience = 6;
            teamB.p1.programmingLanguage = "Java";

            teamB.p2.name = "Luca";
            teamB.p2.yearsOfExperience = 2;
            teamB.p2.programmingLanguage = "C++";

        teamB.printTeamDetails();

    }

}














/*
        String teamA;
        teamA = "TeamA is Data Pirates! ";


        String teamB;
        teamB = "TeamB is Adobe Priests! ";

        System.out.println(teamA);
        System.out.println(teamB);
 */

