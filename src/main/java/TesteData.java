import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteData {

    private Date data;

    public TesteData(Date initialDate) {
        this.data = initialDate;
    }

    public void adicionarDias(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.data);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        this.data = calendar.getTime();
    }

    public String getDataFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.data);
    }

}

