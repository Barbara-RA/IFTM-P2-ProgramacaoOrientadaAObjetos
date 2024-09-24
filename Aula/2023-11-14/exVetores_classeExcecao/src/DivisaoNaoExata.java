public class DivisaoNaoExata extends Exception {
    private int num,den;

    public DivisaoNaoExata(int num, int den) {
        super();
        // no construtor está chamando o contrutor da super classe, é chamando de herança
        this.num = num;
        this.den = den;
    }

    @Override

    public String toString() {
        return "Resultado de "+num+"/"+den+" não é um inteiro";
    }
    
}
