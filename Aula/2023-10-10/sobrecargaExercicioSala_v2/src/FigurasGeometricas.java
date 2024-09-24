public class FigurasGeometricas {
    
    public FigurasGeometricas() {

    }

    public double area(double lado){
        return lado*lado;
    }

    public double area(double xc, double yc, double raio){
        return Math.PI*(raio*raio);
    }
    
    public double area(double base, double altura){
        return (base*altura)/2;
    }

    public String exibe(double lado){
        return "QUADRADO\n Lado: "+String.format("%.2f", lado);
    }

    public String exibe(double xc, double yc, double raio){
        return "CIRCULO\n XC: "+xc+"\nYC: "+yc+"\nRaio: "+raio;
    }
    public String exibe(double base, double altura){
        return "TRIANGULO\n Base: "+base+"\nAltura: "+altura;
    }
    






}
