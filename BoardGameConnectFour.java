package Projekt.Logic;

public class BoardGameConnectFour implements BoardGame {

    private Player[] player;
    private char board[] = new char[64];
    private boolean gameStarted;
    private int moveCounter;

    public BoardGameConnectFour(int playerOnMove) {
    }

    private boolean checkIfThereIsAWinner(){
        return true;
    }

    private boolean checkPositionRight(int x, int y){
        return true;
    }

    private boolean checkPositionLeft(int x, int y){
        return true;
    }

    private boolean legalMove(){
        return true;
    }

    public boolean placeMove(int move){
        this.board[move] = getMark(player.length);
        this.moveCounter ++;
        return true;
    }

    private int firstFree(){
        return 1;
    }

    public Player getWinner(){
        return player[1];
    }

    public boolean hasMovesLeft(){
        return true;
    }

    public String getBoardHelp(){
        return "";
    }

    public Player[] getBoardStatus(){
        return player;
    }

    public Player getActivePlayer(){
        if(moveCounter % 2 == 0){
            return player[0];
        }
        if(moveCounter % 2 == 1){
            return player[1];
        }
        return null;
    }

    public String getRules(){
        return "";
    }

    public int addPlayer(BoardPlayer player){
        if(this.player[0] == null){
            this.player[0] = player;
        }
        else{
            this.player[1] = player;
        }
        return this.player.length;
    }

    public void startGame(){
        this.gameStarted = true;
    }

    public void resetGame(int playerNo){
        this.gameStarted = true;
    }

    public Player getPlayer(int playerNo){
        return player[playerNo];
    }

    public int getNumberOfPlayers(){
        return 2;
    }

    private char getMark(int boardPosition){
        return getMark(boardPosition);
    }

    private void traverseActivePlayer(){

    }

    @Override
    public String toString() {
        return "BoardGameConnectFour{" +
                "playerOnMove=" + getActivePlayer() +
                ", board=" + board +
                ", gameStarted=" + gameStarted +
                '}';
    }

    public class ConnectFourDroid extends BoardPlayerDroid{

        public ConnectFourDroid(String name, int score, char mark) {
            super(name, score, mark);
        }

        @Override
        public int getMove() {
            return 0;
        }
    }
}
