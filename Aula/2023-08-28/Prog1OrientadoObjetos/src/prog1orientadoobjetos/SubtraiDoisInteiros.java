package prog1orientadoobjetos;

public class SubtraiDoisInteiros {
    public int a, b;
    
    public SubtraiDoisInteiros(int x, int y){
        a = x;
        b = y;
    }
    
    public int subtrai(){
        return a-b;
    }
    
    public String exibe(int s){
        return "A subtração de "+a+" com "+b+" vale: "+s;
    }
}
