package classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<RentalRecord> rentalRecords;

    public Customer(String name) {
        this.name = name;
        this.rentalRecords = new ArrayList<>();
    }

    public void rentGame(Game game) {
        try {
            if (game.isRented()) {
                throw new RentalException("Jogo já alugado: " + game.getTitle());
            }

            Rental rental = new Rental(this, game);
            RentalRecord rentalRecord = new RentalRecord(rental);
            rentalRecords.add(rentalRecord);

            // Marca o jogo como alugado
            game.rent();
        } catch (RentalException e) {
            System.out.println("Erro ao alugar jogo: " + e.getMessage());
        }
    }

    public void returnGame(Game game) {
        for (RentalRecord rentalRecord : rentalRecords) {
            if (rentalRecord.getRental().getGame() == game) {
                rentalRecord.getRental().getGame().returnGame(); // Marcar o jogo como devolvido
                rentalRecord.markAsReturned();
                return;
            }
        }
    }

    public void displayRentalRecords() {
        System.out.println("Registros de Aluguel para " + name + ":");
        for (RentalRecord rentalRecord : rentalRecords) {
            rentalRecord.displayRentalRecord();
        }
    }

    public String getName() {
        return name;
    }
}
