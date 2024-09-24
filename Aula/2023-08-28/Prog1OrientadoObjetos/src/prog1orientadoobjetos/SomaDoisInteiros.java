package prog1orientadoobjetos;

public class SomaDoisInteiros {
    public int a, b;

    public SomaDoisInteiros(int x, int y){
        a = x;
        b = y;
    }
       
    public int soma(){
        return a+b;
    }   
    
    public String exibe(int s){
        return "A soma de "+a+" com "+b+" vale: "+s;
    }
}
