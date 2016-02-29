package Projekt.Logic;

public abstract class BoardGameFactory {

    public static BoardGame createGame(BoardGameType type){
        switch(type){
           case REVERSI:{
               BoardGame bg = new BoardGameReversi();
               return bg;
           }
           case TICTACTOE:{
               BoardGame bg = new BoardGameTicTacToe(1);
               return bg;
           }
           case CONNECTFOUR:{
               BoardGame bg = new BoardGameConnectFour(1);
               return bg;
           }
           default:{
               return null;
           }
        }
    }
}
