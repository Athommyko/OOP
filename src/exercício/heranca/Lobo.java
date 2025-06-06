package exercício.heranca;

public class Lobo extends Canideo {
    private String cor;
    private String raca;

    public Lobo() {
    }

    public Lobo(String cor, String raca) {
        this.cor = cor;
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void steRaca(String raca) {
        this.raca = raca;
    }

}
