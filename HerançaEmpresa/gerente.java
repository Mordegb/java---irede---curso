package HerançaEmpresa;

//cargo mais alto da empresa.
public class gerente {
    public String nome;
    public Integer idade;
    protected Float salario = 2500f;
    public Integer nivelDeAcesso = 2;
    private final Double comissao = 25.000; // variavel imutalve, por ter o "final"
    public void Setsalario(Float salario){
        this.salario = salario;
    }
}
