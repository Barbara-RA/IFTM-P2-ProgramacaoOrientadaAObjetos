package classes;

public class RentalRecord {
    private Rental rental;
    private boolean returned;

    public RentalRecord(Rental rental) {
        this.rental = rental;
        this.returned = false;
    }

    public Rental getRental() {
        return rental;
    }

    public void markAsReturned() {
        this.returned = true;
    }

    public boolean isReturned() {
        return returned;
    }

    public void displayRentalRecord() {
        System.out.println("Cliente: " + rental.getCustomer().getName());
        System.out.println("Jogo: " + rental.getGame().getTitle());
        System.out.println("Console: " + rental.getGame().getConsole());
        System.out.println("Data de Aluguel: " + rental.getRentalDate());
        System.out.println("----------------------------");
    }
}
