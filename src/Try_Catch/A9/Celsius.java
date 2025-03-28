package Try_Catch.A9;

public class Celsius {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void verif() {
        try {
            if (celsius < -273.15) {
                System.out.println("Erro: Temperatura abaixo do zero absoluto!");
            } else {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

