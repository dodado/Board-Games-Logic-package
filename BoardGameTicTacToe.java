package Projekt.Logic;

public class BoardGameTicTacToe implements BoardGame{

    private int playerOnMove;
    private int[][] board = new int[3][3];

    BoardPlayer player1;
    BoardPlayer player2;
    BoardPlayer activePlayer;

    int currentRow;
    int currentCol;

    public BoardGameTicTacToe(int playerOnMove) {
        this.playerOnMove = playerOnMove;
    }

    public boolean checkIfThereIsAWinner(char mark) {
        if(board[currentRow][0] == mark
                && board[currentRow][1] == mark
                && board[currentRow][2] == mark
                || board[0][currentCol] == mark
                && board[1][currentCol] == mark
                && board[2][currentCol] == mark
                || currentRow == currentCol
                && board[0][0] == mark
                && board[1][1] == mark
                && board[2][2] == mark
                || currentRow + currentCol == 2
                && board[0][2] == mark
                && board[1][1] == mark
                && board[2][0] == mark) {
            return true;
        }
        return false;

    }

    private boolean legalMove(int currentRow, int currentCol){
        if(board[currentRow][currentCol] == 0){
            return true;
        }
        return false;
    }

    public boolean placeMove(int move){
        setCurrentCol(move);
        setCurrentRow(move);
        placeMove();
        return true;
    }

    public Player getWinner(){
        if(checkIfThereIsAWinner(player1.getMark())){
            return player1;
        } else if(checkIfThereIsAWinner(player2.getMark())){
            return player2;
        }
        return null;
    }

    public boolean hasMovesLeft(){
            if (board.length == 9) {
                return false;
            }
        return true;
    }

    public String getBoardHelp(){
        return ("unesite broj polja na koje zelite staviti svoj znak, kao da gledate na mobitel. \n" + toString());
    }

    public Player[] getBoardStatus(){
        Player[] players = new Player[getNumberOfPlayers()];
        players[0] = player1;
        players[1] = player2;
        return players;
    }

    public Player getActivePlayer(){
        if(activePlayer == player1){
            return player2;
        }
        return player1;
    }

    public String getRules(){
        return "Unesite svoj znak na polje brojeva, ko prvi nanize 3 znaka u jedan od 8 smjerova pobjedjuje.";
    }

    public int addPlayer(BoardPlayer player){
        if (player1 == null) {
            player1 = player;
            return 1;
        }
        player2 = player;
        return 2;
    }

    @Override
    public void startGame() {
        playerOnMove = 1;
        placeMove();
    }


    public void resetGame(int PlayerNo){
        placeMove();
        this.playerOnMove = PlayerNo;
    }

    public Player getPlayer(int PlayerNo){
        if(PlayerNo == 1){
            return player1;
        }
        return player2;
    }

    @Override
    public int getNumberOfPlayers() {
        return 2;
    }

    public void getMark() {
        switch (playerOnMove) {
            case 1:  System.out.print(" X "); break;
            case 2:  System.out.print(" O "); break;
            case 0:  System.out.print("   "); break;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++ ) {
                if(board[i][j] == ' ') {
                    sb.append(" - ");
                } else {
                    sb.append(" " + board[i][j]);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void placeMove() {
        if(legalMove(currentRow, currentCol)){
            board[currentRow][currentCol] = activePlayer.getMark();
        }
    }

    public void traverseActivePlayer(){
        if (player1.equals(playerOnMove)) {
            activePlayer = player2;
        } else {
            activePlayer = player1;
        }
    }

    public class TicTacToeDroid extends BoardPlayerDroid{

        public TicTacToeDroid(String name, int score, char mark) {
            super(name, score, mark);
        }

        @Override
        public int getMove() {
            return (int)Math.random() * 9;
        }
    }

    public void setCurrentRow(int move){
        switch(move){
            case 1: this.currentRow = 0; break;
            case 2: this.currentRow = 0; break;
            case 3: this.currentRow = 0; break;
            case 4: this.currentRow = 1; break;
            case 5: this.currentRow = 1; break;
            case 6: this.currentRow = 1; break;
            case 7: this.currentRow = 2; break;
            case 8: this.currentRow = 2; break;
            case 9: this.currentRow = 2; break;
        }
    }

    public void setCurrentCol(int move){
        switch(move){
            case 1: this.currentCol = 0; break;
            case 2: this.currentCol = 1; break;
            case 3: this.currentCol = 2; break;
            case 4: this.currentCol = 0; break;
            case 5: this.currentCol = 1; break;
            case 6: this.currentCol = 2; break;
            case 7: this.currentCol = 0; break;
            case 8: this.currentCol = 1; break;
            case 9: this.currentCol = 2; break;
        }
    }

}
