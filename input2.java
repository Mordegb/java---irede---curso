import java.util.Scanner;

public class input2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // so para mostrar que da pra eu botar o nome que eu quiser no
        //comando de input

        String nome = input.nextLine();
        int idade = input.nextInt();
        double nota = input.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("idade " + idade);
        System.out.println("nota media: " + nota);

    }

}
