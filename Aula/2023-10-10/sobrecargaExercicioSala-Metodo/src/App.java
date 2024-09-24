import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static FigurasGeometricas le(int op) {
        switch (op) {
            case 1:
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado:"));
                FigurasGeometricas quadrado = new FigurasGeometricas();
                quadrado.setLado(lado);
                return quadrado;
            case 2:
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio:"));
                double xc = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição x do centro:"));
                double yc = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição y do centro:"));
                FigurasGeometricas circulo = new FigurasGeometricas();
                circulo.setXc(xc);
                circulo.setYc(yc);
                circulo.setRaio(raio);
                return circulo;
            case 3:
                double base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura:"));
                FigurasGeometricas triangulo = new FigurasGeometricas();
                triangulo.setBase(base);
                triangulo.setAltura(altura);
                return triangulo;
            default:
                return null;
        }

    }

    public static void menu() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha a figura: \n\n 1 - Quadrado\n 2 - Círculo\n 3 - Triângulo\n 4 - Sair \n\n\n DIGITE A SUA OPÇÃO:"));
            switch (op) {
                case 1:
                    FigurasGeometricas quadrado = le(1);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha uma opção: \n\n 1 - Área do Quadrado\n 2 - Dados do quadrado\n 3 - Retornar\n\n\n DIGITE A SUA OPÇÃO:"));
                        switch (op) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Área do quadrado = "
                                        + String.format("%.2f", quadrado.area(quadrado.getLado())), "SAÍDA", 1);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, quadrado.exibe(quadrado.getLado()), "SAÍDA", 1);
                                break;
                        }
                    } while (op != 3);
                    break;
                case 2:
                    FigurasGeometricas circulo = le(2);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha uma opção: \n\n 1 - Área do Circulo\n 2 - Dados do círculo\n 3 - Retornar\n\n\n DIGITE A SUA OPÇÃO:"));
                        switch (op) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Área do círculo = "
                                        + String.format("%.2f", circulo.area(circulo.getXc(),circulo.getYc(),circulo.getRaio())), "SAÍDA", 1);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, circulo.exibe(circulo.getXc(),circulo.getYc(),circulo.getRaio()), "SAÍDA", 1);
                                break;
                        }
                    } while (op != 3);
                    break;
                case 3:
                    FigurasGeometricas triangulo = le(3);
                    do {
                        op = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha uma opção: \n\n 1 - Área do Triângulo\n 2 - Dados do triângulo\n 3 - Retornar\n\n\n DIGITE A SUA OPÇÃO:"));
                        switch (op) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Área do triângulo = "
                                        + String.format("%.2f", triangulo.area(triangulo.getBase(),triangulo.getAltura())), "SAÍDA", 1);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, triangulo.exibe(triangulo.getBase(),triangulo.getAltura()), "SAÍDA", 1);
                                break;
                        }
                    } while (op != 3);
                    break;
            }
        } while (op != 4);
    }
}
