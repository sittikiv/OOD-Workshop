public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (this.player1Name.equals(playerName)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty" };
        String playerWin = this.player1Name;
        if (m_score1 < m_score2) playerWin = this.player2Name;
        int diffScore = Math.abs(m_score1 - m_score2);
        // All
        if (m_score1 == m_score2 && m_score1 <= 2) {
            return scoreResults[m_score1] + "-All";
        }
        // Deuce
        if (m_score1 == m_score2 && m_score1 > 2) {
            return "Deuce";
        }
        // Advantage
        if ((m_score1 >= 4 || m_score2 >= 4) && diffScore < 2) {
            return "Advantage " + playerWin;
        }
        // Win
        if ((m_score1 >= 4 || m_score2 >= 4) && diffScore >= 2) {
            return "Win for " + playerWin;
        }
        // Default
        return scoreResults[m_score1] + "-" + scoreResults[m_score2];
    }
}
