package Projekt.Logic;

public class BoardPlayerFactoryHuman implements BoardPlayerFactory {

    public BoardPlayer createPlayer(BoardGame game, String name, char mark, int score){
        BoardPlayerHuman bph = new BoardPlayerHuman(name, score, mark);
        return bph;
    }
}
