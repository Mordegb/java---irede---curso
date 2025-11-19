import java.util.Scanner;
import java.util.ArrayList;

public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //vai permitir inputs do teclado
        ArrayList<Integer> lista = new ArrayList<>();
        //cria um array do tipo "int", e vai receber os comandos pelo nome de "lista"

        lista.add(1); //adiciona um item no final da lista

        lista.add(1,2); // se tiver main de um parametro, a função muda pra adiconar no indice um elemento.

        lista.set(1,1); //mudan o conteudo do indice

        int r = lista.get(1); //pega um elemento no indice
        System.out.println(r);

        int ri = lista.size(); //diz a quantidade de elemtos da lista
        System.out.println(ri);

        lista.remove(1); // remove um item no indice,
        //se a lista for de nomes, o .remove pode tirar pelo nome tambem

        lista.add(1,3);
        boolean ro = lista.contains(1); //retorna true ou flas, dizendo se tem algo ou não nesse indice
        System.out.println(ro);

       boolean re = lista.isEmpty(); //verifica se a lista ta vazia
       System.out.println(re);

       for(Integer num: lista){ //imprime a lista toda
           System.out.println(num);
       }

       lista.clear();


    }
}
