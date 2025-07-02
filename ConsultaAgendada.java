import java.util.Scanner;

class ConsultaAgendada{
	
	//propriedades
	
	Scanner scan = new Scanner(System.in);
	Data data;
	Hora hora;
	String nomePaciente;
	String nomeMedico;
	static int quantidade;
	
	//Construtores
	
	public ConsultaAgendada(){
		 
		setData();
		setHora();
		setNomePaciente();
		setNomeMedico();
		quantidade++;
		
	}
	
	public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String pac, String med){
		
		setHora(h, mi, s);
		setData(a, m, d);
		setNomePaciente(pac);
		setNomeMedico(med);
		quantidade++;
		
	}
	
	public ConsultaAgendada(Data d, Hora h, String p, String m){
		
		this.data = d;
		this.hora = h;
		this.nomePaciente = p;
		this.nomeMedico = m;
		quantidade++;
		
	}
	
	//Setters com parametro
	
	public void setData(int a, int m, int d){
		
		this.data = new Data(a, m, d);
		
	}
	
	public void setHora(int h, int mi, int s){
		
		this.hora = new Hora(h, mi, s);
		
	}
	
	public void setNomePaciente(String p){
		
		this.nomePaciente = p;
	
	}
	
	public void setNomeMedico(String m){
		
		this.nomeMedico = m;
		
	}
	
	//Setters sem parametro
	
	public void setData(){
		
		this.data = new Data();
		
	}
	
	public void setHora(){
		
		this.hora = new Hora();
		
	}
	
	public void setNomePaciente(){
		
		System.out.println("------------------------------------------------");
		System.out.print("Digite o nome do paciente: ");
		this.nomePaciente = scan.nextLine();
		
	}
	
	public void setNomeMedico(){
		
		System.out.println("------------------------------------------------");
		System.out.print("Digite o nome do medico: ");
		this.nomeMedico = scan.nextLine();
		
	}
	
	//Getters
	
	public int getAmostra(){
		
		return quantidade;
		
	}
	
	public String getData(){
		
		return data.mostra1();
		
	}
	
	public String getHora(){
		
		return hora.getHora1();
		
	}
	
	public String getNomePaciente(){
		
		return this.nomePaciente;
		
	}
	
	public String getNomeMedico(){
		
		return this.nomeMedico;
		
	}
	
}








































