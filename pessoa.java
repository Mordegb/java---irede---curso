public class pessoa {

    //declara os atributos (variaveis com suas "características")
    public String nome = ("Belialuim");
    public Integer idade = 22;
    //qualquer um pode ver o acesso a partir do codigo main por ser "public"

    protected String ocupacao = ("ator");
    // o protected so deixa disponivel um atributo na pasta que a classe dele existe

    private String cpf = ("232.940.120-00");
    //o private pode ser um atributo ou metodo so disponivel na classe que pertence,se tentar acessa na main da erro

    //declarando os metodos, (funçoes em classes)
    void apresentar(){
        System.out.println("olá, meu nome é " + nome + " tenho " + idade + " e sou " + ocupacao);
    }

    void apresentar2(String nome, Integer idade, String ocupacao){
        System.out.println("olá, meu nome é " + nome + " tenho " + idade + " e sou " + ocupacao);
    }

    public void setIdade(Integer idade) { //cria uma função para mudar a variavel na main
        this.idade = idade; //o comando "this" basicamente ostra que a a instancia de classe recebe o valor
                            // e diferencia as variaveis de intancia das locais.
    }

    public Integer getIdade() {
        return idade;
    }
}
