import java.util.Scanner;
//pra fazer input no java precisa importar essa biblioteca

public class input {
    public static void main(String[] args) {
        // o "abaixo" acima é o comando que a gente usa pra inserir variaveis
        Scanner sc = new Scanner(System.in);

       String nome = sc.nextLine(); //pode trocar o "sc pelo oque eu quiser."
        int idade = sc.nextInt(); // após usar o next,eu completo com o tipo de variavel com primeira letra maiuscula
        double nota = sc.nextDouble();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("nota: " + nota);

    }
}
