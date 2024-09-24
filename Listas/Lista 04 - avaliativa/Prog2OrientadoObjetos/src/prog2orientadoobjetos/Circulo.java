package prog2orientadoobjetos;

public class Circulo {
    double xc, yc, raio;
    
    public Circulo(double xc, double yc, double raio){
        this.xc=xc;
        this.yc=yc;
        this.raio=raio;
    }
    
    public double comprimento(){
        return 2*Math.PI*raio;
    }
    
    public double area(){
        return Math.PI*Math.pow(raio,2);
    }
    
    public String exibe(){
        return "     Dados do Círculo\n\nCENTRO = ( "+xc+" , "+yc+" )"
                +"\nRAIO = "+raio;
    }
}
