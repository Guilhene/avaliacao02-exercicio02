public class CalculadoraAvancada extends Calculadora {

    private double estadoSalvo;
    double[] estadoAtual = new double[10];
    int posicao;


    public void pontencia(double expoente01, double expoente02) {
        estadoSalvo = Math.pow(expoente01, expoente02);
    }

    public void raiz(double expoente) {
        estadoSalvo = Math.pow(obterResultado(), expoente);
    }

    public void dividaoInteiro(int num) {
        estadoSalvo = obterResultado() / num;
    }

    public void inverterSinal() {
        estadoSalvo = -obterResultado();
    }

    public void salvarEstado() {
        for (int i = 0; i < this.estadoAtual.length; i++) {
            if (this.estadoAtual[i] != 10) {
                this.posicao += 1;
            }
        }
        this.estadoAtual[posicao] = estadoSalvo;
    }

    public void restaurarEstado() {
        int text = 0;
        for (int i = 0; i <= estadoAtual.length; i++) {
            System.out.println(text + "-Historico" + estadoAtual[i]);
            text++;
        }
        estadoAtual[0] = estadoSalvo;
    }

    public double exibirResultado(){
        return estadoSalvo;
    }
}

