package Projekt.Logic;

public class GameStartedException extends ExceptionInInitializerError{

    private String message;

    public GameStartedException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
