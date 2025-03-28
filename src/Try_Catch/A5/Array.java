package Try_Catch.A5;

public class Array {
        private int indice;
        private final int[] numeros = {10, 20, 30, 40, 50};

        public void setIndice(int indice) {
            this.indice = indice;
        }

        public void verif() {
            try {
                System.out.println("Valor no índice " + indice + ": " + numeros[indice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora do limite do array.");
            }
        }
    }

