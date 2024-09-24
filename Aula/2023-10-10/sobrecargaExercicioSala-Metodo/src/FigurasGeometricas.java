
public class FigurasGeometricas {
    private double xc, yc, raio, base, altura, lado;

    public FigurasGeometricas() {

    }

    public void setXc(double xc) {
        this.xc = xc;
    }

    public void setYc(double yc) {
        this.yc = yc;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getXc() {
        return xc;
    }

    public double getYc() {
        return yc;
    }

    public double getRaio() {
        return raio;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado() {
        return lado;
    }

    public double area(double lado) {
        return lado * lado;
    }

    public double area(double base, double altura) {
        return (base * altura) / 2;
    }

    public double area(double xc, double yx, double raio) {
        return Math.PI * raio * raio;
    }

    public String exibe(double lado) {
        return "Dados do Quadrado:\n- Lado: " + String.format("%.2f", lado) + " u.a.";
    }

    public String exibe(double xc, double yc, double raio) {
        return "Dados do Círculo:\n- Raio: " + String.format("%.2f", raio) + " u.a.\n- Centro: ("
                + String.format("%.2f", xc)
                + " ; " + String.format("%.2f", yc) + ")";
    }

    public String exibe(double base, double altura) {
        return "Dados do Triângulo:\n- Base: " + String.format("%.2f", base) + " u.a.\n- Altura: "
                + String.format("%.2f", altura) + " u.a.";
    }
}
