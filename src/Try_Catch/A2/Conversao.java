package Try_Catch.A2;

public class Conversao {

    private String valor;

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void converter (){


           try{
               Integer.parseInt(valor);
               System.out.println("Tipo String, convertido para Tipo int." + valor);

           }catch(NumberFormatException e){
               System.out.println("Erro: Digite um número válido!");
           }

    }

}
