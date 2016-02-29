package Projekt.Logic;

public enum BoardGameType {

    REVERSI("Reversi"),
    TICTACTOE( "TicTacToe"),
    CONNECTFOUR("ConnectFour"), ;

    private String ime;

    BoardGameType(String ime) {
        this.ime = ime;
    }

}
