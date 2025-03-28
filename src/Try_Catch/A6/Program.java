package Try_Catch.A6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        usuario.setNome(sc.nextLine());
        System.out.print("Digite sua Idade: ");
        usuario.setIdade(sc.nextInt());

        usuario.verif();
        sc.close();
    }
}
