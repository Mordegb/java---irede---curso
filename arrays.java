import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // declarar um vertor
        int[] valores = new int[5]; // declara o array e seu tamanho

        for (int i = 0; i < valores.length; i++){ // o comando "valores.length"
            valores[i] = input.nextInt();

        }

        for (int i = 0; i < valores.length; i++){ // o comando "valores.length"
            valores[i] = (valores [i] * 2);
            System.out.println((valores [i] * 2));

        }

        //declarar uma matriz
        int[][] matriz = new int[3][3]; //declarando uma matriz

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (i + j);
                System.out.println(matriz[i][j]);
            }
        }

    }
}
