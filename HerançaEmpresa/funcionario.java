package HerançaEmpresa;

public class funcionario extends pessoa{ // herda os atributos publicos da classe gerente
    public Integer nivelDeAcesso = 1;
   public Float salario = 1200f;

    public void Setsalario(Float salario){
        this.salario = salario;
    }

   public Integer getNivelDeAcesso(){
        return nivelDeAcesso;
   }

    @Override
    void apresentar(String nome) {
        super.apresentar(nome);
    }
}
