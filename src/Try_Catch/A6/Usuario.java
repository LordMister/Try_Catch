package Try_Catch.A6;

public class Usuario {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verif() {
        try {
            if (nome.isEmpty() || idade < 0) {
                System.out.println("Erro: Nome vazio ou idade inválida!!!!");
            } else {
                System.out.println("Usuário cadastrado: " + nome + ", Idade: " + idade);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

