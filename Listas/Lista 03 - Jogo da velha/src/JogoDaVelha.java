import java.util.Scanner;

public class JogoDaVelha {
    static char tabuleiro[][] = new char[3][3];
    
    public static void main(String[] args) {
        int jogada = 0;
        boolean haJogo = true;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }

        do {
            int posicao = receberPosicao(jogada);

            if(validarJogada(posicao, jogada)){
                if(verificarEmpate()){
                    haJogo = false;
                    exibirResultado(jogada, false);
                }
                else{
                    if(verificarVitoria()){
                        exibirResultado(jogada, true);
                        haJogo = false;
                    }
                    else{
                        jogada++;
                    }
                }
            }
            else{
                exibirJogadaInvalida();
            }
        } while(haJogo);
    }
    
    public static int receberPosicao(int jogada){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tabuleiro Atual: \n");

        int num = 1;
        int[][] matDemo = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matDemo[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.print("        ");
            for(int j = 0; j < 3; j++){
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.print("              ");
            for(int j = 0; j < 3; j++){
                System.out.print(matDemo[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n");

        if(jogada % 2 == 0){
            System.out.println("Jogador \"X\", é a sua vez de jogar!");
        } else {
            System.out.println("Jogador \"O\", é a sua vez de jogar!");
        }

        System.out.println("\n");

        System.out.println("Escolha uma posição: ");
        int posicao = scanner.nextInt();
        
        return posicao;
    }

    public static boolean validarJogada(int posicao, int jogada){
        if(posicao >= 1 && posicao <= 9){
            int linha = (posicao - 1) / 3;
            int coluna = (posicao - 1) % 3;

            if(tabuleiro[linha][coluna] == ' '){
                tabuleiro[linha][coluna] = (jogada % 2 == 0) ? 'X' : 'O';
                return true;
            } else {
                return false;
            }
        } else {
            exibirJogadaInvalida();
            return false;
        }
    }

    public static void exibirJogadaInvalida(){
        System.out.println("Jogada inválida!");
    }

    public static boolean verificarEmpate(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean verificarVitoria(){
        for(int i = 0; i < 3; i++){
            if(tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]){
                return true;
            }
            if(tabuleiro[0][i] != ' ' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]){
                return true;
            }
        }
        if(tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]){
            return true;
        }
        return tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0];
    }

    static void exibirResultado(int jogada, boolean vitoria){
        System.out.println();
        System.out.println();

        if(vitoria){
            char jogador = (jogada % 2 == 0) ? 'X' : 'O';
            System.out.println("Jogador \"" + jogador + "\" ganhou!!!");
        }
        else{
            System.out.println("Empate (VELHA)!");
        }

        System.out.println("\nTabuleiro final: \n");

        for(int i = 0; i < 3; i++){
            System.out.print("        ");
            for(int j = 0; j < 3; j++){
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
