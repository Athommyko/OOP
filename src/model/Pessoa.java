package model;

public class Pessoa {
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private Endereco endereco;
    private boolean dependentes;


    public Pessoa(){}

    public Pessoa(Long id, String nome, int idade, String email, String telefone, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade, String email, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public boolean hasDependentes(){
        return dependentes;
    }

    public void setDependentes(boolean dependentes){
        this.dependentes = dependentes;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", telefone="
                + telefone + ", endereco=" + endereco + ", dependentes=" + dependentes + "]";
    }

    
    
}
