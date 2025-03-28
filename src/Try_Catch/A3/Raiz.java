package Try_Catch.A3;

public class Raiz {

    private double numero;

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void verif (){

      try{
          if (numero < 0) {
              System.out.println("Erro: Impossivel calcular a RAIZ de um número negativo!!");
          } else {
              double raizQuadrada = Math.sqrt(numero);
              System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
          }

      }catch(IllegalArgumentException e) {
          System.out.println("Erro: " + e.getMessage());

      }

    }
}
