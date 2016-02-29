package Projekt.Logic;

public abstract class BoardPlayer extends Player {

    protected char mark;

    public BoardPlayer(String name, int score, char mark) {
        super(name, score);
        this.mark = mark;
    }

    public void setMark(char mark){
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }
}
