package composicao.exemplo2;

public class Aluno {

    private int matricula;
    private String nome;

    private Endereco endereco;

    public Aluno(int matricula, String nome, String logradouro, int numero,
                 String complemento, String bairro, String cidade, String uf, String cep) {
        this.matricula = matricula;
        this.nome = nome;
        endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, uf, cep);
    }

    public class Endereco {
        private String logradouro;
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;

        private Endereco(String logradouro, int numero,
                         String complemento, String bairro, String cidade, String uf, String cep) {
            this.logradouro = logradouro;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.uf = uf;
            this.cep = cep;
        }
    }
}
