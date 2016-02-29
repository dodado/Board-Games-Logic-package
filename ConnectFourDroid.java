package Projekt.Logic;

/**
 * Created by dado on 17.02.16..
 */
public class ConnectFourDroid extends BoardPlayerDroid {
    public ConnectFourDroid(String name, int score, char mark) {
        super(name, score, mark);
    }

    public int getMove(){
        return (int)Math.random()*64;
    }
}
