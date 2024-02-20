
public class Locacao {

    private String ValorLocacao;
    private String ValorMulta;
    private Funcionario funcionario;
    private Usuario usuario;

    private String dataLocacao;
    private String dataDevolucao;
    private String livroLocado;
    private String autor;

    public String getValorLocacao() {
        return ValorLocacao;
    }

    public void setValorLocacao(String valorLocacao) {
        ValorLocacao = valorLocacao;
    }

    public String getValorMulta() {
        return ValorMulta;
    }

    public void setValorMulta(String valorMulta) {
        ValorMulta = valorMulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getLivroLocado() {
        return livroLocado;
    }

    public void setLivroLocado(String livroLocado) {
        this.livroLocado = livroLocado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

