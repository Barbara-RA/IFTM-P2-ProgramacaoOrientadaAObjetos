public class FigurasGeometricas {
    private double xc, yc, raio, base, altura, lado;

    public FigurasGeometricas(double lado) {
        this.lado=lado;

    }


    public FigurasGeometricas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas(double xc, double yc, double raio) {
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;

    }

    public double areaQuadrado(){
        return lado*lado;
    }

    public double areaCirculo(){
        return Math.PI*(raio*raio);
    }
    
    public double areaTriangulo(){
        return (base*altura)/2;
    }

    public String exibeQuadrado(){
        return "QUADRADO\n Lado: "+String.format("%.2f", lado);
    }

    public String exibeCirculo(){
        return "CIRCULO\n XC: "+xc+"\nYC: "+yc+"\nRaio: "+raio;
    }
    public String exibeTriangulo(){
        return "TRIANGULO\n Base: "+base+"\nAltura: "+altura;
    }
    






}
