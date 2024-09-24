import java.util.Scanner;

public class App {

    public static JogadorDeFutrbol leDados(){
        Scanner s = new Scanner(System.in);
        System.out.println("informe nome:");
        String nome = s.nextLine();

        System.out.println("informe a posição:");
        String posicao= s.nextLine();

        System.out.println("informe seu ano de nascimento:");
        int anoNascimento= s.nextInt();
        s.nextLine();

        System.out.println("informe sua nacionalidade:");
        String nacionalidade= s.nextLine();

        System.out.println("informe sua altura:");
        double altura= s.nextDouble();

        System.out.println("informe seu peso:");
        double peso= s.nextDouble();

        s.close();
        JogadorDeFutrbol jogador = new JogadorDeFutrbol(nome, posicao, anoNascimento, nacionalidade, altura, peso);
        return jogador;
    }


    public static String anoRestante(JogadorDeFutrbol jogador){
        int tempoFalta = 0;
        if(jogador.posicao.equalsIgnoreCase("atacante")|| (jogador.calculeIdade()<35)){
            tempoFalta= 35-jogador.calculeIdade();
    
        }else if(jogador.posicao.equalsIgnoreCase("defesa")|| (jogador.calculeIdade()<40)){
            tempoFalta= 40-jogador.calculeIdade();

        }else if(jogador.posicao.equalsIgnoreCase("meio campo")|| (jogador.calculeIdade()<38)){
            tempoFalta = 38-jogador.calculeIdade();
        }if(jogador.calculeIdade()>=40){
            return"O(A) jogador(a)"+jogador.getNome()+" já pode se aposentar ou deveria estar aposentado(a)";
        }
        return "Faltam "+tempoFalta+" anos para o jogador "+jogador.getNome()+" se aposentar";  
    }


    public static void main(String[] args) throws Exception {
       JogadorDeFutrbol jogador = leDados();
       System.out.println("\n\n\n\n"+jogador.exibe()); 
       System.out.println(anoRestante(jogador));
    }



}

// resposta da B: O sistema apresentou um erro tentou acessar a variável dentro da classe onde o atributo é privato.