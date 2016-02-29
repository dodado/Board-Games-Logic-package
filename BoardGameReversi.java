package Projekt.Logic;

public class BoardGameReversi implements BoardGame{


    @Override
    public int addPlayer(BoardPlayer player) {
        return 1;
    }

    @Override
    public void startGame() {

    }

    @Override
    public String getBoardHelp() {
        return "idk";
    }

    @Override
    public boolean hasMovesLeft() {
        if(getWinner()==null){
            return true;
        }
        return false;
    }

    @Override
    public Player getActivePlayer() {
        return null;
    }

    @Override
    public boolean placeMove(int move) {
        return false;
    }

    @Override
    public Player getWinner() {
        return null;
    }

    @Override
    public Player[] getBoardStatus() {
        return new Player[0];
    }

    @Override
    public void resetGame(int PlayerNo) {

    }

    @Override
    public Player getPlayer(int PlayerNo) {
        return null;
    }

    @Override
    public int getNumberOfPlayers() {
        return 1;
    }

    @Override
    public String getRules() {
        return "nemam pojma";
    }

    public class ReversiDroid extends BoardPlayerDroid{

        public ReversiDroid(String name, int score, char mark) {
            super(name, score, mark);
        }

        @Override
        public int getMove() {
            return 0;
        }
    }
}
