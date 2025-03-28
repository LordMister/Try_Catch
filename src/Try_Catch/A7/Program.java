package Try_Catch.A7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Media media = new Media();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        media.setNota1(sc.nextDouble());
        System.out.print("Nota 2: ");
        media.setNota2(sc.nextDouble());
        System.out.print("Nota 3: ");
        media.setNota3(sc.nextDouble());

        media.verif();
        sc.close();
    }
}
