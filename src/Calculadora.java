public class Calculadora {
    private double resultado;

    public Calculadora(){
        resultado = 0.0;
    }

    public void somar(double num1, double num2){
        resultado = num1 + num2;
    }

    public void subtrair(double num1, double num2){
        resultado = num1 - num2;
    }

    public void multiplicar(double num1, double num2){
        resultado = num1 * num2;
    }

    public void dividir(double num1, double num2){
        resultado = num1 / num2;
    }

    public void zerar(){
        resultado = 0.0;
    }

    public void exibir(){
        System.out.print("Resultado: " + resultado);
    }

    public double obterResultado(){
        return resultado;
    }

}
