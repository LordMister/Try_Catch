package Try_Catch.A8;

public class Idade {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verif() {
        try {
            if (idade < 0) {
                System.out.println("Erro: Idade não pode ser negativa!");
            } else if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
