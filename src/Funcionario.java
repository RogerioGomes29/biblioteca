
public class Funcionario {
    private String nome;
    private Long cpf;
    private String cargo;
    private String salario;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public Funcionario() {
        this.endereco = new Endereco();
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", cargo='" + cargo + '\'' +
                ", salario='" + salario + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

