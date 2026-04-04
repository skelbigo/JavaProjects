import java.util.Arrays;
import java.util.Objects;

public class TennisMatch extends SportsCompetition {
    String surfaceType;
    boolean isGrandSlam;
    int acesPlayerOne, acesPlayerTwo;
    String[] setScores;

    public TennisMatch(String competitionName, String teamOne, String teamTwo, int score1, int score2, String location, String surfaceType, boolean isGrandSlam, int acesPlayerOne, int acesPlayerTwo, String[] setScores) {
        super(competitionName, teamOne, teamTwo, score1, score2, location);
        this.surfaceType = surfaceType;
        this.isGrandSlam = isGrandSlam;
        this.acesPlayerOne = acesPlayerOne;
        this.acesPlayerTwo = acesPlayerTwo;
        this.setScores = setScores;
    }

    public int calculateTotalAces() {
        return acesPlayerOne + acesPlayerTwo;
    }

    public boolean isLongMatch() {
        return setScores.length > 3;
    }

    public String getMatchDescription() {
        return super.getTeamOne() + " (Aces: " + acesPlayerOne + ") vs " + super.teamTwo + " (Aces: " + acesPlayerTwo + ")";
    }

    @Override
    public String getWinnerName() {
        if (score1 > score2) { return  teamOne; }
        else if (score1 < score2) { return teamTwo; }
        else if (acesPlayerOne > acesPlayerTwo) { return  teamOne; }
        else { return teamTwo; }
    }

    @Override
    public String toString() {
        return "TennisMatch{" +
                super.toString() + ", surfaceType='" + surfaceType + '\'' +
                ", isGrandSlam=" + isGrandSlam +
                ", acesPlayerOne=" + acesPlayerOne +
                ", acesPlayerTwo=" + acesPlayerTwo +
                ", setScores=" + Arrays.toString(setScores) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TennisMatch that = (TennisMatch) o;
        return isGrandSlam == that.isGrandSlam && acesPlayerOne == that.acesPlayerOne && acesPlayerTwo == that.acesPlayerTwo && Objects.equals(surfaceType, that.surfaceType) && Objects.deepEquals(setScores, that.setScores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surfaceType, isGrandSlam, acesPlayerOne, acesPlayerTwo, Arrays.hashCode(setScores));
    }
}
