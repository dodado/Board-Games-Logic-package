package Projekt.Logic;

public abstract class BoardPlayerDroid extends BoardPlayer implements BoardDroid {
    public BoardPlayerDroid(String name, int score, char mark) {
        super(name, score, mark);
    }

    public abstract int getMove();
}
