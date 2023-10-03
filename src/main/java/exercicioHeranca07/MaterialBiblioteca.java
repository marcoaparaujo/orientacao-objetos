package exercicioHeranca07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class MaterialBiblioteca {

    private String titulo;
    private Date dataPublicacao;
    private Date dataDevolucao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public abstract void calcularDataDevolucao();

    public void adicionarDias(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dataPublicacao);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        this.dataDevolucao = calendar.getTime();
    }

    public String getDataFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.dataDevolucao);
    }
}
