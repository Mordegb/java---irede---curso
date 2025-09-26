package HerançaEmpresa;

public class funcionario extends gerente{ // herda os atributos publicos da classe gerente
   public Integer nivelDeAcesso = 1;
   public Float salario = 1200f;
   public void SetIdade(Integer idade){
        this.idade = idade; //herdou de gerente
   }
   public void SetSalario(Float salario){
       this.salario = salario;
   }
   public Integer getNivelDeAcesso(){
        return nivelDeAcesso;
   }
}
