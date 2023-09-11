public class Main {
    public static void main(String[] args) {
        // Instâncias de Medicos - PRÉ CADASTRO DE MÉDICOS
        Medico medico1 = new Medico(111, "Dr.Zé", "Cardiologista");
        Medico medico2 = new Medico(112, "Dr.Pai", "Urologista");

        // Instâncias de Pacientes 1 - CADASTRANDO PACIENTE
        Paciente paciente1 = new Paciente(01, "Pablo", "400289" , medico1);
        Paciente paciente2 = new Paciente(02, "Matheus", "8922400" , medico2);

        // Recepcionista verifica se há datas disponiveis e agenda a consulta que já é instanciada na classe recepcionista
        Recepcionista recepcionista1 = new Recepcionista(222, "Adriane");
        recepcionista1.agendarConsulta(1, medico2, "19/09", "14:00hs", paciente1);
        recepcionista1.agendarConsulta(22, medico1, "25/09", "16:00hs", paciente2);
        recepcionista1.exibeAgenda();

        // MEDICO ATENDE E SOLICITA EXAME ou Medicação
        medico2.solicitaExame(paciente1, "EXAME01");
        medico2.prescreveMedicacao(paciente1, "MEDICAMENTO02");
       
        // Exibe dados do paciente, medicamentos e o médico que o atendeu.
        paciente1.dadosPaciente();




        

    }
}
