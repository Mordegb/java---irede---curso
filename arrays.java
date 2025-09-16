import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declarar um vertor
        int[] valores = new int[5]; // declara o array e seu tamanho

        Integer[] valores2 = {1, 2, 3, 4, 5}; //tmb da pra criar direto.

        for (int i = 0; i < valores.length; i++) { // o comando "valores.length"
            valores[i] = input.nextInt();
            valores[i] = (valores[i] * 2);
        }

        for (int i = 0; i < valores2.length; i++) {
            System.out.println(valores[i]);
        }

            System.out.println("\n");

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
