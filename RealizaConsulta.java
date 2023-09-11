
public class RealizaConsulta {

    // Para evitar a necessidade de novas instâncias de consulta, esssa classe é ref em Médico
    private Paciente paciente;
    private Medico Medico;

    public RealizaConsulta(Paciente paciente){
        this.paciente = paciente;
    }

    public void Medicacao(Paciente paciente, String nome){
        paciente.setMedicacao(nome);
    }

    public void Exame(Paciente paciente, String nome){
        paciente.setExame(nome);
    }

    public Medico getMedico() {
        return Medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
