public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        this.board=new int[playerCount];
        for (int i=0; i<board.length; i++)
        {
            board[i]=  (int)(10*Math.random() +1);
        }
    }

    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer= currentPlayer;
        int numToDistribute= board[currentPlayer];
        board[currentPlayer] =0;

        while(numToDistribute > 0)
        {
            nextPlayer= (nextPlayer +1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public int gameOver()
    {
        for(int i=0; i<board.length; i++)
        {
            if (board[i] == 0)
            {
                return i;
            }
            else
            {
                return -1;
            }
        }
         //else
        {
            return -1;
        }
    }

}
