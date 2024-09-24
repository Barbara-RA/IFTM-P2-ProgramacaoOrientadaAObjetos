public class EGrau2 {
    public double a, b, c;

    public EGrau2(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double delta() {
        return ((b * b) - (4 * a * c));
    }

    public double calculaX1(double delta) {
        return ((-b + Math.sqrt(delta)) / (2 * a));
    }

    public double calculaX2(double delta) {
        return ((-b - Math.sqrt(delta)) / (2 * a));
    }

    public String exibe(double x1, double x2) {
        return "As raízes são:\nx1 = " + x1 + "\nx2 = " + x2;
    }
}
