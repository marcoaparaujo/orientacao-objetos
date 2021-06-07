package inicio;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Marco");
        aluno.setSobrenome("Araujo");
        System.out.println(aluno.matricular());

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Antonio");
        aluno2.setSobrenome("Pereira");
        System.out.println(aluno2.matricular());
    }

}
