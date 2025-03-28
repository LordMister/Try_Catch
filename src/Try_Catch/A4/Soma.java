package Try_Catch.A4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    private int valor;
    private int valor2;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void Scam() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite 2 números: ");
            setValor(sc.nextInt());
            setValor2(sc.nextInt());

            int resultado = valor + valor2;
            System.out.println("A soma dos dois números é: " + resultado);


        }catch(InputMismatchException e){
            System.out.println("Erro: Você deve inserir um número válido.");

        }
    }
}
