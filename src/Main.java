import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora cldd = new Calculadora();
        CalculadoraAvancada cv = new CalculadoraAvancada();
        Scanner sc = new Scanner(System.in);
        int opcao = 7;
        double num1;
        double num2;

        while (opcao != 0) {

            System.out.println("1--Somar");
            System.out.println("2--Subtrair");
            System.out.println("3--Multiplicar");
            System.out.println("4--Divicir");
            System.out.println("5--Zerar");
            System.out.println("6--Pontecia");
            System.out.println("7--Zerar");
            System.out.println("8--Zerar");
            System.out.println("9--Exibir");
            System.out.println("0--Sair");
            System.out.print("Digite uma opcao: ");
            opcao = sc.nextInt();
            if(opcao == 0) sc.close();


            switch (opcao) {
                case 1:
                    System.out.print("Digita um numero: ");
                    num1 = sc.nextDouble();

                    System.out.print("Digita um numero: ");
                    num2 = sc.nextDouble();

                    cldd.somar(num1, num2);
                    break;

                case 2:
                    System.out.print("Digita um numero: ");
                    num1 = sc.nextDouble();

                    System.out.print("Digita um numero: ");
                    num2 = sc.nextDouble();

                    cldd.subtrair(num1, num2);
                    break;

                case 3:
                    System.out.print("Digita um numero: ");
                    num1 = sc.nextDouble();

                    System.out.print("Digita um numero: ");
                    num2 = sc.nextDouble();

                    cldd.multiplicar(num1, num2);
                    break;

                case 4:
                    System.out.print("Digita um numero: ");
                    num1 = sc.nextDouble();

                    System.out.print("Digita um numero: ");
                    num2 = sc.nextDouble();

                    cldd.dividir(num1, num2);
                    break;
                case 5:
                    cldd.zerar();
                    break;

                case 6:
                    System.out.print("Digita um numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Digita um numero: ");
                    num2 = sc.nextDouble();

                    cv.pontencia(num1, num2);

                case 9:
                    cldd.exibir();
                    break;
            }

            System.out.println("Resultado: " + cldd.obterResultado());
            System.out.println("Resultado: " + cv.exibirResultado());

            try {
                Thread.sleep(2000);  // Pausa por 2000 milissegundos (2 segundos)
            } catch (InterruptedException e) {
                System.out.println("A thread foi interrompida.");
            }
        }
    }
}