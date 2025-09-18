public class Throw {
    float funcNotas(float[] notas) throws IllegalArgumentException {
        float media = 0;
        for (float nota : notas) { //vai passar por cada elemento do array, e como o indice é irrelevante nessa caso, esse tipo de for é bom.
            if (nota > 10 || nota < 0) {
                throw new IllegalArgumentException("a nota deve ser maior que zero e menor que dez");
            }
            media += nota;
        }
        return media / notas.length;
    }

    public static void main(String[] args) {
        float[] notas = {7.4f , 8.6f , 11f}; //tem que botar "f" pq é do tipo float
        try {
            float resp = new Throw().funcNotas(notas); //ao usar o comando Throw, o "T", tem que ser maiusculo
            System.out.println("sua media é: " + resp);
        } catch (IllegalArgumentException exception){
            System.out.println("Erro: " + exception.getMessage()); // o comando exception.getMessage() imprimi na tela a
                                                                   // mensagem de erro e exceção já existente na função
        }

    }
}
