package Classes;

public class Restricao extends Exception{
    private String texto;
    
    public Restricao(String texto){
        super();
        this.texto = texto;
    }
    
    @Override
    public String toString(){
        return texto;
    }
}
