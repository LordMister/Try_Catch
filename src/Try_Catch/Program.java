package Try_Catch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Divisao divisao = new Divisao();

    Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        divisao.setValor(sc.nextDouble());
        System.out.println("Digite um valor 2: ");
        divisao.setValor1(sc.nextDouble());

       divisao.Operacao();
    }
}
