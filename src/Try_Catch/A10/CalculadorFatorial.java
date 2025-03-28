package Try_Catch.A10;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensagem) {
        super(mensagem);
    }
}

class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String mensagem) {
        super(mensagem);
    }
}

public class CalculadorFatorial {

    public static long calcularFatorial(int n) throws NumeroNegativoException, LimiteFatorialExcedidoException {

        if (n < 0) {
            throw new NumeroNegativoException("Não é possível calcular o fatorial de um número negativo.");
        }

        if (n > 20) {
            throw new LimiteFatorialExcedidoException("O número não pode ser maior que 20.");
        }

        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1); // Chamada recursiva
        }
    }
}