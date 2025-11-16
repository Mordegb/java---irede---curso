package HerançaEmpresa;

public class funcionario extends pessoa{ // herda os atributos publicos da classe gerente
    public Integer nivelDeAcesso = 1;
    public Float salario = 1200f;


    public void Setsalario(Float salario){
        this.salario = salario;
    }

    public void setNivelDeAcesso(Integer nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    void apresentar() {
        super.apresentar();
    }

    @Override
    void apresentarFormal() {
        super.apresentarFormal();
    }

    @Override
    void Setidade(Integer idade) {
        super.Setidade(idade);
    }
}
