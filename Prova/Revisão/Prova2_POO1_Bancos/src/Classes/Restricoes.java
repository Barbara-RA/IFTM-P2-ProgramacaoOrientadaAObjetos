package Classes;

public class Restricoes extends Exception{
    private String texto;
    
    public Restricoes(String texto){
        super();
        this.texto = texto;
    }
    
    @Override
    public String toString(){
        return texto;
    }
    
}
