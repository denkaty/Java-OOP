package FootballTeamGenerator_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> teams = new LinkedHashMap<>();

        String input = "";
        Team team = null;
        while (!"END".equals(input = bufferedReader.readLine())) {
            String[] tokens = input.split(";");

            String command = tokens[0];
            String teamName = tokens[1];

            try {
                if (command.equals("Team")) {
                    team = new Team(teamName);
                    teams.putIfAbsent(team.getName(), team);
                } else if (command.equals("Add")) {
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                    }
                    Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                    teams.get(teamName).addPlayer(player);
                } else if (command.equals("Remove")) {
                    String playerName = tokens[2];
                    teams.get(teamName).removePlayer(playerName);
                } else if (command.equals("Rating")) {
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                    }
                    double rating = teams.get(teamName).getRating();

                    System.out.println(String.format("%s - %d", teams.get(teamName).getName(), Math.round(rating)));
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
