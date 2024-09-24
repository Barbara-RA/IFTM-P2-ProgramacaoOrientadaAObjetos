import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        double raio= leRaio();
        double xc= leCoordenada(1);
        double yc= leCoordenada(2);
        double altura = leAltura();

        // criar um doWhile para apresentação do menu

        System.out.println("********MENU*******");
        System.out.println("Escolha uma opção:\n 1-Circulo\n 2-Cilindro\\n 3-SAIR");
        int opcao = 1; //Ajustar
        int opcaoSub=1;
        switch(opcao){
            case 1:
                // escolha uma opção 1-Dados do Circulo 2-Área do Circulo 3-Comprimento do Circulo 4-VOLTAR MENU PRINCIPAL
                switch (opcaoSub){
                    case 1:
                    // funções exibe circulo
                    case 2:
                    // função area do método circulo
                    case 3:
                    // função comprimento do método circulo
                    case 4:
                    //break??
                    break;
                }
            case 2:
                // 1-Dados do Cilindro 2-Área do Cilindro 3-Volume do Cilindro 4-MENU PRINCIPAL
                switch (opcaoSub){
                        case 1:P
                        // funções exibe circulo
                        case 2:
                        // função area do método cilindro
                        case 3:
                        // função volume do método cilindro
                        case 4:
                        //break?? 
                        break;
                    }
            case 3:
            //Termina
            break;

        }
    }


    public static double leCoordenada(int x){
        double coordenada=0.1; 
        switch(x){
            case 1:
            coordenada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da abscissa (xc):"));
            
            case 2:
            coordenada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da abscissa (yc):"));
            case 3:
            JOptionPane.showMessageDialog(null, "Erro", "Saída", 1);
            break;
        }
        
       return coordenada;
    }

    public static double leRaio(){
        double raio= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo:"));
        return raio;
    }

    public static double leAltura(){
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do cilindro:"));
        return altura;
    }

    // public void String exibeTexto(){
        
    // }

}
