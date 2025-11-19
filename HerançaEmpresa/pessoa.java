package HerançaEmpresa;

public abstract class pessoa {
    protected String nome;
    protected Integer idade;
    protected String sexo;
    protected String cargo;

    pessoa(){
        this.nome = "joão";
        this.idade = 18;
        this.sexo = "indefinido";
        this.cargo = "indefinido";
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

    void setPessoa(String nome, Integer idade, String sexo , String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cargo = cargo;
    }
    void apresentar(){ //não precisa de parametro
        System.out.println("muito prazer, meu nome é " + this.nome + "e tenho " + this.idade);
    }

    void latir(){
        System.out.println("au au");
    }
    void apresentarFormal(){
        System.out.println("muito prazer,meu nome é  " + this.nome + " e sou " + this.cargo + " dessa empresas!");
    }

}
