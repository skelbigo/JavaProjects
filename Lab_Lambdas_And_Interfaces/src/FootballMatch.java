import java.util.Objects;

public class FootballMatch extends SportsCompetition{
    String stadium;
    int yellowCards, redCards;
    boolean hasExtraTime;

    public FootballMatch(String competitionName, String teamOne, String teamTwo, int score1, int score2, String location, String stadium, int yellowCards, int redCards, boolean hasExtraTime) {
        super(competitionName, teamOne, teamTwo, score1, score2, location);
        this.stadium = stadium;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.hasExtraTime = hasExtraTime;
    }

    public void updateScore(int s1, int s2) {
        this.score1 = s1;
        this.score2 = s2;
    }

    public void updateScore(int s1, int s2, int yellowCards, int redCards) {
        this.score1 = s1;
        this.score2 = s2;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    @Override
    public String getWinnerName() {
        if (score1 > score2) { return  teamOne; }
        else if (score1 < score2) { return teamTwo; }
        else { return "Victory on penalties"; }
    }

    @Override
    public String toString() {
        return "FootballMatch{" + super.toString() + ", stadium='" + stadium + '\'' +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                ", hasExtraTime=" + hasExtraTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballMatch that = (FootballMatch) o;
        return yellowCards == that.yellowCards && redCards == that.redCards && hasExtraTime == that.hasExtraTime && Objects.equals(stadium, that.stadium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stadium, yellowCards, redCards, hasExtraTime);
    }
}
