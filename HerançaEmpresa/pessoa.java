package HerançaEmpresa;

public abstract class pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;

    pessoa(){
        this.nome = "funcionaro";
        this.idade = 18;
        this.sexo = "indefinido";
    }

    void  Setnome(String nome) {
        this.nome = nome;
    }
    void  Setidade(Integer idade) {
        this.idade = idade;
    }
    void  Setsexo(String sexo) {
        this.sexo = sexo;
    }

    pessoa(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    void apresentar(String nome){
        System.out.println("muito prazer, meu nome é " +nome);
    }
}
