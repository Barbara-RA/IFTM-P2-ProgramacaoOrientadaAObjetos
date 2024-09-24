import javax.swing.JOptionPane;

public class App {

    public static void menu() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual a figura geomética que você quer calcular: \n1-Quadrado\n2-Trinangulo\n3-Círculo\n4-SAIR"));
            switch (opcao) {
                case 1:
                    FigurasGeometricas figura = le(1);

                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do quadrado = " + String.format("%.2f", figura.area(opcao)), "SAÍDA",
                                        1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        String.format(figura.exibe(opcao)),
                                        "SAÍDA", 1);
                                break;
                        }
                    } while (opcao != 3);

                    break;

                case 2:
                    figura = le(2);

                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do triangulo = " + String.format("%.2f", figura.area(opcao, opcao)),
                                        "SAÍDA", 1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                         String.format( figura.exibe(opcao, opcao)),
                                        "SAÍDA", 1);
                                break;
                        }
                    } while (opcao != 3);
                    break;

                case 3:
                    figura = le(3);
                    do {
                        opcao = Integer.parseInt(JOptionPane
                                .showInputDialog("Escolha: \n1-Cacular Área\n2-Exibir dados da Figura\n3-SAIR"));
                        switch (opcao) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Área do círculo = " + String.format("%.2f", figura.area(opcao, opcao, opcao)), "SAÍDA",
                                        1);

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        String.format( figura.exibe(opcao, opcao, opcao)), "SAÍDA",
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
                FigurasGeometricas quadrado = new FigurasGeometricas();
                return new FigurasGeometricas();

            case 2:
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Tamanho do altura do Triangulo:"));
                double base = Double.parseDouble(JOptionPane.showInputDialog("Tamanho da base do Triangulo:"));
                FigurasGeometricas triangulo = new FigurasGeometricas();
                return triangulo;

            case 3:
                double xc = Double.parseDouble(JOptionPane.showInputDialog("Coordenada XC:"));
                double yc = Double.parseDouble(JOptionPane.showInputDialog("Coordenada YC:"));
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                FigurasGeometricas circulo = new FigurasGeometricas();
                return circulo;
            default:
                return null;
        }

    }

    public static void main(String[] args) throws Exception {
        menu();

    }
}
