package Try_Catch.A8;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Idade idade = new Idade();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade.setIdade(sc.nextInt());

        idade.verif();
        sc.close();
    }
    }
