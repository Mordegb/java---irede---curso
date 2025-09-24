public class pessoa {

    //declara os atributos (variaveis com suas "características")
    public String nome = ("Belialuim");
    public Integer idade = 22;
    public String ocupacao = ("ator");
    //qualquer um pode ver o acesso a partir do codigo main por ser "public"

    void apresentar(){
        System.out.println("olá, meu nome é " + nome + " tenho " + idade + " e sou " + ocupacao);
    }

    void apresentar2(String nome, Integer idade, String ocupacao){
        System.out.println("olá, meu nome é " + nome + " tenho " + idade + " e sou " + ocupacao);
    }

}
