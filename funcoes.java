public class funcoes {
    //procedimentos
    void apresenta(){
        System.out.println("ola a todos");
    }

    // função com parametro
    void apresentaNome(String nome){
        System.out.println("bem vindo " + nome);
    }
    //função com retorno
    int quadrado(int num){ //parametro com retorno
        num = num * num;
        return num;
    }

    public static void main(String[] args){
        // ao usar funções deve sempre usar "new" seguido do nome do arquivo
        //e um "." com o nome da função
        new funcoes().apresenta();
        new funcoes().apresentaNome("cadu");
        int num = new funcoes().quadrado(2);
        System.out.println(num);
    }
}
