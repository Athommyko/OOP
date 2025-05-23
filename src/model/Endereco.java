package model;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;
    private Estados estado;
    
    public Endereco() {
    }

    public Endereco(String logradouro, String cidade, String cep, Estados estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    
    
}
