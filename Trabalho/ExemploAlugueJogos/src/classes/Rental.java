package classes;

import java.util.Date;

public class Rental {
    private Customer customer;
    private Game game;
    private Date rentalDate;

    public Rental(Customer customer, Game game) {
        this.customer = customer;
        this.game = game;
        this.rentalDate = new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Game getGame() {
        return game;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    @Override
    public String toString() {
        return "Cliente: " + customer.getName() +
                ", Jogo: " + game.getTitle() +
                ", Console: " + game.getConsole() +
                ", Data de Aluguel: " + rentalDate;
    }
}
