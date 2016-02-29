package Projekt.Logic;

public class GameInitException extends ExceptionInInitializerError {

    private String message;

    public GameInitException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
