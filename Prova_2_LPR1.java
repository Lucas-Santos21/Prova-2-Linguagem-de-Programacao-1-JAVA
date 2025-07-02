//Lucas da Silva Santos - CB3030598 - ADS371
//Kaueh Farias Ferreira dos Santos - CB3031438 - ADS371
//Prova 2 CBTLPR1

public class Prova_2_LPR1{

	public static void main(String[] args){

		ConsultaAgendada p1 = new ConsultaAgendada(14, 30, 0, 30, 6, 2025, "Lucas", "Dr. Joao");

        // Mostrando p1
		
		System.out.println("------------------------------------------------");
        System.out.println("Consulta P1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());

        // Criar consulta com dados digitados
        
		ConsultaAgendada p2 = new ConsultaAgendada();

        // Mostrar p2

		System.out.println("------------------------------------------------");
		System.out.println("Consulta P2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Médico: " + p2.getNomeMedico());

		System.out.println("------------------------------------------------");

        // Alterar dados de p1 via digitação
        
		System.out.println(" Alterando dados de P1 --");
        p1.setData();
		System.out.println("------------------------------------------------");
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        // Mostrar p1 novamente
		
		System.out.println("------------------------------------------------");
        System.out.println("Consulta P1 (atualizada):");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Medico: " + p1.getNomeMedico());
		System.out.println("------------------------------------------------");
        
		// Mostrar total de consultas
        
		System.out.println("Total de consultas criadas: " + p1.getAmostra());

	}

}