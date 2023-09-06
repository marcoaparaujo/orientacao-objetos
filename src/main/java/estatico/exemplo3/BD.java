package estatico.exemplo3;

import java.util.ArrayList;
import java.util.List;

public class BD {

    private static List<String> registros = new ArrayList<String>();

    public static void adicionarRegistro(String registro) {
        registros.add(registro);
    }

    public static int getQuantidadeRegistros() {
        return registros.size();
    }

    public static void zerarBD() {
        registros.clear();
    }
}
