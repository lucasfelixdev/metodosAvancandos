import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private int id;
    private Medico medico;
    private  ArrayList<Consulta> consultas = new ArrayList<>();

    // Construtor
    public Agenda(int id, Medico medico){
        this.id = id;
        this.medico = medico;
    }


    public void adicionarConsulta(String data, String hora, Paciente paciente){
        Consulta consulta = new Consulta(data, hora, paciente);
        consultas.add(consulta);

    }

    public void listarConsultas(){
        System.out.println("ID: "+id+"\n"+
                           "MEDICO: "+medico.getNome()+"\n"+
                           "ESPECIALIDADE: "+medico.getEspecialidades()+
                           "\n\nCONSULTAS:");

        for (Consulta consulta : consultas) {
            System.out.println("DATA: "+consulta.getData()+"\nHora: "+consulta.getHora()+"\nPaciente: "+consulta.getPaciente().getNome()+"\n");
        }
    }

    //  public void removeConsulta(int number){
    //     for (Consulta consulta : consultas) {
    //         if(number == consultas.indexOf(number)){
    //             consultas.remove(number);
    //         }
    //     }
    // }
    

    // Getter's
    public int getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }
}
