import java.util.Scanner;

public class jogo {
    static char mat[][] = new char[3][3];
    
    public static void main(String[] args) {
        int jogada = 0;
        boolean haJogo = true;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat[i][j] = 'T';
            }
        }

        do{
            int campo = interfaceUsuario(jogada);

            if(validacao(campo, jogada)){
                if(empate()){
                    haJogo = false;
                    exibeFim(jogada, false);
                }
                else{
                    if(vitoria()){
                        exibeFim(jogada, true);
                        haJogo = false;
                    }
                    else{
                        jogada++;
                    }
                }
                
            }
            else{
                restricao();
            }
        } while(haJogo);
        //interfaceUsuario();
    }
    
    public static int interfaceUsuario(int jogada){
        Scanner s = new Scanner(System.in);
        int num = 1;
        int matDemo[][] = new int[3][3];

        System.out.println("Tabuleiro Atual: ");

        System.out.println();
        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matDemo[i][j] = num;
                num++;
            }
        }

        for(int i=0; i<3; i++){
            System.out.printf("        ");
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.printf("              ");
            for(int j=0; j<3; j++){
                System.out.print(matDemo[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        if(jogada%2==0){
            System.out.println("Jogador \"X\" é a sua vez de jogar!");
        }else{
            System.out.println("Jogador \"O\" é a sua vez de jogar!");
        }

        System.out.println();
        System.out.println();

        System.out.println("Escolha uma posição: ");
        int posicao = s.nextInt();
        
        return posicao;

    }

    public static boolean validacao(int posicao, int jogada){
        if(posicao>=1 && posicao<=9){
            boolean valido = true;
            switch(posicao){
                case 1:
                    if(mat[0][0] == 'X' || mat[0][0] == 'O'){
                        valido = false;
                    }else{
                        mat[0][0] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 2:
                    if(mat[0][1] == 'X' || mat[0][1] == 'O'){
                        valido = false;
                    }else{
                        mat[0][1] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 3:
                    if(mat[0][2] == 'X' || mat[0][2] == 'O'){
                        valido = false;
                    }else{
                        mat[0][2] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 4:
                    if(mat[1][0] == 'X' || mat[1][0] == 'O'){
                        valido = false;
                    }else{
                        mat[1][0] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 5:
                    if(mat[1][1] == 'X' || mat[1][1] == 'O'){
                        valido = false;
                    }else{
                        mat[1][1] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 6:
                    if(mat[1][2] == 'X' || mat[1][2] == 'O'){
                        valido = false;
                    }else{
                        mat[1][2] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 7:
                    if(mat[2][0] == 'X' || mat[2][0] == 'O'){
                        valido = false;
                    }else{
                        mat[2][0] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 8:
                    if(mat[2][1] == 'X' || mat[2][1] == 'O'){
                        valido = false;
                    }else{
                        mat[2][1] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;
                case 9:
                    if(mat[2][2] == 'X' || mat[2][2] == 'O'){
                        valido = false;
                    }else{
                        mat[2][2] = jogada % 2 == 0 ? 'X' : 'O';
                    }
                    break;

            }

            return valido;
        }else{
            restricao();
            return false;
        }
    }

    public static void restricao(){
        System.out.println("Jogada inválida!");
    }

    public static boolean empate(){
        boolean vitoria = vitoria();
        boolean empate = true;
        if(!vitoria) {
            for(int i = 0;i<3;i++){
                for(int j = 0; j < 3; j++){
                    if(mat[i][j] != 'X' && mat[i][j] != 'O'){
                        empate = false;
                        break;
                    }
                }
            }
        }
        else{
            empate = false;
        }
        

        return empate;
    }

    public static boolean vitoria(){
        boolean ganhou = false;
        for(int i = 0;i<3 && !ganhou;i++){
            boolean todosX = true;
            boolean todosO = true;

            for(int j = 0; j < 3; j++){
                todosX = todosX && mat[i][j] == 'X';
                todosO = todosO && mat[i][j] == 'O';
            }

            if(todosX || todosO){
                ganhou = true;
            }
        }

        if(ganhou)
            return ganhou;

        for(int i = 0;i<3 && !ganhou;i++){
            boolean todosX = true;
            boolean todosO = true;

            for(int j = 0; j < 3; j++){
                todosX = todosX && mat[j][i] == 'X';
                todosO = todosO && mat[j][i] == 'O';
            }

            if(todosX || todosO){
                ganhou = true;
            }
        }
        
        if(ganhou)
            return ganhou;

        boolean diagonaPrincipal = mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X';
        diagonaPrincipal |= mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O';

        if(diagonaPrincipal)
            return true;

        boolean diagonaSecundaria = mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0] && mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X';
        diagonaSecundaria |= mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0] && mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O';

        if(diagonaSecundaria)
            return true;

        return false;
    }

    static void exibeFim(int jogada, boolean vitoria){
        if(vitoria){
            System.out.println((jogada % 2 == 0 ? 'X' : 'O') + " ganhou!!!");
        }
        else{
            System.out.println("VELHA");
        }
        System.out.println();
        System.out.println();

        for(int i=0; i<3; i++){
            System.out.printf("        ");
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
