package Try_Catch;

public class Divisao {
    private double valor;
    private double valor1;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void Operacao() {
        try {

           double resultado = valor / valor1;
            System.out.println("Resultado: " + resultado);

        }catch (ArithmeticException e){
            System.out.println("Voce está tentando dividir este valor por 0");
        }

    }
 }
