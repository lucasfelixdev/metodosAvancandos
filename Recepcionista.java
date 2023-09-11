import java.util.ArrayList;

public class Recepcionista extends Usuarios {

    private  ArrayList<Agenda> agendas = new ArrayList<>();

    public Recepcionista(int id, String nome){
        super(id, nome);
    }

    // Instância já é feita dentro da classe recepcionista, que administra os agendamentos, cadastros de clientes e médicos
    public void agendarConsulta(int id, Medico medico, String data, String hora, Paciente paciente){
        Agenda agenda = new Agenda(1, medico);
        agenda.adicionarConsulta(data, hora, paciente);
        agendas.add(agenda);
    }

    public void exibeAgenda(){
        for (Agenda i : agendas) {
            i.listarConsultas();
        }
    }


}
