public class EGrau2 {
    private double a, b, c;

    public EGrau2(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    private double delta() {
        return ((b * b) - (4 * a * c));
    }

    public boolean verificaDelta(){
        if(delta()<0)
            return false;
        else
            return true;
    }


    public double calculaX1() {
        return ((-b + Math.sqrt(delta())) / (2 * a));
    }

    public double calculaX2() {
        return ((-b - Math.sqrt(delta())) / (2 * a));
    }

    public String exibe(double x1, double x2) {
        return "As raízes são:\nx1 = " + x1 + "\nx2 = " + x2;
    }
}
