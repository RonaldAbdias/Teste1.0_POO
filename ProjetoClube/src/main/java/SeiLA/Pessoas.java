package SeiLA;

public abstract class Pessoas {

    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return Data_nascimento;
    }

    public void setData_nascimento(String Data_nascimento) {
        this.Data_nascimento = Data_nascimento;
    }
    private String cpf;
    private String Data_nascimento;
    

}
