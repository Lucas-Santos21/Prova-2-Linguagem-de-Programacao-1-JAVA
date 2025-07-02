import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

class Data{
	
	Scanner scan = new Scanner(System.in);
	
	//atributos

	private int dia;
	private int mes;
	private int ano;
	
	//metodos construtor
	
	public Data(){
		
		setAno();
		setMes();
		setDia();
		
	}
	
	public Data(int a, int m, int d){

		setAno(a);
		setMes(m);
		setDia(d);
	}
	
	//validação ano bissexto
	
	//entradas sem parametro
	
	public void setAno(){
		
		int ano = -1;
		
		do{
			System.out.println("------------------------------------------------");
			System.out.print("Digite o ano: ");

			 
				if(scan.hasNextInt()){
				 
					ano = scan.nextInt();
					
					if(ano > 0){
						
						this.ano = ano;
						
					} else {
						
						System.out.println();
						System.out.print("Digite um valor de ano valido(maior que zero)");
						System.out.println();
						
					}
					
				} else{
				 
				    System.out.println();
					System.out.println("Entrada invalida! digite um numero inteiro");
					System.out.println();
					scan.next();
				 
				}
			
		}while(ano <=0);
		
	}

	public void setMes(){
		
		int mes = 0;
		
		do{
			System.out.println("-------------------------");
			System.out.println("Digite o numero do mes: ");
			System.out.println("-------------------------");
			System.out.println("1. Janeiro");
			System.out.println("2. Fevereiro");
			System.out.println("3. Marco");
			System.out.println("4. Abril");
			System.out.println("5. Maio");
			System.out.println("6. Junho");
			System.out.println("7. Julho");
			System.out.println("8. Agosto");
			System.out.println("9. Setembro");
			System.out.println("10.  Outubro");
			System.out.println("11. Novembro");
			System.out.println("12. Dezembro");
			System.out.println("-------------------------");
			System.out.print("Mes escolhido: ");
			
			if(scan.hasNextInt()){
				
			mes = scan.nextInt();
				
				if(mes > 0 && mes < 13){
					
					this.mes = mes;
					
				} else{
					
					System.out.println();
					System.out.println("Digite um valor de mes valido(dentro da lista)");
					System.out.println();
					
				}
				
			} else{
				
				System.out.println();
				System.out.println("Entrada invalida! digite um numero inteiro");
				System.out.println();
				
				scan.next();
				
			}
			
		} while(mes < 1 || mes > 12);
		
	}
	
