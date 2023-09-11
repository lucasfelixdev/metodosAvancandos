public class Paciente extends Usuarios {
    private String telefone;
    private Medico medico;
    private String medicacao;
    private String exame;

    public void setExame(String exame) {
        this.exame = exame;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }
    
    // Construtor
    public Paciente(int id, String nome, String telefone, Medico medico) {
        super(id, nome);
        this.telefone = telefone;
        this.medico = medico;    
    }

    // Metodos
    public void dadosPaciente(){
        System.out.println("DADOS PACIENTE");
        System.out.println("Fone: "+telefone);
        System.out.println("Médico: "+medico.getNome());
        System.out.println("Medicação solicitada: "+medicacao);
        System.out.println("Exame Solicitado: "+ exame);
    }


    // Getter e Setters
    public void getMedico() {
        System.out.println(medico.getNome());
    }

    public String getTelefone() {
        return telefone;
    }   
}
