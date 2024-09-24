package prog2orientadoobjetos;

public class Cone {
    double raio;
    double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }

    public double area() {
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        return Math.PI * raio * (raio + geratriz);
    }

    public String exibe() {
        return "     Dados do Cone\n\nRAIO = " + raio + "\nALTURA = " + altura;
    }
}
