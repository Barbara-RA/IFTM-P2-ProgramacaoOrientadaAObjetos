package classes;

import java.util.ArrayList;
import java.util.List;

public class GameLibrary {
    private List<Game> games;

    public GameLibrary() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public List<Game> getGames() {
        return games;
    }

    public void displayGames() {
        System.out.println("Biblioteca de Jogos:");
        for (Game game : games) {
            System.out.println(game);
        }
        System.out.println("----------------------------");
    }

    public void displayAvailableGames() {
        for (Game game : games) {
            if (!game.isRented()) {
                System.out.println(game);
            }
        }
        System.out.println("----------------------------");
    }

    public void displayRentedGames() {
        for (Game game : games) {
            if (game.isRented()) {
                System.out.println(game);
            }
        }
        System.out.println("----------------------------");
    }
}
