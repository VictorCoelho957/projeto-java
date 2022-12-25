package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Jogadores;
import entities.Emprestimo;
import entities.Clube;
import entities.Definitivo;


public class Program {
	
    public static void main (String[] args){
		Locale.setDefault(Locale.US);
    	Scanner sc= new Scanner(System.in);
		List<Jogadores> list = new ArrayList<>(); 
		
		List<Clube> list1 = new ArrayList<>();

    	int op=0;
    	
    	do {
    		
    		System.out.println("##ESCOLHA UMA OPÇÃO##\n");
            System.out.println("1 - Cadastrar Dados do Clube");
            System.out.println("2 - Cadastrar  Jogadores");
            System.out.println("3 -  Atualizar   Jogadores    ");
            System.out.println("4 -  Atualizar Dados do   Clube             ");
            System.out.println("5 -  Remover Jogadores             ");
            System.out.println("6 -  Listar Jogadores           ");
            System.out.println("7 -  Listar Dados do Clube           ");
            System.out.println("8 -  Sair           ");




            
            

            System.out.println("Digite uma opção: ");
            op = sc.nextInt();
            switch(op){
            	case 1:
            		System.out.println("Informe o nome do clube: ");
            		sc.nextLine();
        			String nome_clube = sc.nextLine();
        			System.out.println("Informe o estadio do clube: ");
        			String estadio = sc.nextLine();
        			System.out.println("Cidade: ");
        			String cidade = sc.nextLine();
        			System.out.println("Informe o treinador: ");
        			String treinador = sc.nextLine();
        			 list1.add(new Clube(nome_clube,estadio, cidade,  treinador));
        			 
        			 break; //*encerra o  cadastro e "força" o programa voltar ao menu*/
        			
            	case 2:
            		System.out.print("Entre com número de jogadores que você deseja cadastrar: ");
            		int n = sc.nextInt();
            		for (int i=1;i<=n;i++) {
            			System.out.println("Jogador #" + i);
            			System.out.print("Tipo de transferencia; Emprestimo(E), Definitivo(D):  ");
            			char ch = sc.next().charAt(0);
            			System.out.print("Nome do jogador: ");
            			sc.nextLine();
            			String nome_jogador = sc.nextLine();
            			System.out.print("Idade ");
            			int idade = sc.nextInt();
            			System.out.print("Altura: ");
            			double altura = sc.nextDouble();
            			System.out.print("Pé: ");
            			sc.nextLine();
            			String pe = sc.nextLine();
            			System.out.print("Posição: ");
            			String posicao = sc.nextLine();
            			System.out.println("Camisa: ");
            			int camisa = sc.nextInt();
            		    System.out.println("Nacionalidade: ");
            			sc.nextLine();
            			String nacionalidade = sc.nextLine();
            			
            		    if(ch=='E') {
            		    	System.out.println("Valor:");
            		    	double valor=sc.nextDouble();
            		    	System.out.println("Antigo clube: ");
            		    	sc.nextLine();
                			String antigo_clube = sc.nextLine();
                			System.out.println("Duração: ");
                			String duracao = sc.nextLine();
                			System.out.println("Obrigação de compra: ");
                			String obrigacao_de_compra = sc.nextLine();
                			
                			list.add(new Emprestimo(nome_jogador,  idade, altura,  pe, posicao,  camisa,
                					 nacionalidade, valor, antigo_clube,  duracao, obrigacao_de_compra));  /**polimorfismo*/
                			
                			
                		
            		    }
            		    
            		    
            		    if(ch=='D') { 
            		    	System.out.println("Valor:");
            		    	double valor=sc.nextDouble();
            		    	System.out.println("Antigo clube: ");
            		    	sc.nextLine();
                			String antigo_clube = sc.nextLine();
                			System.out.println("Duração: ");
                			String duracao = sc.nextLine();
                			
                
                			list.add(new Definitivo(nome_jogador,  idade, altura,  pe, posicao,  camisa,
                					 nacionalidade, valor, antigo_clube,  duracao));
                			
                			
            		    	
            		    }
            		    
            		    
            			
           		}
            		
            	break;	
            		
            	case 3:   /** atualização da idade e das camisas dos jogadores */
            		for(int i=0; i<list.size();i++) {
            			Jogadores xjogadores=list.get(i);
            			System.out.println("["+ i+ "]" +xjogadores.getNome_jogador());
            			
            
            		}
            		
            		
            		
            		
            		System.out.println("Digite o valor de referencia: ");
                    int referencia = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Informe  a nova idade: "); 
                    int NovaIdade= sc.nextInt();
                    System.out.println("Informe  a nova de numeração de camisa: ");
                    int NovaCamisa= sc.nextInt();
                    
        			Jogadores x =list.get(referencia);
                    
                    x.setIdade(NovaIdade);
                    x.setCamisa(NovaCamisa);
                    

                    break;
                    
            	case 4:
            		
            		for(int i=0; i<list1.size();i++) {
            			Clube u=list1.get(i);
            			System.out.println("["+ i+ "]" +u.getNome_clube());
            			
            
            		}
            		
            		
            		
            		
            		System.out.println("Digite o valor de referencia: ");
                    int referencia1 = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Informe  o novo tecnico: ");
                    String NovoTecnico= sc.nextLine();
                    
        			Clube u =list1.get(referencia1);
                    
                    u.setTreinador(NovoTecnico);
            		
                    
                    
            		
            		
                     break;
                     
            	case 5:
            		
            		for(int i=0; i<list.size();i++) {
            			Jogadores xjogadores=list.get(i);
            			
            			System.out.println("["+ i+ "]" +xjogadores.getNome_jogador());
            			
            			
            
            		}
            		
            		System.out.print("Digite o valor de referencia: ");
                    int valor = sc.nextInt();
                    sc.nextLine();     /* remoção realizada de acordo com  indice indicado da arraylist*/
                    list.remove(valor);
                    
                    break;
                    
            	case 6:     
            		
            		for(int i=0; i<list.size();i++){
            			
            			Jogadores a = list.get(i);
            			System.out.println("--------------------------------------------------");
            			System.out.println("Nome: " + a.getNome_jogador());
            			System.out.println("Camisa: " + a.getCamisa());
            			System.out.println("Idade: " + a.getIdade());
            			System.out.println("--------------------------------------------------");
            		}
            		
            		break;
            	case 7:
            		for(int i=0 ; i<list1.size();i++) {
            			Clube u1 = list1.get(i);
            			System.out.println("Nome do Clube: "+ u1.getNome_clube());
            			System.out.println("Treinador: " + u1.getTreinador());
            		}
                   break;
                   
                   default:
                	   System.out.println("Opção invalida!");
            	
            		
            		
            }
            
            
           
            
            
    		
    	}while(op!=8);
    	
    	sc.close();
    }

}
