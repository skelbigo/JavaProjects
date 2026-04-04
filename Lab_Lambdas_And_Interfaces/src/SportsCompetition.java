import java.util.Objects;

public class SportsCompetition {
    String competitionName;
    String teamOne, teamTwo;
    int score1, score2;
    String location;

    public SportsCompetition(String competitionName, String teamOne, String teamTwo, int score1, int score2, String location) {
        this.competitionName = competitionName;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.score1 = score1;
        this.score2 = score2;
        this.location = location;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setScore(int s1, int s2) {
        this.score1 = s1;
        this.score2 = s2;
    }

    public String getWinnerName() {
        if (score1 > score2) { return  teamOne; }
        else if (score1 < score2) { return teamTwo; }
        else { return "A draw"; }
    }

    public int getTotalScore() { return score1 + score2; }

    @Override
    public String toString() {
        return "competitionName='" + competitionName + '\'' +
                ", teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", location='" + location + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SportsCompetition that = (SportsCompetition) o;
        return score1 == that.score1 && score2 == that.score2 && Objects.equals(competitionName, that.competitionName) && Objects.equals(teamOne, that.teamOne) && Objects.equals(teamTwo, that.teamTwo) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitionName, teamOne, teamTwo, score1, score2, location);
    }
}
