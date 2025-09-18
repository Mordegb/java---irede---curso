
public class laços {
    public static void main(String[] args) {
        //laço em java é mto igual ao C mds
        for(int i = 0; i < 10; i++){
            System.out.println(i + 1);
        }
        System.out.println("\n");
        //laço em for

        int i = 0;
        while(i < 10){
            System.out.println(i + 1);
            i++;
        }
        System.out.println("\n");
        //laço em while


        int j = 0;
        do {
            System.out.println(j + 1);
            j++;
        }while(j < 10);
        //laço em do while

        //laço com for diferenciado
        float[] notas = {7.4f, 8.6f, 5f};
            float media = 0;
        for (float nota : notas) { // percorre cada elemento do array
            media += nota; //olha cada elemento do array
        }
        //ele so não é bom porque ele não trabalha com indices, so sai olhando o array
        //então não é bom em caso de alteração
        System.out.println(media);
    }
}
