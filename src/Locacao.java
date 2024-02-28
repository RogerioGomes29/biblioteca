
public class Locacao {

    private String ValorLocacao;
    private String ValorMulta;
    private Funcionario funcionario;
    private Usuario usuario;

    private String dataLocacao;
    private String dataDevolucao;
    private String livroLocado;
    private Livro livro;

    public Locacao(String valorLocacao, String valorMulta, Funcionario funcionario, Usuario usuario, String dataLocacao, String dataDevolucao, String livroLocado, Livro livro) {
        ValorLocacao = valorLocacao;
        ValorMulta = valorMulta;
        this.funcionario = new Funcionario();
        this.usuario = usuario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.livroLocado = livroLocado;
        this.livro = livro;
    }

    public Locacao() {
    }

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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}



