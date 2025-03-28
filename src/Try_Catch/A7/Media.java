package Try_Catch.A7;

public class Media {
    private double nota1, nota2, nota3;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void verif() {
        try {
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Média: " + media);
        } catch (Exception e) {
            System.out.println("Erro: Insira apenas números válidos!");
        }
    }
}
