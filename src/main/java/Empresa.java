public class Empresa {
    private Empresa(){}
    private static Empresa instance = new Empresa();
    public static Empresa getInstance(){
        return instance;
    }
    private String nomeEmpresa;
    private String nomeDiretor;

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeDiretor()
    {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor)
    {
        this.nomeDiretor = nomeDiretor;
    }
    public String getNomeEmpresa()
    {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
    }
}
