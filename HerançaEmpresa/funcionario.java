package HerançaEmpresa;

public class funcionario extends gerente{ // herda os atributos publicos da classe gerente
   public Integer nivelDeAcesso = 1;
   public Float salario = 1200f;
   public void SetIdade(Integer idade){
        this.idade = idade; //herdou de gerente
   }

    @Override
    public void Setsalario(Float salario) {
        super.Setsalario(salario);
    }

   public Integer getNivelDeAcesso(){
        return nivelDeAcesso;
   }
}
