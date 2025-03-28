package Try_Catch.A9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Celsius converter = new Celsius();

        try {
            System.out.print("Digite a temperatura em Celsius: ");
            converter.setCelsius(sc.nextDouble());

            converter.verif();

        } catch (InputMismatchException e) {
            System.out.println("Erro: insira um número!");
        } finally {
            sc.close();
        }
    }
}
