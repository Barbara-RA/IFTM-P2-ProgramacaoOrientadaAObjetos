import java.util.Scanner;

public class App {
     
    public static Pessoa lePessoa(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = s.nextLine();
        System.out.println("infome seu sexo 'F' para Feminino e 'M' para Masculino");
        char sexo = s.next().charAt(0);
        System.out.println("Informe sua idade (apenas números):");
        int idade = s.nextInt();
        
        Pessoa p= new Pessoa(nome, sexo, idade);
        s.close();
        return p;
        
    }

    // Retorna objeto. Cria o objeto pessoa e retona tudo para classe.
    public static Formacao leFormacao(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu nível de formção");
        String nivel = s.nextLine();
        System.out.println("Você já concluiu? ('s' - Sim|'n' - Não");
        boolean concluido= true;
        char resposta = s.next().charAt(0);
        if(resposta== 'n'){
            concluido=false;
        } 
        System.out.println("Qual nome de sua Instituição de ensino?");
        String instituicao = s.nextLine();
        System.out.println("Qual ano de formação?");
        int ano = s.nextInt();

        Formacao f= new Formacao(nivel, concluido, instituicao, ano);
        s.close();
        return f;

    }

    public static void main(String[] args) throws Exception {
        
       Pessoa p1 = lePessoa();
       Formacao form = leFormacao();
       
       System.out.println(p1.exibe()+" - " +form.exibe()); 
    }

}
