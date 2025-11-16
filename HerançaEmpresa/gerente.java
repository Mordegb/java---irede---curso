package HerançaEmpresa;

//cargo mais alto da empresa.
public class gerente extends funcionario {
    protected Float salario = 2500f;
    public Integer nivelDeAcesso = 2;
    private final Double comissao = 25.000; // variavel imutalve, por ter o "final"

    @Override
    public void Setsalario(Float salario) {
        super.Setsalario(salario);
    }
}
