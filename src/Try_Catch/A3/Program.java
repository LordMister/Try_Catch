package Try_Catch.A3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Raiz raiz = new Raiz();

       Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        raiz.setNumero(sc.nextDouble());


        raiz.verif();

        sc.close();
    }
}
