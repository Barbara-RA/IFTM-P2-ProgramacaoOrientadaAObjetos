import java.util.Scanner;

public class main {
    public static int le() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        return num;
    }

    public static void violacao() {
        System.out.println("Valor negativo é inválido");

    }

    public static int exibeParidade(int num) {
        int tipo = num % 2;
        return tipo;
    }

    public static void imprime(int num, String tipo) {
        System.out.printf("Valor " + num + " é " + tipo);
    }

    public static void main(String[] args){

        int num = le();

        if (num <= 0) {
            violacao();
        } else {
            if (exibeParidade(num) == 0) {
                imprime(num, "par");
            } else {
                imprime(num, "impar");
            }

        }
    }
}
