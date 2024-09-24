import javax.swing.JOptionPane;

public class App {

    
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
        char resp;
        
        do {
            x1=leCoordenada(1);
            y1=leCoordenada(2);
            x2=leCoordenada(3);
            y2=leCoordenada(4);

            if(Validacao.valida(x1, y1, x2, y2)==true){
                Retas reta = new Retas(x1, y1, x2, y2);
                comprimento = reta.comprimento();
                JOptionPane.showMessageDialog(null, reta.exibe()+"\nComprimento: "+comprimento+"\nHá "+Retas.contador+" reta(as)", "Saída", 1);
            };
            
            resp = JOptionPane.showInputDialog("Deseja inserir nova reta ('S'/'N')").charAt(0);
        } while (resp=='s'|| resp=='S');
        

    }
}
