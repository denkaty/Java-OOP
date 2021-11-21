package FootballTeamGenerator_05;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean containsPlayer = false;
        for (Player player : this.players) {
            if (player.getName().equals(playerName)) {
                containsPlayer = true;
                break;
            }
        }

        if (!containsPlayer) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
        this.players.removeIf(player -> player.getName().equals(playerName));

    }

    public double getRating() {
        double rating = 0.0;
        for (Player player : this.players) {
            rating += player.overallSkillLevel();
        }

        rating = rating / this.players.size();
        return rating;

    }
}
