package calculadora;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Calculadora 2");

        Calculadora calc = new Calculadora();
        calc.setNum1(10);
        calc.setNum2(5);

        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());
    }
}
