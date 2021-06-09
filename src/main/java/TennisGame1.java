
public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
            score = getScore1Text(m_score1);
           /* switch (m_score1)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                default:
                        score = "Deuce";
                    break;
                
            }*/
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
               // score += (i ==1)? "" : "-";
               //  tempScore = (i ==1)? m_score1 : m_score2;

                if (i==1) tempScore = m_score1;///  Fifteen-All-Love
                else {
                    score+="-";
                    tempScore = m_score2; //  Fifteen-All-Love
                }
                //score+="-";
                score+=addTempScore(tempScore);

                /*switch(tempScore) // score 1 o score 2
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }*/
            }
        }
        return score;
    }

    public String addTempScore(int tempScore){
        switch(tempScore) // score 1 o score 2
        {
            case 0:
                return "Love";
                //break;
            case 1:
                return "Fifteen";
                //break;
            case 2:
                return "Thirty";
               // break;
            case 3:
                return "Forty";
               // break;
            default:
                return "";
        }
    }

    public String getScore1Text(int m_score1){
        switch (m_score1)
        {
            case 0:
                return "Love-All";
                //break;
            case 1:
                return "Fifteen-All";
               // break;
            case 2:
                return "Thirty-All";
               // break;
            default:
                return "Deuce";
               // break;
        }
    }
}
