package classes;

public class Game {
    private String title;
    private String console;
    private boolean rented;

    public Game(String title, String console) {
        this.title = title;
        this.console = console;
        this.rented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getConsole() {
        return console;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnGame() {
        rented = false;
    }

    @Override
    public String toString() {
        return "Título: " + title + " (Console: " + console + ")";
    }
}
