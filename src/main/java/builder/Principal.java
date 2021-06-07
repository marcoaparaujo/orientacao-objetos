package builder;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marco");

        funcionario.setSalarioBruto(100)
                   .setTotalAcrescimos(100)
                   .setTotalDescontos(100);

        System.out.println(funcionario.calcularSalarioLiquido());


        Funcionario funcionario2 = new Funcionario("Antonio");
        funcionario2.setTotalAcrescimos(20000)
                .setTotalDescontos(100)
                .setSalarioBruto(1000);

        System.out.println(funcionario2.calcularSalarioLiquido());

    }





}
