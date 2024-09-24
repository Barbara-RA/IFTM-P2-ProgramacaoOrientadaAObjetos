public class Restricoes extends Exception {
    Restricoes(){
        super();
    };

    @Override
    public String toString() {
        return "Saldo insuficiente";
    }

}
