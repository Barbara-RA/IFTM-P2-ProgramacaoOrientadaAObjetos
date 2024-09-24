import javax.swing.JOptionPane;

public class App {

    public static boolean valida(double x1,double y1,double x2, double y2){
        if((x1>=0)&(y1>=0)&(x2>=0)&(y2>=0)){
            return true;
        }else{
            return false;
        }
    }

    public static double leCoordenada(int cordenada){
        if(cordenada==1){
            return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x1"));
        } else  if(cordenada==2){
            return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y2"));
        }else  if(cordenada==3){
            return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x2"));
        }else{
            return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y2"));
        }
        
        
    }


    public static void main(String[] args) throws Exception {
        double x1, y1, x2, y2,comprimento;
        int contador=0;
        char resp;
        
        do {
            x1=leCoordenada(1);
            y1=leCoordenada(2);
            x2=leCoordenada(3);
            y2=leCoordenada(4);

            if(valida(x1, y1, x2, y2)==true){
                Retas reta = new Retas(x1, y1, x2, y2);
                comprimento = reta.comprimento();
                contador++;
                JOptionPane.showMessageDialog(null, reta.exibe()+"\nComprimento: "+comprimento+"\nHá "+contador+" reta(as)", "Saída", 1);
            };
            
            resp = JOptionPane.showInputDialog("Deseja inserir nova reta ('S'/'N')").charAt(0);
        } while (resp=='s'|| resp=='S');
        

    }
}
