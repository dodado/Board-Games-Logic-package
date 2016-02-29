package Projekt.Logic;

public class BoardPlayerFactoryDroid implements BoardPlayerFactory{

    public BoardPlayer createPlayer(BoardGame game, String name, char mark, int score){
        if(game instanceof BoardGameTicTacToe){
            BoardGameTicTacToe.TicTacToeDroid ticTacToeDroid = ((BoardGameTicTacToe)game).new TicTacToeDroid(name, score, mark);
            return ticTacToeDroid;
        } else if(game instanceof BoardGameConnectFour){
            BoardGameConnectFour.ConnectFourDroid connectFourDroid = ((BoardGameConnectFour)game).new ConnectFourDroid(name, score, mark);
            return connectFourDroid;
        } else if(game instanceof BoardGameReversi){
            BoardGameReversi.ReversiDroid reversiDroid = ((BoardGameReversi)game).new ReversiDroid(name, score, mark);
            return reversiDroid;
        }
        return null;
    }
}
