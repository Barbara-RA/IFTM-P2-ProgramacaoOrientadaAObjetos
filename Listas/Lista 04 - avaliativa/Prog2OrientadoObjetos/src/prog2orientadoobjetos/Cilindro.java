package prog2orientadoobjetos;

public class Cilindro {
    double altura;
    
    public Cilindro(double altura){
       this.altura=altura;
    }
    
    public double area(double areaBase, double comprimento){
        return 2*areaBase + comprimento*altura;
    }
    
    public double volume(double areaBase){
        return areaBase*altura;
    }
    
    public String exibe(double raio){
        return "     Dados do Cilindro\n\nRAIO = "+raio+"\nALTURA = "+altura;
    }
}
