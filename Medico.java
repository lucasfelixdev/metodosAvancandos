public class Medico extends Usuarios{
    private String especialidades;
    private Paciente paciente;
    private RealizaConsulta realizaConsulta = new RealizaConsulta(paciente);

    public Medico(int id, String nome, String especialidades) {
        super(id, nome);
        this.especialidades = especialidades;
    }

    public void prescreveMedicacao(Paciente paciente, String nome){
           realizaConsulta.Medicacao(paciente, nome);
    }

    public void solicitaExame(Paciente paciente, String nome){
       realizaConsulta.Exame(paciente, nome);
        
    }


    public String getEspecialidades() {
        return especialidades;
    }
    
}
