package agregacao.exemplo2;

public class Aluno {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private int enderecoNumero;
    private String enderecoComplemento;

    public Aluno(int matricula, String nome, String logradouro, int numero,
                 String complemento, String bairro, String cidade, String uf, String cep) {
        this.matricula = matricula;
        this.nome = nome;
        if (logradouro != null) {
            endereco = new Endereco(logradouro, bairro, cidade, uf, cep);
            this.enderecoNumero = numero;
            this.enderecoComplemento = complemento;
        }
    }

    public void setEndereco() {

    }

}
