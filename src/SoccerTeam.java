public class SoccerTeam {
    private String officialName;
    private String nickName;
    private int goalsScoredSeason;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;
    private int goalsConcededSeason;
    private int competitionPoints;

    /** Creates a SoccerTeam with specified official name and nick name.
     * @param official The official name of the soccer team.
     * @param nick The nick name of the soccer team.
     * @throws TeamException If official or nick are empty strings. */
    public SoccerTeam(String official, String nick) throws Exception {
        if(official.length() == 0 ) throw new Exception();
        if(nick.length() == 0 ) throw new Exception();
        this.officialName = official; this.nickName = nick;
        this.goalsScoredSeason = 0; this.goalsConcededSeason = 0;
        this.matchesWon = 0; this.matchesLost = 0;
        this.matchesDrawn = 0; this.competitionPoints = 0;
    }
    /** Returns the team's official name.
     * @return The team's official name. */
    public String getOfficialName(){
        return officialName;
    }
    /** Plays a match for a team. A team wins if it has more goals for
     * than against, loses if it has less goals for than against, and
     * draws if the goals are equal. Teams are awarded 3 competition
     * points for a win, 1 point for a draw and 0 points for a loss.
     * Other statistics are updated sensibly.
     * @param goalsFor The number of goals scored by the team.
     * @param goalsAgainst The number of goals conceded by the team. */
    public void playMatch(int goalsFor, int goalsAgainst) {
        goalsScoredSeason += goalsFor;
        goalsConcededSeason += goalsAgainst;
        if (goalsFor > goalsAgainst) {
            matchesWon++; competitionPoints +=3;
        } else if (goalsFor < goalsAgainst) {
            matchesLost++;
        } else {
            matchesDrawn++; competitionPoints++;
        }
    }
    /** Compares one team to another team.
     * @param other The other team
     * @return a positive number if the other team has more points than this
     * team, a negative number if this team has more points than the other team, * otherwise 0. */
    public int compareTo(SoccerTeam other){
        if(other.competitionPoints > this.competitionPoints){
            return -1;
        } else if(other.competitionPoints < this.competitionPoints){
            return 1;
        } else return 0;
    }
}
