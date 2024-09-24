import javax.swing.JOptionPane;

public class App {

    public static void menu() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual a figura geomética que você quer calcular: \n1-Quadrado\n2-Trinangulo\n3-Círculo\n4-SAIR"));
            switch (opcao) {
                case 1:
                    FigurasGeometricas quadrado = le(1);

                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do quadrado = " + String.format("%.2f", quadrado.areaQuadrado()), "SAÍDA",
                                        1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        String.format(quadrado.exibeQuadrado()),
                                        "SAÍDA", 1);
                                break;
                        }
                    } while (opcao != 3);

                    break;

                case 2:
                    FigurasGeometricas triangulo = le(2);

                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do triangulo = " + String.format("%.2f", triangulo.areaTriangulo()),
                                        "SAÍDA", 1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                         String.format( triangulo.exibeTriangulo()),
                                        "SAÍDA", 1);
                                break;
                        }
                    } while (opcao != 3);
                    break;

                case 3:
                    FigurasGeometricas circulo = le(3);
                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do círculo = " + String.format("%.2f", circulo.areaCirculo()), "SAÍDA",
                                        1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        String.format( circulo.exibeCirculo()), "SAÍDA",
                                        1);
                                break;
                        }
                    } while (opcao != 3);

                    break;
            }

        } while (opcao != 4);

    }

    public static FigurasGeometricas le(int op) {

        switch (op) {
            case 1:
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Tamanho do lado do Quadrado:"));
                FigurasGeometricas quadrado = new FigurasGeometricas(lado);
                return quadrado;

            case 2:
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Tamanho do altura do Triangulo:"));
                double base = Double.parseDouble(JOptionPane.showInputDialog("Tamanho da base do Triangulo:"));
                FigurasGeometricas triangulo = new FigurasGeometricas(base, altura);
                return triangulo;

            case 3:
                double xc = Double.parseDouble(JOptionPane.showInputDialog("Coordenada XC:"));
                double yc = Double.parseDouble(JOptionPane.showInputDialog("Coordenada YC:"));
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                FigurasGeometricas circulo = new FigurasGeometricas(xc, yc, raio);
                return circulo;
            default:
                return null;
        }

    }

    public static void main(String[] args) throws Exception {
        menu();

    }
}
