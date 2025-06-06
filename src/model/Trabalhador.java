package model;

public class Trabalhador extends Pessoa {
    private String ocupacao;
    private int salario;

    public Trabalhador() {
    }

    public Trabalhador(Long id, String nome, int idade, String email, String telefone, Endereco endereco,
            String ocupacao, int salario) {
        super(id, nome, idade, email, telefone, endereco);
        this.ocupacao = ocupacao;
        this.salario = salario;
    }

    public Trabalhador(String nome, int idade, String email, String telefone, String ocupacao, int salario) {
        super(nome, idade, email, telefone);
        this.ocupacao = ocupacao;
        this.salario = salario;

    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador [ocupacao=" + ocupacao + ", salario=" + salario + ", super()=" + super.toString() + "]";
    }

}
