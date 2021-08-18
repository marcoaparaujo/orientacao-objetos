package dependencia;

public class Aluno {

    private int matricula;
    private String nome;

    public String enviarCorrespondencia(Endereco endereco) {

        return "Endereco{" +
                "logradouro='" + endereco.getLogradouro() + '\'' +
                ", bairro='" + endereco.getBairro() + '\'' +
                ", cidade='" + endereco.getCidade() + '\'' +
                ", uf='" + endereco.getUf() + '\'' +
                ", cep='" + endereco.getCep() + '\'' +
                '}';
    }

}
