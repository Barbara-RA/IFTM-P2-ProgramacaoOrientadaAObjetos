package prog2orientadoobjetos;

public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public String exibe() {
        return "Dados da Esfera\n\nRAIO = " + raio;
    }
}
