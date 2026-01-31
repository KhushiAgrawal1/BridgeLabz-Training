package com.json_practice;
import java.util.Map;

public class Match {
    private int match_id;
    private String team1;
    private String team2;
    private Map<String, Integer> score;
    private String winner;
    private String player_of_match;

    // Getters and Setters
    public int getMatch_id() { return match_id; }
    public void setMatch_id(int match_id) { this.match_id = match_id; }

    public String getTeam1() { return team1; }
    public void setTeam1(String team1) { this.team1 = team1; }

    public String getTeam2() { return team2; }
    public void setTeam2(String team2) { this.team2 = team2; }

    public Map<String, Integer> getScore() { return score; }
    public void setScore(Map<String, Integer> score) { this.score = score; }

    public String getWinner() { return winner; }
    public void setWinner(String winner) { this.winner = winner; }

    public String getPlayer_of_match() { return player_of_match; }
    public void setPlayer_of_match(String player_of_match) { this.player_of_match = player_of_match; }
}
