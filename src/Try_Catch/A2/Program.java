package Try_Catch.A2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Conversao conversao = new Conversao();

        System.out.print("Digite um número: ");
        conversao.setValor(sc.nextLine());

        conversao.converter();
    }
}
