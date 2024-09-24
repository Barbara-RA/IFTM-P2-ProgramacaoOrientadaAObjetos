public class App {
    public static void main(String[] args) throws Exception {
        int [] num={4,8,5,16,32,21,64,128,62,80,90};
        int [] den={2,0,4,8,0,2,4};

        for(int i=0;i<num.length;i++){
            try {
                System.out.println(num[i]+"/"+den[i]+"="+num[i]/den[i]);
            } catch (ArithmeticException divisaoZero) {
                System.out.println("Não é possível fazer divisão por zero");
            } catch(ArrayIndexOutOfBoundsException indice){
                System.out.println("Não existe indice(denominador) correspondente");
            }   
        }

        
    }
}
