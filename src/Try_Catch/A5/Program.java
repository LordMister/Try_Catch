package Try_Catch.A5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Array acesso = new Array();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um índice: ");
        acesso.setIndice(sc.nextInt());

        acesso.verif();
        sc.close();
    }
}
