class Data{
	
	Scanner scan = new Scanner(System.in);
	
	//atributos

	private int dia;
	private int mes;
	private int ano;
	
	//metodos construtor
	
	public Data(){
		
		entraAno();
		entraMes();
		entraDia();
		
	}
	
	public Data(int a, int m, int d){

		entraAno(a);
		entraMes(m);
		entraDia(d);
	}
	
	//validação ano bissexto
	
	//entradas sem parametro
	
	public void entraAno(){
		
		int ano = -1;
		
		do{
			System.out.println("------------------------------------------------");
			System.out.println("Digite o ano: ");

			 
				if(scan.hasNextInt()){
				 
					ano = scan.nextInt();
					
					if(ano > 0){
						
						this.ano = ano;
						
					} else {
						
						System.out.println();
						System.out.println("Digite um valor de ano valido(maior que zero)");
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

	public void entraMes(){
		
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
	
	public void entraDia(){
		
		int dia = 0;
		
		do{
			
			System.out.println();
			System.out.println("Digite o dia do mes: ");
			
			if(scan.hasNextInt()){
				
				dia = scan.nextInt();
				
				switch(this.mes){
					
					case 1: {
						
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
					
					case 3: {
						
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
					
					case 4: {
						
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
					
					case 5: {
						
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
					
					case 6: {
						
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
					
					case 7: {
						
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
					
					case 8: {
						
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
					
					case 9: {
						
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
					
					case 10: {
						
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
					
					case 11: {
						
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
					
					case 12: {
						
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
	
	public void entraDia(int d){
		
		this.dia = d;
		
	}
	
	public void entraMes(int m){
		
		this.mes = m;
		
	}
	
	public void entraAno(int a){
		
		this.ano = a;
		
	}
	
	//saidas sem parametro
	
	public int retDia(){
		
		return this.dia;
		
	}
	
	public int retMes(){
		
		return this.mes;
		
	}
	
	public int retAno(){
		
		return this.ano;
		
	}
	
	//validação ano bissexto
	
	public boolean bissexto(){
		
		if((retAno() % 4 == 0 && retAno() % 100 != 0)|| (retAno() % 400 == 0)){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	//saidas especias
	
	public String mostra1(){
		
		String dia, mes;
		
		if(this.dia < 10){
			
			dia = "0" + retDia();
			
		} else{
			
			dia = "" + retDia();
			
		}
		
		if(this.mes < 10){
			
			mes = "0" + retMes();
			
		} else{
			
			mes = "" + retMes();
			
		}
		
		return dia + "/" + mes + "/" + retAno();
		
	}
	
	public String mostra2(){
		
		switch(retMes()){
			
			case 1:{
				
				if(this.dia < 10){
			
					return retDia() + "/Janeiro/" + retAno();
					
				} else{
					
					return retDia() + "/Janeiro/" + retAno();
			
				}
				
			}
			
			case 2:{
				
				if(this.dia < 10){
			
					return retDia() + "/Fevereiro/" + retAno();
					
				} else{
					
					return retDia() + "/Fevereiro/" + retAno();
			
				}
				
			}
			
			case 3:{
				
				if(this.dia < 10){
			
					return retDia() + "/Março/" + retAno();
					
				} else{
					
					return retDia() + "/Março/" + retAno();
			
				}
				
			}
			
			case 4:{
				
				if(this.dia < 10){
			
					return retDia() + "/Abril/" + retAno();
					
				} else{
					
					return retDia() + "/Abril/" + retAno();
			
				}
				
			}
			
			case 5:{
				
				if(this.dia < 10){
			
					return retDia() + "/Maio/" + retAno();
					
				} else{
					
					return retDia() + "/Maio/" + retAno();
			
				}
				
			}
			
			case 6:{
				
				if(this.dia < 10){
			
					return retDia() + "/Junho/" + retAno();
					
				} else{
					
					return retDia() + "/Junho/" + retAno();
			
				}
				
			}
			
			case 7:{
				
				if(this.dia < 10){
			
					return retDia() + "/Julho/" + retAno();
					
				} else{
					
					return retDia() +  "/Julho/" + retAno();
			
				}
				
			}
			
			case 8:{
				
				if(this.dia < 10){
			
					return retDia() + "/Agosto/" + retAno();
					
				} else{
					
					return retDia() + "/Agosto/" + retAno();
			
				}
				
			}
			
			case 9:{
				
				if(this.dia < 10){
			
					return retDia() + "/Setembro/" + retAno();
					
				} else{
					
					return retDia() + "/Setembro/" + retAno();
			
				}
				
			}
			
			case 10:{
				
				if(this.dia < 10){
			
					return retDia() + "/Outubro/" + retAno();
					
				} else{
					
					return retDia() + "/Outubro/" + retAno();
			
				}
				
			}
			
			case 11:{
				
				if(this.dia < 10){
			
					return retDia() + "/Novembro/" + retAno();
					
				} else{
					
					return retDia() + "/Novembro/" + retAno();
			
				}
				
			}
			
			case 12:{
				
				if(this.dia < 10){
			
					return retDia() + "/Dezembro/" + retAno();
					
				} else{
					
					return retDia() + "/Dezembro/" + retAno();
			
				}
				
			}
			
			default: {
            
			return "Mês inválido: " + retMes();
			
			}
			
		}
		
	}
	
	public int diasTranscorridos(){
		
		int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(bissexto()){
			
			dias[1] = 29;
			
		}
		
		int soma = 0;
		
		for(int i = 0; i < retMes() - 1; i++){
			
			soma += dias[i];
			
		}
		
		soma += retDia();
		
		return soma;
		
	}
	
	public void apresentaDataAtual(){
		
		Date dataAtual = new Date(); 
		
		DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("Data atual: " + formato.format(dataAtual));
		
	}
	
}