public class Especial {

    private float limite;
    private int tempo;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Especial() {
    }

    public Especial(float limite, int tempo) {
        this.limite = limite;
        this.tempo = tempo;
    }

    public float defineTaxacao(float saldo) {
        if (tempo < 12) {
            return 0.002f;
        } else if (tempo >= 12 && tempo <= 23) {
            if (saldo <= 0) {
                return 0.002f;
            } else {
                return 0.0015f;
            }
        } else {
            if (saldo <= 0) {
                return 0.0015f;
            } else {
                return 0.001f;
            }
        }
    }
}

