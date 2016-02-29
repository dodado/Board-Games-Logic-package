package Projekt.Logic;

public interface BoardGame {

    int addPlayer(BoardPlayer player);

    void startGame();

    String getBoardHelp();

    boolean hasMovesLeft();

    Player getActivePlayer();

    boolean placeMove(int move);

    Player getWinner();

    Player[] getBoardStatus();

    void resetGame(int PlayerNo);

    Player getPlayer(int PlayerNo);

    int getNumberOfPlayers();

    String getRules();

}
