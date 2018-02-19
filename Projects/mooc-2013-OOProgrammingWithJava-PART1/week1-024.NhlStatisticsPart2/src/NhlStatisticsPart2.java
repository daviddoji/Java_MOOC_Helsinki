
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        // for reading input from user
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        
        //loop
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, "
                    + "player, club, quit): ");
            String command = reader.nextLine();
            
            // different commands
            if (command.equals("quit")) {
                break;
            } else if (command.equals("points")) {
                // Print the top ten players sorted by points.
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                //  Print the top ten players sorted by assists.
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                //  Print the top ten players sorted by penalties.
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and 
                // then print them.
                System.out.println("which player: ");
                String player = reader.nextLine();
                NHLStatistics.searchByPlayer(player);
            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and 
                // then print them.
                System.out.println("which club: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
                // Note: When printing statistics they should be ordered by 
                // points (so the players with the most points come first).
            }
        }
    }
}
