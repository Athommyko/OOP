package exercício.heranca;

public class Canideo extends Animal {
    private String tipos;
    private String alimento;

    public Canideo() {
    }

    public Canideo(String tipos, String alimento, String porte, int altura, String nome) {
        super(porte, altura, nome);
        this.tipos = tipos;
        this.alimento = alimento;

    }

    public String getTipos() {
        return tipos;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Canideo [tipos=" + tipos + ", alimento=" + alimento + ", super()=" + super.toString() + "]";
    }

}