	public void setDia(){
		
		int dia = 0;
		
		do{
			
			System.out.println();
			System.out.print("Digite o dia do mes: ");
			
			if(scan.hasNextInt()){
				
				dia = scan.nextInt();
				
				switch(this.mes){
					
					case 1, 3, 5, 7, 8, 10, 12: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							
							break;
							
							
							
						}
						
					}
					
					case 2: {
						
						if(bissexto()){
							
							if(dia > 0 && dia < 30){
							
								this.dia = dia;
								break;
							
							} else{
							
								System.out.println("------------------------------------------------");
								System.out.println("Insira um valor de dia valido (entre 1 e 29)");
								System.out.println("------------------------------------------------");
								
								dia = -1;
								break;
							
							}
							
						} else{
							
							if(dia > 0 && dia < 29){
							
								this.dia = dia;
								break;
							
							} else{
								
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 28)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							
								break;
							
							}
							
						}
						
					}
					
					case 4, 6, 9, 11: {
						
						if(dia > 0 && dia < 31){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 30)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
				}
				
			} else{
				
				System.out.println("------------------------------------------------");
				System.out.println("Entrada invalida! digite um numero inteiro");
				System.out.println("------------------------------------------------");
				
				scan.next();
				
				dia = -1;
				
			}
			
		} while(dia == -1);
		
	}
	
	//entradas com parametro
	
	public void setDia(int d){
		
		this.dia = d;
		
	}
	
	public void setMes(int m){
		
		this.mes = m;
		
	}
	
	public void setAno(int a){
		
		this.ano = a;
		
	}
	
	//saidas sem parametro
	
	public int getDia(){
		
		return this.dia;
		
	}
	
	public int getMes(){
		
		return this.mes;
		
	}
	
	public int getAno(){
		
		return this.ano;
		
	}
	
	//validação ano bissexto
	
	public boolean bissexto(){
		
		if((getAno() % 4 == 0 && getAno() % 100 != 0)|| (getAno() % 400 == 0)){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	//saidas especias
	
	public String mostra1(){
		
		String dia, mes;
		
		if(this.dia < 10){
			
			dia = "0" + getDia();
			
		} else{
			
			dia = "" + getDia();
			
		}
		
		if(this.mes < 10){
			
			mes = "0" + getMes();
			
		} else{
			
			mes = "" + getMes();
			
		}
		
		return dia + "/" + mes + "/" + getAno();
		
	}
	
	public String mostra2(){
		
		switch(getMes()){
			
			case 1:{
				
				if(this.dia < 10){
			
					return getDia() + "/Janeiro/" + getAno();
					
				} else{
					
					return getDia() + "/Janeiro/" + getAno();
			
				}
				
			}
			
			case 2:{
				
				if(this.dia < 10){
			
					return getDia() + "/Fevereiro/" + getAno();
					
				} else{
					
					return getDia() + "/Fevereiro/" + getAno();
			
				}
				
			}
			
			case 3:{
				
				if(this.dia < 10){
			
					return getDia() + "/Março/" + getAno();
					
				} else{
					
					return getDia() + "/Março/" + getAno();
			
				}
				
			}
			
			case 4:{
				
				if(this.dia < 10){
			
					return getDia() + "/Abril/" + getAno();
					
				} else{
					
					return getDia() + "/Abril/" + getAno();
			
				}
				
			}
			
			case 5:{
				
				if(this.dia < 10){
			
					return getDia() + "/Maio/" + getAno();
					
				} else{
					
					return getDia() + "/Maio/" + getAno();
			
				}
				
			}
			
			case 6:{
				
				if(this.dia < 10){
			
					return getDia() + "/Junho/" + getAno();
					
				} else{
					
					return getDia() + "/Junho/" + getAno();
			
				}
				
			}
			
			case 7:{
				
				if(this.dia < 10){
			
					return getDia() + "/Julho/" + getAno();
					
				} else{
					
					return getDia() +  "/Julho/" + getAno();
			
				}
				
			}
			
			case 8:{
				
				if(this.dia < 10){
			
					return getDia() + "/Agosto/" + getAno();
					
				} else{
					
					return getDia() + "/Agosto/" + getAno();
			
				}
				
			}
			
			case 9:{
				
				if(this.dia < 10){
			
					return getDia() + "/Setembro/" + getAno();
					
				} else{
					
					return getDia() + "/Setembro/" + getAno();
			
				}
				
			}
			
			case 10:{
				
				if(this.dia < 10){
			
					return getDia() + "/Outubro/" + getAno();
					
				} else{
					
					return getDia() + "/Outubro/" + getAno();
			
				}
				
			}
			
			case 11:{
				
				if(this.dia < 10){
			
					return getDia() + "/Novembro/" + getAno();
					
				} else{
					
					return getDia() + "/Novembro/" + getAno();
			
				}
				
			}
			
			case 12:{
				
				if(this.dia < 10){
			
					return getDia() + "/Dezembro/" + getAno();
					
				} else{
					
					return getDia() + "/Dezembro/" + getAno();
			
				}
				
			}
			
			default: {
            
			return "Mês inválido: " + getMes();
			
			}
			
		}
		
	}
	
	public int diasTranscorridos(){
		
		int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(bissexto()){
			
			dias[1] = 29;
			
		}
		
		int soma = 0;
		
		for(int i = 0; i < getMes() - 1; i++){
			
			soma += dias[i];
			
		}
		
		soma += getDia();
		
		return soma;
		
	}
	
	public void apresentaDataAtual(){
		
		Date dataAtual = new Date(); 
		
		DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("Data atual: " + formato.format(dataAtual));
		
	}
	
}