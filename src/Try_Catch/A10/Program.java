package Try_Catch.A10;

import java.util.Scanner;

import static Try_Catch.A10.CalculadorFatorial.calcularFatorial;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número para calcular o fatorial: ");
            int numero = sc.nextInt();

            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);

        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
