package salario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    Departamento departamento;

    @BeforeEach
    void setUp() {
        departamento = new Departamento();
    }

    @Test
    void deveCalcularSalarioChefeDiarista() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setValorDia(1000.0f);
        funcionarioDiarista.setNumDias(25);
        departamento.setChefe(funcionarioDiarista);
        assertEquals(25000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveCalcularSalarioChefeHorista() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setValorHora(100.0f);
        funcionarioHorista.setNumDias(20);
        funcionarioHorista.setNumHorasDia(10);
        departamento.setChefe(funcionarioHorista);
        assertEquals(20000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveCalcularSalarioChefeMensalista() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorMes(14000.0f);
        departamento.setChefe(funcionarioMensalista);
        assertEquals(14000.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveCalcularSalarioChefeContratado() {
        FuncionarioContratado funcionarioContratado = new FuncionarioContratado();
        departamento.setChefe(funcionarioContratado);
        assertEquals(2500.0f, departamento.calcularSalarioChefe());
    }

    @Test
    void deveRetornarExcecaoDepartamentoSemChefe() {
        try {
            departamento.calcularSalarioChefe();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Departamento sem chefe", e.getMessage());
        }
    }

}