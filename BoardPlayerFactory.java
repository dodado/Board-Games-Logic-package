package Projekt.Logic;

public interface BoardPlayerFactory {

    BoardPlayer createPlayer(BoardGame game, String name, char mark, int score);
}
