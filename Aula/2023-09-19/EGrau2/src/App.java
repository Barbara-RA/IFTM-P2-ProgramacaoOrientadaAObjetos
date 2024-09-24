import javax.swing.JOptionPane;

public class App {

    public static double le(int num) {
        double parametro = 0.1;
        switch (num) {
            case 1:
                parametro = Double.parseDouble(
                        JOptionPane.showInputDialog("Digite um valor real para A que seja diferente de zero:"));
                break;
            case 2:
                parametro = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real para B:"));
                break;
            case 3:
                parametro = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real para C:"));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro", "SAIDA", 1);
                break;
        }
        return parametro;
    }

    public static void main(String[] args) throws Exception {
        int loop = 1;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        while (loop == 1) {
            for (int i = 1; i <= 3; i++) {
                if (i == 1) {
                    a = le(i);
                    while (a == 0.0) {
                        a = le(i);
                    }
                } else if (i == 2) {
                    b = le(i);
                } else {
                    c = le(i);
                }
            }
            EGrau2 equac = new EGrau2(a,b,c);
            if (equac.verificaDelta()==false) {
                JOptionPane.showMessageDialog(null, "Não existem raízes reais", "SAIDA", 1);
                loop = Integer.parseInt(JOptionPane.showInputDialog("Digite \"1\" para continuar a calcular:"));
            } else {
                double x1 = equac.calculaX1();
                double x2 = equac.calculaX2();
                JOptionPane.showMessageDialog(null, equac.exibe(x1, x2), "Resultado", 1);
                loop = Integer.parseInt(JOptionPane.showInputDialog("Digite \"1\" para continuar a calcular:"));
            }
        }
    }
}
