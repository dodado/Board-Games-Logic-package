package Projekt.Logic;

public class PlayerInitException extends ExceptionInInitializerError{

    private String message;

    public PlayerInitException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
