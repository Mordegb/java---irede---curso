public class mainPessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa(); //declara um novo objeto com a classe pessoa

        System.out.println("Nome: " + p1.nome); //acessa la na classe o nome da pessoa com o operado "."
        System.out.println("Idade: " + p1.idade);
        System.out.println("trabalho: " + p1.ocupacao);
        p1.apresentar(); // utiliza o metodo (função de classe)
        p1.apresentar2("cadu",18,"estudante");


    }
}
