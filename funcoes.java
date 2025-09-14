public class funcoes {
    //procedimentos
    void apresenta(){
        System.out.println("ola a todos");
    }

    // função
    void apresentaNome(String nome){
        System.out.println("bem vindo " + nome);
    }

    int quadrado(int num){ //parametro com retorno
        num = num * num;
        return num;
    }

    public static void main(String[] args){
        new funcoes().apresenta();
        new funcoes().apresentaNome("cadu");
        int num = new funcoes().quadrado(2);
        System.out.println(num);
    }
}
