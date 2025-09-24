public class mainPessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa(); //declara um novo objeto com a classe pessoa

        System.out.println("Nome: " + p1.nome); //acessa la na classe o nome da pessoa com o operado "."
        System.out.println("Idade: " + p1.idade);
        System.out.println("trabalho: " + p1.ocupacao + "\n");
        //System.out.println("trabalho: " + p1.cpf); → dá erro e avisa que cpf é privado na class e pessoa

        p1.apresentar(); // utiliza o método (função de classe)
        p1.apresentar2("cadu",18,"estudante \n");

        p1.apresentar2("cadu", p1.getIdade(), "estudante"); //o get pega o valor da variavel la na classe

        p1.setIdade(18); //muda o valor da valiavel lá na classe pessoa
        p1.apresentar(); //olá, meu nome é Belialuim tenho 18 e sou ator , (antes a idade era 22)



    }
}
