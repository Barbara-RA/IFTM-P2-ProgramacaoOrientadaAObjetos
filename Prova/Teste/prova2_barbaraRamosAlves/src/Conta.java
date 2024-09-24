// import javax.swing.JOptionPane;

// public class Conta {
//     private int numero;
//     private Cliente correntista;
//     private float saldo;

//     public Conta() {
//     }

//     public Conta(int numero, Cliente correntista, float saldo) {
//         this.numero = numero;
//         this.correntista = correntista;
//         this.saldo = saldo;
//     }

//     public int getNumero() {
//         return numero;
//     }

//     public void setNumero(int numero) {
//         this.numero = numero;
//     }

//     public Cliente getCorrentista() {
//         return correntista;
//     }

//     public void setCorrentista(Cliente correntista) {
//         this.correntista = correntista;
//     }

//     public float getSaldo() {
//         return saldo;
//     }

//     public void setSaldo(float saldo) {
//         this.saldo = saldo;
//     }

//     public void depositar(float valor) {
//         this.setSaldo(this.getSaldo() + valor);
//     }

//     public boolean sacar(float valor) {
//         try {
//             if (valor <= this.getSaldo()) {
//                 float x = this.getSaldo() - valor;
//                 this.setSaldo(x);
//                 return true;
//             } else
//                 throw new Restricao("Saldo Insuficiente para operação de SAQUE");
//         } catch (Restricao r) {
//             JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE SALDO", 1);
//         }
//         return false;
//     }

//     public boolean movimentar(float valor, int operacao) {
//         if (operacao == 0)
//             return this.sacar(valor);
//         else
//             this.depositar(valor);
//         return true;
//     }

//     public boolean movimentar(float valor, int operacao, Especial especial) {
//         if (operacao == 0)
//             return this.sacar(valor, especial);
//         else
//             this.depositar(valor, especial);
//         return true;
//     }

//     public void depositar(float valor, Especial especial) {
//         float taxa = especial.defineTaxacao(this.getSaldo());
//         float valorDescontado = valor - (valor * taxa);
//         this.setSaldo(this.getSaldo() + valorDescontado);
//     }

//     public boolean sacar(float valor, Especial especial) {
//         try {
//             float taxa = especial.defineTaxacao(this.getSaldo());
//             float valorComTaxa = valor + (valor * taxa);

//             if (valorComTaxa <= this.getSaldo()) {
//                 float novoSaldo = this.getSaldo() - valorComTaxa;
//                 this.setSaldo(novoSaldo);
//                 return true;
//             } else {
//                 throw new Restricao("Saldo Insuficiente para operação de SAQUE");
//             }
//         } catch (Restricao r) {
//             JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE SALDO", 1);
//         }
//         return false;
//     }
// }

import javax.swing.JOptionPane;
import java.math.BigDecimal;

public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public Conta() {
    }

    public Conta(int numero, Cliente correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        try {
            float taxa = 0.005f; // Taxa de 0.5% sobre o valor do saque

            if (valor + (valor * taxa) <= this.saldo) {
                float novoSaldo = this.saldo - (valor + (valor * taxa));
                this.saldo = novoSaldo;
                return true;
            } else {
                throw new Restricao("Saldo Insuficiente para operação de SAQUE");
            }
        } catch (Restricao r) {
            JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE SALDO", 1);
            return false;
        }
    }

    public void depositar(float valor, Especial especial) {
        float taxa = 0.0f;
        
        if (especial.getLimite() > 0.0f) {
            taxa = 0.005f; // Taxa de 0.05% sobre o valor do depósito
        }

        float valorDescontado = valor - (valor * taxa);
        this.saldo += valorDescontado;
    }

    public boolean sacar(float valor, Especial especial) {
        try {
            float taxa = especial.defineTaxacao(this.saldo);

            if (valor + (valor * taxa) <= this.saldo) {
                float novoSaldo = this.saldo - (valor + (valor * taxa));
                this.saldo = novoSaldo;
                return true;
            } else {
                throw new Restricao("Saldo Insuficiente para operação de SAQUE");
            }
        } catch (Restricao r) {
            JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE SALDO", 1);
            return false;
        }
    }

    public boolean movimentar(float valor, int operacao) {
        if (operacao == 0)
            return this.sacar(valor);
        else
            this.depositar(valor);
        return true;
    }

    public boolean movimentar(float valor, int operacao, Especial especial) {
        if (operacao == 0)
            return this.sacar(valor, especial);
        else
            this.depositar(valor, especial);
        return true;
    }
}
