public class Cilindro {
    public double altura;

    public Cilindro(double altura){
        this.altura=altura;
    }

    public double area(double areaBase, double Comprimento){
        return 2*areaBase+altura*Comprimento;
    }

    public double volume(double areaBase){
        return areaBase*altura;
    }
    
    public String exibe(double raio){
        return "**Cilindro** \n Raio: "+raio+" Altura: "+altura;
    }
}
