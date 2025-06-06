package exercício.heranca;

public class Animal {
    private String porte;
    private int altura;
    private String nome;

    public Animal() {
    }

    public Animal(String porte, int altura, String nome) {
        this.porte = porte;
        this.altura = altura;
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
