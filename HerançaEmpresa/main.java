package HerançaEmpresa;

public class main {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        gerente g1 = new gerente();
        f1.apresentar("cadu");
        f1.Setsalario(1500f); //override
        g1.Setsalario(2700f);
        System.out.printf("Salario do funcionario: %.2f%n", f1.salario);
        System.out.println("Salario do gerente: " + g1.salario);

        System.out.println("nivel de acesso do funionario: " + f1.nivelDeAcesso);
        System.out.println("nivel de acesso do gerente: " + g1.nivelDeAcesso);
    }

}
